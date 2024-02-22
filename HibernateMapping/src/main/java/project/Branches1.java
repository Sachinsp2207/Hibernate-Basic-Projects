package project;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Branches1{
	@Id
	private int id;
	private String name;
	private String man;
	List<Address>add=new ArrayList<Address>();
	
}
