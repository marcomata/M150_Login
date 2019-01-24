package com.mata.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Autor: Marco Mata
 * Description: this Controller tells the application to open the login.html file
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String login(){
        return "login";
    }

}
