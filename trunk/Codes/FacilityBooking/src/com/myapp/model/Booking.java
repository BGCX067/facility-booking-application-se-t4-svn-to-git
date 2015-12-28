package com.myapp.model;

import java.util.Date;

public class Booking {
	
	private int bookingId;
	private String email;
	private String roomId;
	private Date startDateTime;
	private Date endDateTime;
	private String purpose;
	private Date toTerminate;
	private String recurring;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Date getToTerminate() {
		return toTerminate;
	}
	public void setToTerminate(Date toTerminate) {
		this.toTerminate = toTerminate;
	}
	public String getRecurring() {
		return recurring;
	}
	public void setType(String recurring) {
		this.recurring = recurring;
	}
	
}
