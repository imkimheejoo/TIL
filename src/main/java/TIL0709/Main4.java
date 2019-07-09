package TIL0709;

import TIL0705.Apple;

import java.awt.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main4 {
    public static void main(String[] args) {
        //생성자의 인수가 없는경우
        Supplier<Article> supplier = Article::new;
        Article article = supplier.get();
        System.out.println(article.getA());

        //생성자의 인수가 하나인 경우
                //입력값,결과값
        Function<String , Book> f = Book::new;
        Book book = f.apply("book");
        System.out.println(book.getName());


        //생성자의 인수가 두개인 경우
                    //인수1,인수2,결과값
        BiFunction<String,Integer,Apple> bf = Apple::new;
        Apple apple = bf.apply("red",150);
        System.out.println(apple.getColor()+","+apple.getWeight());


        //생성자의 인수가 세개인 경우 -> 직접 함수형인터페이스 만들어야 함
        TriFunction<Integer,Integer,Integer, Color> colorFactory = Color::new;

    }


}
