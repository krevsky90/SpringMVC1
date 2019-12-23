package app;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
//@RequestMapping("/index")
public class Controller {
//    @RequestMapping(method = RequestMethod.GET)
//    or
    @GetMapping("/")
    public String getView(ModelMap model) {
        model.addAttribute("message", "Info");
        //should return name of view-file (index.jsp in our case)
        return "index";
    }

}
