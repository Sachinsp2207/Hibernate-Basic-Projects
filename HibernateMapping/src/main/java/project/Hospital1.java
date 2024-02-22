package project;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital1 {
	@Id
	private int id;
	private String name;
	private String ceo;
	@OneToMany
	List<Branches>branch=new ArrayList<Branches>();
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
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public List<Branches> getBranch() {
		return branch;
	}
	public void setBranch(List<Branches> branch) {
		this.branch = branch;
	}
	
}
