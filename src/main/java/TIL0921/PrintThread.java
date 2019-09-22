package TIL0921;

public class PrintThread extends Thread {
    public PrintThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for(int i = 0; i<2000000000; i++) {
            String line = 1 + 2 +"";
        }
        System.out.println(getName());
    }
}
