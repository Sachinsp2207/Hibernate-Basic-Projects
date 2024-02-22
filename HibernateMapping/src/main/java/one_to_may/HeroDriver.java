package one_to_may;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HeroDriver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Hero h1=new Hero();
	h1.setId(1);
	h1.setName("Sushant");
	h1.setAge(30);
	
	
	Movie m1=new Movie();
	m1.setId(1);
	m1.setName("MS Dhoni");
	m1.setColl("10 cr");
	
	Movie m2=new Movie();
	m1.setId(2);
	m1.setName("Chichore");
	m1.setColl("15 cr");
	
	Hero h2=new Hero();
	h1.setId(2);
	h1.setName("Kartik");
	h1.setAge(30);
	
	Movie m3=new Movie();
	m1.setId(3);
	m1.setName("Love Aj Kal");
	m1.setColl("3 cr");

	Movie m4=new Movie();
	m1.setId(4);
	m1.setName("Lukka Chupi");
	m1.setColl("4 cr");
	
	List<Movie>m=new ArrayList<Movie>();
	m.add(m1);
	m.add(m2);
	m.add(m3);
	m.add(m4);
	
	et.begin();
	em.persist(h1);
	em.persist(h2);
	em.persist(m1);
	em.persist(m2);
	em.persist(m2);
	em.persist(m4);
	et.commit();
	
	
}
}
