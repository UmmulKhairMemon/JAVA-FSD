package com.si.exception;

import org.springframework.stereotype.Service;

@Service
public class UserNotFoundException extends RuntimeException {
	 private static final long serialVersionUID = 1L;
}