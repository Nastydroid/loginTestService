package com.example.MobilehelpDesk.Controller;

import com.example.MobilehelpDesk.Model.User;
import com.example.MobilehelpDesk.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mobile")
public class LoginController {

    @CrossOrigin(origins = "http://localhost:8080") // allow cors for this endpoint
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Validate the user
        boolean isValidUser = UserRepository.validateUser(user.getUsername(), user.getPassword());

        if (isValidUser) {
            return "Login successful!";

        } else {
            return "Invalid username or password.";
        }
    }
}

