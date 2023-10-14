package com.inventory.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class BensConsultaDTO implements Serializable {
	
	private static final long serialVersionUID = -8013782977153528406L;
	
	private Long id;
	private String nome;
	private Date dataInclusao;
	private String descricao;
	
	public BensConsultaDTO() { }	
	
	public BensConsultaDTO(Long id, String nome, Date dataInclusao, String descricao) {
		
		this.id = id;
		this.nome = nome;
		this.dataInclusao = dataInclusao;
		this.descricao = descricao;
	}
	
}
