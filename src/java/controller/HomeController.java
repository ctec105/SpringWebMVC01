package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home.htm")
    public ModelAndView home() {
        // ModelAndView, permite renderizar vistas
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home"); // la vista asociada al método
        return mav;
    }

    @RequestMapping("/nosotros.htm")
    public ModelAndView nosotros() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("nosotros");
        return mav;
    }
}
