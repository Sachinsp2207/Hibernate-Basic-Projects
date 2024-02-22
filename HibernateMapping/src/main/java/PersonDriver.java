//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class PersonDriver {
//public static void main(String[] args) {
//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
//	EntityManager em=emf.createEntityManager();
//	EntityTransaction et=em.getTransaction();
//	
//	Person p=new Person();
//	p.setId(2);
//	p.setName("Shinde");
//	p.setAge(23);
//	
//	PanCard p1=new PanCard();
//	p1.setId(2);
//	p1.setPanid("GZSPP66");
//	p.setPan(p1);
//	
//	et.begin();
//	em.persist(p1);
//	em.persist(p);
//	et.commit();
//
//	System.out.println();
//	}
//}
