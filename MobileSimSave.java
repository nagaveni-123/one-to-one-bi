import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileSimSave {
	public static void main(String[] args) {
		List<Mobile> list1=new ArrayList();
		Mobile m=new Mobile();
		m.setName("Bavya");
		m.setCost(450);
		Sim s=new Sim();
		
		s.setName("vodafone");
		s.setProvider("vodafone");
		list1.add(m);
		s.setMobile(m);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    entityTransaction.begin();
	    entityManager.persist(m);
	    entityManager.persist(s);
	    entityTransaction.commit();
		
	}

}
