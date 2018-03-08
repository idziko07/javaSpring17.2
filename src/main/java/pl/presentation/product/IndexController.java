package pl.presentation.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public void index(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        for (Category category : Category.values()) {
            writer.println("Wyświetl produkty <a href =" + category.toString() + "> " + category.name() + "</a><br>");
        }
    }


}
