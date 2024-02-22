//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class ProductDiver {
//public static void main(String[] args) {
//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
//	EntityManager em=emf.createEntityManager();
//	EntityTransaction et=em.getTransaction();
//	
//	Product p=new Product();
//	
//	et.begin();
//	em.merge(p);//  update As well as insert the data 
//	et.commit();
//	Product p1=em.find(Product.class, 1);
//	System.out.println(p1);
//	
//}
//}
