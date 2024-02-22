//package query;
//import java.util.*;
//import javax.persistence.*;
//
//
//public class LogInValidation {
//	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Pawar");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter The Mail");
//		String mail=s.next();
//		System.out.println("Enter The Pass");
//		String ps=s.next();
//		
//		Query q=em.createQuery("Select b from User b where b.email=?1 and b.Pass=?2");
//		q.setParameter(1, mail);
//		q.setParameter(2, ps);
//		
//		List<User>l1=q.getResultList();
//		 if (l1.size()>0) {
//			 System.out.println("Welcome");	
//		}
//		 else { System.out.println("Invalid Credentials");}
//		
//	}
//}
