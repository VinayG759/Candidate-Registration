package com.achiever.candidate_registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @GetMapping("/home")
    public String home() {
        return "home-select";
    }

    // Admin
    @GetMapping("/admin/login")
    public String adminLoginPage() {
        return "admin-login";
    }

    @PostMapping("/admin/login/process")
    public String adminLogin(@RequestParam String username,
                             @RequestParam String password) {

        if(username.equals("admin") && password.equals("admin123")) {
            return "redirect:/candidates/list";
        }
        return "redirect:/admin/login?error=true";
    }

    // User
    @GetMapping("/user/login")
    public String userLoginPage() {
        return "user-login";
    }

    @PostMapping("/user/login/process")
    public String userLogin(@RequestParam String username,
                            @RequestParam String password) {

        if(username.equals("user") && password.equals("user123")) {
            return "redirect:/candidates/register";
        }
        return "redirect:/user/login?error=true";
    }
}
