package com.raissa.demo.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente {
    private Long idCliente;
    private String nome;
    private String cpf;
}
