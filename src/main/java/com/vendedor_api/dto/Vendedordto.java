package com.vendedor_api.dto;

import lombok.Data;

@Data
public class Vendedordto {
    private Integer idVendedor;
    private String nombre;
    private Integer telefono;
    private String correo;
    private Integer idUsuario;

}
