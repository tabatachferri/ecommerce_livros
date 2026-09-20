package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrocaController {

    @GetMapping("/troca")
    public String troca() {
        return "troca";
    }
}