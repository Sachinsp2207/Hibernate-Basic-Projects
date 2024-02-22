
package one_to_may;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	int id;

	String name;
	String country;
	@OneToMany
	List<Branch> branches;
	

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
