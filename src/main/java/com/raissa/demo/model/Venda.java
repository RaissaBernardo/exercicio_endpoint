package com.raissa.demo.model;

import lombok.*;

import java.text.DateFormat;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor //construtor com tds os atributos
@NoArgsConstructor //construtor padrao
@ToString

public class Venda {
    private Long idVenda;
    private DateFormat dataVenda;
    private List<Produto> produtos;
    private Cliente cliente;
}
