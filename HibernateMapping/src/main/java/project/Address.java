package project;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
@Id
private int id;
private String loc;
private String lanmark;
private int pin;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public String getLanmark() {
	return lanmark;
}
public void setLanmark(String lanmark) {
	this.lanmark = lanmark;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}


}
