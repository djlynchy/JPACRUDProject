package com.skilldistillery.firearm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="firearm")
public class Firearm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	@Column(name="caliber")
	private String caliber;
	@Column(name="operation")
	private String operation;
	@Column(name="capacity")
	private String capacity;
	@Column(name="type")
	private String type;
	
	public Firearm() {
	}
		
		public Firearm(String name, String caliber, String operation, String capacity, String type) {
		super();
		this.name=name;
		this.caliber=caliber;
		this.operation=operation;
		this.type=type;
		this.capacity=capacity;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Firearm [id=").append(id).append(", name=").append(name).append(", caliber=").append(caliber)
		.append(", operation=").append(operation).append(", capacity=").append(capacity).append(", type=")
		.append(type).append("]");
		return builder.toString();
	}
}
