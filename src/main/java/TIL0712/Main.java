package TIL0712;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Article article = new Article("title","contents", Arrays.asList("aa"));
        Article newArticle = Article.copy(article);
        Article cloneArticle = (Article)article.clone();
        newArticle.setTitle("new title");
        cloneArticle.setTitle("clone title");

        System.out.println("article Title: "+article.getTitle()+" contents: "+article.getContents());
        System.out.println("new article Title: "+newArticle.getTitle()+" contents: "+newArticle.getContents());
        System.out.println("clone Title: "+cloneArticle.getTitle()+" contents2: "+cloneArticle.getContents());

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> newNumbers = new ArrayList<>();
        newNumbers.addAll(numbers);
        newNumbers.add(6);
        List<Integer> newArrayNumbers = new ArrayList<>(newNumbers);
//        List<Integer> cloneArray = (ArrayList<Integer>) newNumbers.clone();   implements Cloneable을 하지 않았기 때문에 안됨
        newArrayNumbers.add(7);

        System.out.println(numbers.toString());
        System.out.println(newNumbers.toString());
        System.out.println(newArrayNumbers.toString());

    }
}
