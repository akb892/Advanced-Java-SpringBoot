package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
//	@Value("${city}")
	private String city;
//	@Value("${country}")
	private String country;
//	@Value("${zip}")
	private long zip;
	
	
	public Address() {
		
	}
	
	
	
	public Address(String city, String country, long zip) {
		super();
		this.city = city;
		this.country = country;
		this.zip = zip;
	}



	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", zip=" + zip + "]";
	}
	
	
	
}
