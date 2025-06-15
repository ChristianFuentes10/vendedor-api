package com.vendedor_api.models;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "vendedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendedorModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private Integer idVendedor;

    private String nombre;
    private Integer telefono;
    private String correo;
    private Integer idUsuario;
}



