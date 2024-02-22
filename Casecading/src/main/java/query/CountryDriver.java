//package query;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//import net.bytebuddy.matcher.CollectionItemMatcher;
//public class CountryDriver {
//	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Pawar");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		
//		Country c1=new Country();
//		c1.setId(1);
//		c1.setName("India");
//		c1.setPm("Narendra Modi");
//		
//		Country c2=new Country();
//		c2.setId(2);
//		c2.setName("NewZealand");
//		c2.setPm("Smith");
		
//		Country c3=new Country();
//		c3.setId(3);
//		c3.setName("China");
//		c3.setPm("ShangChii");
		
//		Country c4=new Country();
//		c4.setId(4);
//		c4.setName("UK");
//		c4.setPm("Rushi  Sunak");
//		
//		et.begin();
////		em.persist(c1);
////		em.persist(c2);
////		em.persist(c3);
//		em.persist(c4);
//		et.commit();
//	}
//
//}
