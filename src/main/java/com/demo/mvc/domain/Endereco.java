package com.demo.mvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@SuppressWarnings("serial")
@Entity (name = "endereco")
public class Endereco extends AbstractEntity<Long> {
	
	@Column (nullable = false)
	private String logradouro;
	
	@Column (nullable = false)
	private String bairro;
	
	@Column (nullable = false)
	private String cidade; 
	
	@Column (nullable = false, length = 2)
	@Enumerated (EnumType.STRING)
	private UF uf;
	
	@Column (nullable = false, length = 9)
	private String cep;
	
	@Column (nullable = false, length = 5)
	private int numero;
	
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
