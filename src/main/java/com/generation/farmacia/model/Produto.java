package com.generation.farmacia.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O atributo nome do produto é Obrigatório!") 
	@Size(min = 5, max = 100, message = "O atributo remedio deve conter no mínimo 05 e no máximo 100 caracteres")
	private String remedio;
	
	private float preco;
	
	@NotBlank(message = "O atributo receita necessaria é Obrigatório!") 
	@Size(min = 3, max = 3, message = "O atributo receita deve ser respondido com sim ou nao")
	private String receita;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	

    // Getters e Setters
    public Long getId() {
        return this.id;
    }

    

	public void setId(Long id) {
        this.id = id;
    }

    public String getRemedio() {
        return this.remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    

    public Categoria getCategoria() {
        return this.categoria;
    }

    public String getReceita() {
		return receita;
	}



	public void setReceita(String receita) {
		this.receita = receita;
	}



	public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
  
}

