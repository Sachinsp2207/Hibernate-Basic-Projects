//import java.util.Scanner;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class StudentDriver {
//	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");//creates  table in db.
//		EntityManager em=emf.createEntityManager();//performing crud operation in table  save,udate,delete get..
//		EntityTransaction et=em.getTransaction();	// 
//		Scanner sc=new Scanner (System.in);
//		//Note: object of entity Class considered as data.
//		System.out.println("Enter the No of Row");
//		int row=sc.nextInt();	
//		while(row>0)
//		{
//			Student s=new Student();
//			System.out.println("Enter ID");
//			s.setId(sc.nextInt());
//			System.out.println("Enter Name");
//			s.setName(sc.next());
//			System.out.println("Enter Cont");
//			s.setCont(sc.nextLong());
//			System.out.println("Enter Age");
//			s.setAge(sc.nextInt());
//			row--;
//			et.begin();
//			em.persist(s);
//			et.commit();
//			System.out.println("Data Saved..!");
//		}
//			System.out.println("All Data Saved...!!");
//	}
//
//}
