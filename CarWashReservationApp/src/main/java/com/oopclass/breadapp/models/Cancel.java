package com.oopclass.breadapp.models;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OOP Class 20-21
 * @author Gerald Villaran
 */

@Entity
@Table(name = "reservations")
public class Cancel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private long id;
	
	private String first_name;
	private String last_name;
        private String middle_name;
	private LocalDate dor;
        private String service;
        private String payment_time;
        private LocalDate created_at;
        private LocalDate time_updated;
        private String late_customer;
        private String cancel;
        private String reason;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
        
        public String getMiddleName() {
		return middle_name;
	}

	public void setMiddleName(String middle_name) {
		this.middle_name = middle_name;
	}
        
	
	public LocalDate getDor() {
		return dor;
	}

	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
        
        public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
        
        public String getCancelAnswer() {
		return cancel;
	}

	public void setCancelAnswer(String cancel) {
		this.cancel = cancel;
	}
        
        public String getCancelReason() {
		return reason;
	}

	public void setCancelReason(String reason) {
		this.reason = reason;
	}
        
        public String getPaymentTime() {
		return payment_time;
	}

	public void setPaymentTime(String payment_time) {
		this.payment_time = payment_time;
	}
        
        public LocalDate getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(LocalDate created_at) {
		this.created_at = created_at;
	}
        
        public LocalDate getTimeUpdated() {
		return time_updated;
	}

	public void setTimeUpdated(LocalDate time_updated) {
		this.time_updated = time_updated;
	}
        
        public String getLateCustomer() {
		return late_customer;
	}

	public void setLateCustomer(String late_customer) {
		this.late_customer = late_customer;
	}
        
	

	@Override
	public String toString() {
		return "Cancel [id=" + id + ", firstName=" + first_name + ", lastName=" + last_name + ", middleName=" + middle_name + ", dor=" + dor + ", service=" + service + ", " + " , createdAt=" + created_at + ", timeUpdated=" + time_updated +"]";
	}

	
}
