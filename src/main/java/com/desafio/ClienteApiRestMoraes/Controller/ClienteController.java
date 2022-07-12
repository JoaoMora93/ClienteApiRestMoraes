package com.desafio.ClienteApiRestMoraes.Controller;


import com.desafio.ClienteApiRestMoraes.Model.Cliente;
import com.desafio.ClienteApiRestMoraes.Model.ClienteResponse;
import com.desafio.ClienteApiRestMoraes.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<ClienteResponse> mostrarClientes()
    {
        return clienteService.mostrarClientes();
    }

    @GetMapping("/{dni}")
    public ClienteResponse buscarPorDni(@PathVariable Long dni)
    {
        return clienteService.buscarPorDni(dni);
    }



}
