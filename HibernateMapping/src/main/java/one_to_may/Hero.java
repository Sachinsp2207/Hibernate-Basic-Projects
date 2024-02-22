package one_to_may;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hero {
	
	@Id
	private int id;
	private String name;
	private int age;
	@OneToMany
	private List<Movie>m;
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
	public List<Movie> getM() {
		return m;
	}
	public void setM(List<Movie> m) {
		this.m = m;
	}
	
}
