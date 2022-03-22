package feb18.maven.demo.jpa;

import feb18.maven.demo.jpa.dao.AuthorDao;
import feb18.maven.demo.jpa.entity.Author;



public class JpaDemo {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		AuthorDao dao = new AuthorDao();
//		Author a1 = new Author(102, "Vayyu", "Kumar", "Singh", "964456789");
//		Author a1 = new Author(103, "Bayyu", "Kumar", "Singh", "9894456789");
//		dao.addAuthor(a1);
//		a1.setPhoneNo("85461793");
//		dao.updateAuthor(a1);
		
		dao.deleteAuthor(dao.getAuthorById(101));
		
		
		System.out.println(dao.getAuthorById(103));
		
		System.out.println("End");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		System.out.println("Start");
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
//		EntityManager em = factory.createEntityManager();
//
////		Employee emp1 = new Employee(101, "Sonu", 50000);
////		Employee emp2 = new Employee(102, "Monu", 70000);
//		Employee emp3 = new Employee(103,"Gonu", 45000);
//
//		em.getTransaction().begin();
////		em.crea    SQL, JPQL, HQL
//
////    	em.persist(emp1); //insert
////    	em.persist(emp2);
////    	em.persist(emp3);
//		
//		emp3.setSalary(65000);
//		
//		em.merge(emp3);  //update
////		em.remove(emp3); // delete
//		Employee empData = em.find(Employee.class, 103); // select
//		em.getTransaction().commit();
//		//em.getTransaction().rollback();
//		System.out.println(empData.toString());
//		System.out.println("End");
//		
//
//	}
}
