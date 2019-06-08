package TIL0607.sparkExample;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        staticFiles.location("/templates"); // ->src/resources/templates 에서 정적파일을 관리함
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
                "Get : Hi " + req.queryParams("name") + " 나이는" + req.queryParams("age") + "!"
        );

//        post("/hi", (req, res) ->
//                "Post : Hi " + req.queryParams("name") + " 나이는" + req.queryParams("age") + "!"
//        );

        // 이렇게 하면 굉장히 번거롭고 귀찮음
        //이를 보완하기 위해 등장한것이 template engine 이라는 도구
        /*
        post("/hi", (req, res) ->{
            return "<html>" +
                    "<body>"+
                "<h1>회원 가입 결과</h1>"+
                    "이름 : " +req.queryParams("name")+
                    "<br />"+
                    "<br />"+
                    "나이 : " +req.queryParams("age")+
                    "<br />"+
                    "<br />"+
                    "</body>"+
                    "</html>";
                }
        );
        */

        post("/hi", (req, res) -> {
                    Map<String, Object> model = new HashMap<>();
                    model.put("name", req.queryParams("name"));
                    model.put("age", req.queryParams("age"));

                    return render(model, "result.html");
                }
        );

    }

    //template engine 추가
    //이걸 이용해서 값을 html에 전달해 웹을 동적으로 만들 수 있음
    // 값을 전달하는 방법은 Map을 이용
    //template Path(어디로 보낼지)가 두번째 인자
    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }


}