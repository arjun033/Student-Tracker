package com.isu.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comment")
public class Comment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long commentId;
	@Column(name = "postedabout")
	@ManyToOne(fetch = FetchType.LAZY)
	private User postedAbout;
	@Column(name = "postedby")
	private User postedBy;
	@Column(name = "postedTime", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date postedTime;
	
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public User getPostedAbout() {
		return postedAbout;
	}
	public void setPostedAbout(User postedAbout) {
		this.postedAbout = postedAbout;
	}
	public User getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}
	public Date getPostedTime() {
		return postedTime;
	}
	public void setPostedTime(Date postedTime) {
		this.postedTime = postedTime;
	}
	
}
