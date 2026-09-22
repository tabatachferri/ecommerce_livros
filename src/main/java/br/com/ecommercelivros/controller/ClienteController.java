package br.com.ecommercelivros.controller;

import br.com.ecommercelivros.model.Cliente;
import br.com.ecommercelivros.repository.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // =====================================================
    // CONSULTAR CLIENTES
    // =====================================================

    @GetMapping("/clientes")
    public String consultarClientes(Model model) {

        model.addAttribute("clientes", clienteRepository.findAll());
        model.addAttribute("modo", "consultar");

        return "clientes";
    }


    // =====================================================
    // ALTERAR CLIENTES
    // =====================================================

    @GetMapping("/clientes/alterar")
    public String alterarClientes(Model model) {

        model.addAttribute("clientes", clienteRepository.findAll());
        model.addAttribute("modo", "alterar");

        return "clientes";
    }


    // =====================================================
    // INATIVAR / ATIVAR CLIENTES
    // =====================================================

    @GetMapping("/clientes/inativar")
    public String inativarClientes(Model model) {

        model.addAttribute("clientes", clienteRepository.findAll());
        model.addAttribute("modo", "inativar");

        return "clientes";
    }


    // =====================================================
    // CADASTRAR CLIENTE
    // =====================================================

    @PostMapping("/clientes/salvar")
    public String salvarCliente(@ModelAttribute Cliente cliente) {

        cliente.setAtivo(true);

        clienteRepository.save(cliente);

        return "redirect:/clientes";
    }


    // =====================================================
    // ABRIR FORMULÁRIO DE ALTERAÇÃO
    // =====================================================

    @GetMapping("/clientes/editar/{id}")
    public String editarCliente(@PathVariable Long id, Model model) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Cliente não encontrado"));

        model.addAttribute("cliente", cliente);

        return "alterar-cliente";
    }


    // =====================================================
    // SALVAR ALTERAÇÃO
    // =====================================================

    @PostMapping("/clientes/alterar")
    public String salvarAlteracao(@ModelAttribute Cliente cliente) {

        clienteRepository.save(cliente);

        return "redirect:/clientes/alterar";
    }


    // =====================================================
    // INATIVAR CLIENTE
    // =====================================================

    @GetMapping("/clientes/inativar/{id}")
    public String inativarCliente(@PathVariable Long id) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Cliente não encontrado"));

        cliente.setAtivo(false);

        clienteRepository.save(cliente);

        return "redirect:/clientes/inativar";
    }


    // =====================================================
    // ATIVAR CLIENTE
    // =====================================================

    @GetMapping("/clientes/ativar/{id}")
    public String ativarCliente(@PathVariable Long id) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Cliente não encontrado"));

        cliente.setAtivo(true);

        clienteRepository.save(cliente);

        return "redirect:/clientes/inativar";
    }
}