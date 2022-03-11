package com.si.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.si.entity.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

	
}
