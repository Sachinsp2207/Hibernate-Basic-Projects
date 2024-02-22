//package query;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class UserDriver {
//		public static void main(String[] args) {
//			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Pawar");
//			EntityManager em=emf.createEntityManager();
//			EntityTransaction et=em.getTransaction();
//			
//			User u1=new User();
//			u1.setId(1);
//			u1.setName("Sachin");
//			u1.setEmail("sachinsp@gamil.com");
//			u1.setPass("Sachinsp@4");
//			
//			User u2=new User();
//			u2.setId(2);
//			u2.setName("Akash");
//			u2.setEmail("akashp@gamil.com");
//			u2.setPass("AkashPawar4187");
//			
//			User u3=new User();
//			u3.setId(3);
//			u3.setName("Harsh");
//			u3.setEmail("harshshinde@gamil.com");
//			u3.setPass("HArshShinde");
//			
//			User u4=new User();
//			u4.setId(4);
//			u4.setName("Mayur");
//			u4.setEmail("mayur44@gamil.com");
//			u4.setPass("MayurMM");
//			
//			et.begin();
//			em.persist(u1);
//			em.persist(u2);
//			em.persist(u3);
//			em.persist(u4);
//			et.commit();
//		}
//}
