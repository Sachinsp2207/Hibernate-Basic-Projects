//import java.util.Scanner;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class PoliceDriver {
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
//			Police s=new Police();
//			System.out.println("Enter Name of Policeman");
//			s.setName(sc.next());
//			System.out.println("Enter Id of Police");
//			s.setId(sc.nextInt());
//			System.out.println("Enter The no of Encounter..");
//			s.setEncounter(sc.nextInt());
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
//
//
//
