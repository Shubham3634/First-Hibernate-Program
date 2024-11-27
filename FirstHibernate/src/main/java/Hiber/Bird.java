package Hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bird {
	 
	@Id
	int id;
	String name;
	String color;
	String food;
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}

}
