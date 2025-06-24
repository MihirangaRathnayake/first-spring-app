package hndse251f.firstspringapp.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @RequestMapping("/")
    public ModelAndView getHomePage(){
        String message = "Hello from Spring Boot";
        //Sharing Values fromcontroller to view
        ModelAndView model = new ModelAndView();
        model.addObject("message",message);
        model.setViewName("index.jsp");
        return model;
    }
    @RequestMapping("/about")
    public String getAboutPage(Model model){
        String message = "Hello from Model to about page! ";
        //Sharing values from controller to view
        model.addAttribute("message", message);
        return "about.jsp";
    }

    }

