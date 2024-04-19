package co.istad.springsecuritybasic.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestController {

    @PostMapping("/login")
    public String login(){
        return "You have successfully Login!!!";
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "You have successfully Sign Up!!!";
    }
}
