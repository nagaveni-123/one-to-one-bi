import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeCharcySave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Bike b=new Bike();
		Charcy c=new Charcy();
		b.setName("Herohonda");
		b.setCost(25000);
		c.setType("dhghd");
			b.setCharcy(c);
				
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(b);
		em.persist(c);
		et.commit();
		
	}

}
