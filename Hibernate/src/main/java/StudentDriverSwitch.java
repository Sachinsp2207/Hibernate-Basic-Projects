//import java.util.Scanner;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class StudentDriverSwitch {
//	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");//creates  table in db.
//		EntityManager em=emf.createEntityManager();//performing crud operation in table  save,udate,delete get..
//		EntityTransaction et=em.getTransaction();	// 
//		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter The Case Id for Insert Data Enter 1 or For Find Data enter 2");
//		int a=sc.nextInt();
//		
//		switch(a)
//		{
//		case 1:
//			System.out.println("Enter The No of Row You Want to insert.!");
//			int row=sc.nextInt();	
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
//	
//		}
//		break;
//		case 2:
//			System.out.println("Enter the Id For Fetch The Data");
//			int id=sc.nextInt();
//			Student st=em.find(Student.class,id );
//
//			System.out.println(st.getId());
//			System.out.println(st.getAge());
//			System.out.println(st.getName());
//			System.out.println(st.getCont());
//			break;
//		default:System.out.println(" Please Enter Valid Switch Case..!!");
//		}
//	}
//}
