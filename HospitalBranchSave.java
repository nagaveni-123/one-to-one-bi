import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalBranchSave {

	public static void main(String[] args) {
    Hospital hospital=new Hospital();
     hospital.setName("KMC Attavra");
     hospital.setWebsite("ww.manipal.com");
     Branch branch=new Branch();
     branch.setCity("Managlore");
     branch.setLocation("Near attavara DMART");
     List<Hospital> list=new ArrayList();
     list.add(hospital);
     branch.setHospital(hospital);
     EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
     EntityManager entityManager=entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction=entityManager.getTransaction();
     entityTransaction.begin();
     entityManager.persist(hospital);
     entityManager.persist(branch);
     entityTransaction.commit();
     

	}

}
