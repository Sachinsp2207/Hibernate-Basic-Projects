import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletingData {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s=em.find(Student.class, 5);
	et.begin();
	em.remove(s);
	et.commit();
	System.out.println("Row Deleted");
	}
}
