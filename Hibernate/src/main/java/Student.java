import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int Age;
	long cont;
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
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public long getCont() {
		return cont;
	}
	public void setCont(long cont) {
		this.cont = cont;
	}
	
}
