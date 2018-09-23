package rest.call.actions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {

    @GetMapping("/")
    public String defaultCall(ModelMap model){
        model.put("name","Sneha");
        return "login";
    }
}
