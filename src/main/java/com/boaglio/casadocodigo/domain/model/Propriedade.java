package com.boaglio.casadocodigo.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Propriedade {

	@Id
	@EqualsAndHashCode.Include
	private	String	nome;
	private	String	valor;
	private	String	descricao;
	private	String	categoria;

}
