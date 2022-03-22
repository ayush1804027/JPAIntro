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

}