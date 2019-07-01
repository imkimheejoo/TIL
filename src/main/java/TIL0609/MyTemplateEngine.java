package TIL0609;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;

public class MyTemplateEngine {
    public static void main(String[] args) {
        port(8080);

        get("helloworld", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("name", "pobi");
            return render(model, "/helloworld.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

}
