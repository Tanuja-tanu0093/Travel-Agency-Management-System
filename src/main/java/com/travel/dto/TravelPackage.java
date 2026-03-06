package com.travel.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "packages")
public class TravelPackage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String destination;
	private double price;
	private int duration;

	public TravelPackage() {
	}

	public TravelPackage(int id, String destination, double price, int duration) {
		this.id = id;
		this.destination = destination;
		this.price = price;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
