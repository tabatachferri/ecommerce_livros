package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivrosController {

    @GetMapping("/livros")
    public String livros() {
        return "livros";
    }
}