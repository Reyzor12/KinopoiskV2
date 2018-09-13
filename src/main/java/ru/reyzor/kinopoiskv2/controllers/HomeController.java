package ru.reyzor.kinopoiskv2.controllers;

//import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author reyzor
 * @version 1.0
 * @since 13.09.2018
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePane(/*Authentication authentication,*/ ModelMap modelMap, HttpServletRequest request) {
        /*if (authentication != null) {
            return "redirect:/";
        }*/
        if (request.getParameterMap().containsKey("error")) {
            modelMap.addAttribute("error", true);
        }
        return "index";
    }
}
