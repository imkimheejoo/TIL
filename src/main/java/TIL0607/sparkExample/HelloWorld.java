package TIL0607.sparkExample;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        //이름을 동적으로 값이 바뀌도록 전달 -> 콜론
        // /hello/heejoo로 요청하면 웹에 Hello heejoo! 이렇게 뜸
        get("/hello/:name", (req, res) ->
                "Hello " + req.params(":name") + "!"
        );

        // 주소에:name없이도 사용자가 서버에 데이터 전달하는 법은 ?name=heejoo
        get("/hello", (req, res) ->
                "Hello " + req.queryParams("name") + "!"
        );

        //값을 여러개 전달 -> hi?name=heejoo&age=24
        get("/hi", (req, res) ->
                "Hi " + req.queryParams("name") + " 나이는" + req.queryParams("age") + "!"
        );
    }


}