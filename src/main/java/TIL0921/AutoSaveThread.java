package TIL0921;

public class AutoSaveThread extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);     //1초가 지나면 InterruptedException을 호출해서 break만듬
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }

    private void save() {
        System.out.println("작업 내용을 저장함");
    }
}
