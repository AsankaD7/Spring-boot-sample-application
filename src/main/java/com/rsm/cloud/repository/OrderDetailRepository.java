package com.rsm.cloud.repository;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.querydsl.core.types.dsl.StringPath;
import com.rsm.cloud.models.OrderDetail;
import com.rsm.cloud.models.QOrderDetail;

public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetail, Long>,
QueryDslPredicateExecutor<OrderDetail>,QuerydslBinderCustomizer<QOrderDetail>{
	List<OrderDetail> findAllOrderDetailById(long id);

	public OrderDetail findAllByPIdAndQty(@Param("p")String pId,@Param("q")Integer qty);
	
	@Override
	default void customize(QuerydslBindings bindings, QOrderDetail root) {
		bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));    }
	
	
	
}
