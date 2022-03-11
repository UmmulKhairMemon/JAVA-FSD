package com.si.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.si.entity.*;

@Repository
public interface AuthenticationRepository extends CrudRepository<User, Integer> {

	public Optional<User> findUserByName(String name);
}
