package org.example.session15_b1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/")
    public String home() {
        return "Welcome to SmartRetail Hub Homepage";
    }
    @GetMapping("/public/product")
    public String getPublicProduct() {
        return "List of public products";
    }
    @GetMapping("/admin/orders")
    public String getAdminProduct() {
        return "List of all orders (ADMIN only)";
    }
    @GetMapping("/user/orders")
    public String userProfile() {
        return "User Profile Page";
    }

}
