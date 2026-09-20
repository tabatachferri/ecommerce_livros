package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminStatusController {

    @GetMapping("/admin/status")
    public String status() {
        return "admin-status";
    }
}