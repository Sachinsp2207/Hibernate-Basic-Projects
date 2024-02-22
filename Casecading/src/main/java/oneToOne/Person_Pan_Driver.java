//package oneToOne;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Person_Pan_Driver {
//	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Pawar");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		
//		
//		Person person=new Person();
//		person.setId(1);
//		person.setName("Akash");
//		person.setAge(22);
//		
//		
//		Pancard pan=new Pancard();
//		pan.setId(1);
//		pan.setPanno("GZSPP4455T");
//		pan.setAdd("Maha");
//
//		
//		person.setPan(pan);
//		
//		et.begin();
//		em.persist(person);
//		et.commit();
//	}
//}
