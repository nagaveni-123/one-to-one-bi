import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class MobileSimGet {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Mobile m=entityManager.find(Mobile.class, 1);
		System.out.println(m.getId());
		System.out.println(m.getCost());
		System.out.println(m.getName());
		List<Sim> sim=m.getSim();
		for(Sim s:sim) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getProvider());
			
		}
		
		
	}

}
