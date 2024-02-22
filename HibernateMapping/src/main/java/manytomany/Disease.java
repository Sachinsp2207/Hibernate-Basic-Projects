package manytomany;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Disease {
@Id
int id;
String name;
String Symo;

@ManyToMany
List<Patient>patient=new ArrayList<Patient>();

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

public String getSymo() {
	return Symo;
}

public void setSymo(String symo) {
	Symo = symo;
}

public List<Patient> getPatient() {
	return patient;
}

public void setPatient(List<Patient> patient) {
	this.patient = patient;
}

}
