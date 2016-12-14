package com.rsm.cloud.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="customer_order")
public class Order extends BaseModelObject{

	
	private static final long serialVersionUID = 1L;

	private String customerId;
	
	@OneToMany(mappedBy="order")
	private List<OrderDetail> orderDetails;
}
