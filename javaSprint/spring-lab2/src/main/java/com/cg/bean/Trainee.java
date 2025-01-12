package com.cg.bean;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int traineeId;
	private String name;
	private String domain;
	private String Location;
	
	public Trainee() {
		
	}

	public Trainee(String name, String domain, String location) {
		super();
		this.name = name;
		this.domain = domain;
		Location = location;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}
	
	
	
	
}
