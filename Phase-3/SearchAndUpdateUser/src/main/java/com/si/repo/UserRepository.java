package com.si.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.si.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	         public User findByName(String name);
}
