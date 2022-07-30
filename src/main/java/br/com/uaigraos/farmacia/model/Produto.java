package br.com.uaigraos.farmacia.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Locale;

@Entity
@Setter
@Getter
public class Produto {

    private String nome;
    private String principioAtivo;
    private LocalDateTime dataDoCadastro;
    private LocalDateTime dataDaUltimaAtualizacao;
    private Integer quantidadeEmEstoque;
    private TipoEnum tipo;
    private BigDecimal preco;
    private float taxaDeLucro;
}
