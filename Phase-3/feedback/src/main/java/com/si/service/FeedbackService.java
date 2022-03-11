package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.entity.Feedback;
import com.si.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepo;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepo.findAll();
	}
	
	public Feedback addNewFeedback(Feedback fb) {
		return feedbackRepo.save(fb);
	}
}
