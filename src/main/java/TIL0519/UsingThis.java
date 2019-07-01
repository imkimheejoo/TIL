package TIL0519;

public class UsingThis {
    public int outterField = 10;

    public class Inner {
        int innerField = 20;
        int outterField = 30;

        void method() {
            int innerField = 40;
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField: " + outterField);
                System.out.println("outterField: " + UsingThis.this.outterField + "\n");

                System.out.println("innerField: " + innerField);
                System.out.println("innerField: " + this.innerField + "\n");
            };
            fi.method();
        }

    }
}
