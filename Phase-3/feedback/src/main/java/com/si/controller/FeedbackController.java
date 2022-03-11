package com.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.entity.Feedback;
import com.si.service.FeedbackService;

@RestController
public class FeedbackController {

	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("/feedback")
	public Iterable<Feedback> getAllFeedbacks(){
		return feedbackService.GetAllFeedback();
	}
	
	
	@PostMapping(path="/feedback", consumes= {MediaType.APPLICATION_JSON_VALUE}) 
	public Feedback addNewFeedback(@RequestBody Feedback fb) {
		Feedback newFb = new Feedback(fb.getUser(), fb.getRating(),fb.getComments());
		feedbackService.addNewFeedback(newFb);
		return newFb;
	}
}
