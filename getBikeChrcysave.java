import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class getBikeChrcysave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Bike b=entityManager.find(Bike.class, 1);
		System.out.println(b.getId()+" "+b.getName()+" "+b.getCost());
		Charcy c=entityManager.find(Charcy.class, 1);
		System.out.println(c.getId());
		System.out.println(c.getType());
		
	}

}
