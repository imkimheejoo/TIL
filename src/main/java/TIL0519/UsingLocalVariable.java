package TIL0519;

public class UsingLocalVariable {
    void method(int arg){
        int localVar = 40;

        MyFunctionalInterface fi = () -> {
// 람다식에서는 메소드의 로컬변수 또는 매개변수는 final 그래서 수정이 안됨
//            arg = 31;  (X)
//            localVar = 41;   (X)
            System.out.println("arg:"+arg);
            System.out.println("localVar: " + localVar + "\n");
        };
        fi.method();
// 람다식 외부에서도 로컬변수와 매개변수는 변경이 안됨
//        localVar = 39;
//        arg = 39;
    }
}
