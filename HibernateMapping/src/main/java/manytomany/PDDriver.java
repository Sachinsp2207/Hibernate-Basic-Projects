//package manytomany;
//import java.util.*;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class PDDriver {
//	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		
//		Patient p1=new Patient();
//		p1.setAge(22);
//		p1.setId(1);
//		p1.setName("Swapnil");
//		p1.setBG("B-");
//		
//		Patient p2=new Patient();
//		p2.setAge(23);
//		p2.setId(2);
//		p2.setName("Prathamesh");
//		p2.setBG("AB+");
//		
//		Disease d1=new Disease();
//		d1.setId(1);
//		d1.setName("Ashtama");
//		d1.setSymo("Suffocation");
//		
//		
//		Disease d2=new Disease();
//		d1.setId(2);
//		d1.setName("Cancer");
//		d1.setSymo("All Body Drained");
//		
//		
//		List<Disease>D=new ArrayList<Disease>();
//		D.add(d1);
//		D.add(d2);
//		
//		
//		
//		List<Patient>P=new ArrayList<Patient>();
//		P.add(p1);
//		P.add(p2);
//	}
//
//}
