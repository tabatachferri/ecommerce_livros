package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminGraficoController {

    @GetMapping("/admin/grafico")
    public String grafico() {
        return "admin-grafico";
    }
}