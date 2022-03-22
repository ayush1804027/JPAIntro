package feb18.maven.demo.jpa.dao;

import javax.persistence.EntityManager;

import feb18.maven.demo.jpa.entity.Author;

public class AuthorDao implements IAuthorDao {

	private EntityManager entityManager;

	public AuthorDao() {
		entityManager = JpaUtil.getEntityManager();
	}

	@Override
	public Author addAuthor(Author author) {
		entityManager.getTransaction().begin();
		entityManager.persist(author);
		entityManager.getTransaction().commit();
		return author;
	}

	@Override
	public Author updateAuthor(Author author) {
		return entityManager.merge(author);
	}

	@Override
	public Author deleteAuthor(Author author) {
		entityManager.remove(author);
		return author;
	}

	@Override
	public Author getAuthorById(int eid) {
		entityManager.getTransaction().begin();
		Author auth = entityManager.find(Author.class, eid);
		entityManager.getTransaction().commit();
		return auth;

	}

}
