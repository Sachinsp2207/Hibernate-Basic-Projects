import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Police {
	private String name;
	@Id
	private int id;
	private int Encounter;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEncounter() {
		return Encounter;
	}
	public void setEncounter(int encounter) {
		Encounter = encounter;
	}
}
