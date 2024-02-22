package project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patients {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String gen;
	private String bg;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}
	
	
}
