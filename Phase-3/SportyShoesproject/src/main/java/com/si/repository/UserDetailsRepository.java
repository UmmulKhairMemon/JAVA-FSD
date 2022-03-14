package com.si.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.entity.*;



@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	

	public List<UserDetails> findByusername(String username);
}