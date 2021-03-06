package com.digiteix.models;

import java.io.Serializable;

public class TypeShop implements Serializable {

	private int id;
	private String name;
	private String description;
	private String status;
	private String icon;

	public TypeShop(int id, String name, String description, String status, String icon) {
		super();
		this.id = id;
		this.name = name;
		this.setDescription(description);
		this.status = status;
		this.icon = icon;
	}

	public TypeShop() {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
