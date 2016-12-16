package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
		
		Optional<User> findByUsername(String username);
}
