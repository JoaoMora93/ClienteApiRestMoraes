package com.desafio.ClienteApiRestMoraes.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Column(name = "DNI")
    @Id
    private Long dni;
    @Column(name = "NOMBRE")
    private String Nombre;
    @Column(name="APELLIDO")
    private String Apellido;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHADENACIMIENTO")
    private java.util.Date FechaDeNacimiento;

    //Constructor

    public Cliente() {
    }

    public Cliente(Long dni, String nombre, String apellido, Date fechaDeNacimiento)
    {
        this.dni = dni;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.FechaDeNacimiento = fechaDeNacimiento;
    }

    //Getters y Setters

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public java.util.Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }
}
