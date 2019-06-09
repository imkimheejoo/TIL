package TIL0609;

import static spark.Spark.get;
import static spark.Spark.port;

public class HelloWorld {
    public static void main(String[] args) {
//        port(8080);

        get("/helloworld",(req,res)->{
            return "Hello World";
        });
    }
}
