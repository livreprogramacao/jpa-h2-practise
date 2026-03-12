package com.concretepage;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@EntityListeners(UserListener.class)
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	public User() {}
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
