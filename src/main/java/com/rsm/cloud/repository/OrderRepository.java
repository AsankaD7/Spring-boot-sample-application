package com.rsm.cloud.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rsm.cloud.models.Order;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, Long>{
	
	List<Order> findAllOrderById(long id);
	
	public Order findFirstOrderByCustomerId(@Param("n")String cId); 
}
