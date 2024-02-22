//package query;
//import java.util.*;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//
//public class FetchData {
//public static void main(String[] args) {
//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Pawar");
//	EntityManager em=emf.createEntityManager();
//	EntityTransaction et=em.getTransaction();
//	System.out.println("===================================================");
//	Query qu = em.createQuery("Select z  from Country z");
//	@SuppressWarnings("unchecked")
//	List<Country>list= qu.getResultList();
//	for(Country country:list )
//	{
//		System.out.println(country.getId());
//		System.out.println(country.getName());
//		System.out.println(country.getPm());
//		System.out.println("============================================================================");
//	}
//	
//}
//}
