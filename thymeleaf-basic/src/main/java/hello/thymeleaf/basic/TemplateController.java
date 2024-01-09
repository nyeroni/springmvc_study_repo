package hello.thymeleaf.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TemplateController {

    @GetMapping("/fragment")
    public String template(){
        return "template/fragment/fragmentMain";
    }
    @GetMapping("/layout")
    public String layout(){
        return "template/layout/layoutMain";
    }
}