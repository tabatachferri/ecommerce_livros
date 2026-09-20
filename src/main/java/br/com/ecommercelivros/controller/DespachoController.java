package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DespachoController {

    @GetMapping("/despacho")
    public String despacho() {
        return "despacho";
    }
}