package tourshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by vic on 08.12.16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String mainPage() {
        return "content/user";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage() {
        return "content/admin";
    }

    @RequestMapping(value = {"/", "login"}, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value="error", required = false) String error) {

        ModelAndView modelAndView = new ModelAndView();
        if(error != null) {
            modelAndView.addObject("error", "invalid username or password");
        }
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
