package manytomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
@Id
int id;
String name;
String BG;
int age;

@ManyToMany
List<Disease> disease=new ArrayList<Disease>();

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

public String getBG() {
	return BG;
}

public void setBG(String bG) {
	BG = bG;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public List<Disease> getDisease() {
	return disease;
}

public void setDisease(List<Disease> disease) {
	this.disease = disease;
}

}
