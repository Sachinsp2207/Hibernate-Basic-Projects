import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String Brand;
	private int Warranty ;
	private double proice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getWarranty() {
		return Warranty;
	}
	public void setWarranty(int warranty) {
		Warranty = warranty;
	}
	public double getProice() {
		return proice;
	}
	public void setProice(double proice) {
		this.proice = proice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Brand=" + Brand + ", Warranty=" + Warranty + ", proice=" + proice + "]";
	}
	
	
}
