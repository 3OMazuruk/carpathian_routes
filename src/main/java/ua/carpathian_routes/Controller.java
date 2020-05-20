package ua.carpathian_routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Controller {

    @GetMapping("/hello")
    public Artical getInfo(){
        Artical artical = new Artical();
        artical.setId(90);
        artical.setName("Петрос");
        artical.setTitle("Петрос - Кваси - Ясіня");
        artical.setDescr("Тут буде опис");
        artical.setTags(Arrays.asList("Кваси","Петрос","Ясіня", "Hiking"));

        return artical;
    }

}
