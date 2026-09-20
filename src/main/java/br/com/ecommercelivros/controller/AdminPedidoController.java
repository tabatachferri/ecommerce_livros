package br.com.ecommercelivros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPedidoController {

    @GetMapping("/admin/pedidos")
    public String pedidos() {
        return "admin-pedidos";
    }
}