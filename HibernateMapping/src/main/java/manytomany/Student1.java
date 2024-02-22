package manytomany;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student1 {
	@Id
	int id;
	@Column(nullable = false)
	String name;
	int yop;
	int age;
	@Column(unique = true)
	long cont;
	 @ManyToMany
	 List<Coarse>Coarses=new ArrayList<Coarse>();
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
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getCont() {
		return cont;
	}
	public void setCont(long cont) {
		this.cont = cont;
	}
	public ArrayList<Coarse> getC() {
		return (ArrayList<Coarse>) Coarses;
	}
	public void setC(List<Coarse> cr) {
		this.Coarses = cr;
	}
	 
	 
}
