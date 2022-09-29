import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetHospitalDetails {
		public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
			//Hospital h1=entityManager.find(Hospital.class, 1);
			Branch b=entityManager.find(Branch.class, 1);
			System.out.println(b);
	
	}
}
