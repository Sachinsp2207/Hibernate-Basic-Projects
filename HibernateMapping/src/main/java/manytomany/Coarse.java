package manytomany;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Coarse {
	@Id
	int id;
	String name;
	int duration;
	
	@ManyToMany
	ArrayList<Student1>Stud=new ArrayList<Student1>();

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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public ArrayList<Student1> getS() {
		return Stud;
	}

	public void setS(List<Student1> students) {
		this.Stud = (ArrayList<Student1>) students;
	}
	
}
