import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class PersonPanDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			EntityManager em=emf.createEntityManager();
			Person p=new Person();
			Pan pan=new Pan();
			p.setName("Marish");
			p.setGender("Male");
			pan.setNumber("AeA123");
			pan.setType("Bussiness");
			//p.setPan(pan);
			pan.setPerson(p);			
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(p);
			em.persist(pan);
			et.commit();
			

		}

	}


