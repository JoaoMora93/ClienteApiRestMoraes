package com.desafio.ClienteApiRestMoraes.Service;

import com.desafio.ClienteApiRestMoraes.Model.Cliente;
import com.desafio.ClienteApiRestMoraes.Model.ClienteResponse;

import java.sql.Date;
import java.util.List;

public interface ClienteService {

    ClienteResponse buscarPorDni(Long dni);
    List<ClienteResponse>   mostrarClientes();

    Integer CalcularEdad (Cliente cliente);
}
