import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PanCard {

	@Id
	private int id;
	private String panid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanid() {
		return panid;
	}
	public void setPanid(String panid) {
		this.panid = panid;
	}
	
}
