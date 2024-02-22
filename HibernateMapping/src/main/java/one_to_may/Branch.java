package one_to_may;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
@Id
 int id;
 String Loc;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLoc() {
	return Loc;
}
public void setLoc(String loc) {
	Loc = loc;
}
 
}
