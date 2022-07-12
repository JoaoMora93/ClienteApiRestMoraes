package com.desafio.ClienteApiRestMoraes.Service;

import com.desafio.ClienteApiRestMoraes.Model.Cliente;
import com.desafio.ClienteApiRestMoraes.Model.ClienteResponse;
import com.desafio.ClienteApiRestMoraes.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    List<ClienteResponse> listaParaMostrar = new ArrayList<>();

    @Override
    public ClienteResponse buscarPorDni(Long dni)
    {
        Cliente cliente = clienteRepository.findById(dni).orElse(null);
        Integer edad=CalcularEdad(cliente);
        ClienteResponse clienteAMostrar= new ClienteResponse(cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
        return clienteAMostrar;
    }
    @Override
    public List<ClienteResponse> mostrarClientes()
    {
        List<Cliente> listaCliente=clienteRepository.findAll();
        Integer largoLista=listaCliente.size();
        for(int i=0; i<=largoLista-1;i++){
            Cliente cliente=listaCliente.get(i);
            Integer edad = CalcularEdad(cliente);
            ClienteResponse clienteAMostrar= new ClienteResponse(cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
            listaParaMostrar.add(clienteAMostrar);
        }
        return listaParaMostrar;
    }

    @Override
    public Integer CalcularEdad(Cliente cliente) {
        LocalDate fechaNueva = cliente.getFechaDeNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period edad = Period.between(fechaNueva, LocalDate.now());
        return edad.getYears();
    }
}

