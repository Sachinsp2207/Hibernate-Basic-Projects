package project;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branches {
	@Id
	private int id;
	private String name;
	private String man;
	@OneToMany
	List<Hospital1>hos=new ArrayList<Hospital1>();
	
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
	public String getMan() {
		return man;
	}
	public void setMan(String man) {
		this.man = man;
	}
	
	
}
