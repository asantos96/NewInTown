package NewInTown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewInTownController {

    @RequestMapping( "/")
    public String loadPage(){
        return "home";
    }
}
