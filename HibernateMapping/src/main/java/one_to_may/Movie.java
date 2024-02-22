package one_to_may;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int id;
	private String name;
	private String coll;
	public String getColl() {
		return coll;
	}
	public void setColl(String coll) {
		this.coll = coll;
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
	}

