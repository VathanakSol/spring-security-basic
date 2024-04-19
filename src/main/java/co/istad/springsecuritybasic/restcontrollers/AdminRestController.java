package co.istad.springsecuritybasic.restcontrollers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/admins")
public class AdminRestController {

    @GetMapping
    public String getAllUsers(){
        return "These are all the users!";
    }

    @PostMapping("/create")
    public String createUser(){
        return "Create user successfully!";
    }

    @PatchMapping("/update/{id}")
    public String updateUser(@PathVariable int id){
        return "Update user " + id + " successfully!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return "Delete the user with id " + id + " successfully";
    }
}
