package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping("/clientes")
    public String clientes() {
        return "clientes";
    }

    @GetMapping("/clientes/alterar/{id}")
    public String alterarCliente() {
        return "alterar-cliente";
    }
    @GetMapping("/clientes/inativar/{id}")
    public String inativarCliente() {
        return "inativar-cliente";
    }
}