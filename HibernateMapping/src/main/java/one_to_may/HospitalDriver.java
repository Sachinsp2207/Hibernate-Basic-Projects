package one_to_may;
import java.util.*;
import java.net.CookieManager;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import antlr.collections.List;

public class HospitalDriver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Hospital h1=new Hospital();
	h1.setId(123);
	h1.setName("Appolo");
	h1.setCountry("India");
	
	Branch b1=new Branch();
	b1.setId(1);
	b1.setLoc("Nashik");
	
	Branch b2=new Branch();
	b2.setId(2);
	b2.setLoc("Pune");
	
	Branch b3=new Branch();
	b3.setId(3);
	b3.setLoc("Mumbai");
	
	ArrayList<Branch>branches= new ArrayList<Branch>();
	branches.add(b1);
	branches.add(b2);
	branches.add(b3);
	
	et.begin();
	em.persist(h1);
	em.persist(b1);
	em.persist(b2);
	em.persist(b3);
	et.commit();
	
}
}
