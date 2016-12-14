package com.rsm.cloud.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderDetail extends BaseModelObject {

	
	private static final long serialVersionUID = 1L;

	private int qty;
	
	private String pId;
	
	@ManyToOne
	private Order order;
	
}
