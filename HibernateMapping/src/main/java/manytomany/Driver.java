package manytomany;
import java.util.*;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sachin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student1 s1=new Student1();
	s1.setId(1);
	s1.setName("Sachin");
	s1.setYop(2022);
	s1.setAge(22);
	s1.setCont(8530939218l);
	
	Student1 s2=new Student1();
	s2.setId(2);
	s2.setName("Akash");
	s2.setYop(2022);
	s2.setAge(21);
	s2.setCont(8530939216l);
	
	Student1 s3=new Student1();
	s3.setId(3);
	s3.setName("Mayur");
	s3.setYop(2022);
	s3.setAge(23);
	s3.setCont(8530939215l);
	
	
	Coarse c1=new Coarse();
	c1.setId(1);
	c1.setName("Java");
	c1.setDuration(4);
	
	Coarse c2=new Coarse();
	c2.setId(2);
	c2.setName("Sql");
	c2.setDuration(3);
	
	Coarse c3=new Coarse();
	c3.setId(3);
	c3.setName("J2EE");
	c3.setDuration(1);
	
	List<Coarse>cr=new ArrayList<Coarse>();
	cr.add(c1);
	cr.add(c2);
	cr.add(c3);
	
	
	s1.setC(cr);
	s2.setC(cr);
	s3.setC(cr);
	
	List<Coarse>cr2=new ArrayList<Coarse>();
	cr2.add(c1);
	cr2.add(c2);
	
	
	List<Student1>students=new ArrayList<Student1>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	
	c1.setS(students);
	c2.setS(students);
	c3.setS(students);
	
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	em.persist(c1);
	em.persist(c2);
	em.persist(c3);
	et.commit();
}
}
