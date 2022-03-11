package com.si.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="uname")
	private String user;
	
	@Column(name="ratings")
	private int rating;
	
	@Column(name="message")
	private String comments;

	public Feedback(String user, int rating, String comments) {
		super();
		this.user = user;
		this.rating = rating;
		this.comments = comments;
	}

	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", user=" + user + ", rating=" + rating + ", comments=" + comments + "]";
	}

	
}