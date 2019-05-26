package com.shop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Stoc {

	@Id
	private long Id;
	
	private Integer stoc;
	
	@OneToOne(mappedBy="stoc")
	@JsonIgnore
	private Product product;
	
}
