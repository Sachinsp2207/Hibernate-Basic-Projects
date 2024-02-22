package manytomany;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class B_ADriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Book b1=new Book();
		b1.setId(1);
		b1.setTitle("Design Engineering");
		b1.setPages(500);
		

		Book b2=new Book();
		b1.setId(2);
		b1.setTitle("Industrial Engineering");
		b1.setPages(200);
		
		Author a1=new Author();
		a1.setId(1);
		a1.setName("MM Rathore");
		a1.setAward(5);
		
		Author a2=new Author();
		a1.setId(2);
		a1.setName("RC Patil");
		a1.setAward(4);
		
		List<Author>A=new ArrayList<Author>();
		A.add(a1);
		A.add(a2);
		
		b1.setAuthor(A);
		b2.setAuthor(A);
		
		
		List<Book>B=new ArrayList<Book>();
		B.add(b1);
		B.add(b2);
		
		b1.setAuthor(A);
		b1.setAuthor(A);
		
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(b1);
		em.persist(b2);
		et.commit();
	}
}
