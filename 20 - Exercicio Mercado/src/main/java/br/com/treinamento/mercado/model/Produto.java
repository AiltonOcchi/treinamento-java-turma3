package br.com.treinamento.mercado.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Produto {

    @Getter @Setter
    private String nome;
    
    @Getter @Setter
    private BigDecimal preco;

}
