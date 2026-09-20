package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnderecoController {

    @GetMapping("/endereco")
    public String endereco() {
        return "endereco";
    }
}