package TIL0921;

public class ThreadExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            Thread thread = new PrintThread("thread " + i);

            if(i != 10) {
                thread.setPriority(i);
            }
            else{
                thread.setPriority(10);
            }

            thread.start();
        }
    }
}
