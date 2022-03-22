package feb18.maven.demo.jpa.dao;

import feb18.maven.demo.jpa.entity.Author;

public interface IAuthorDao {
	
	public abstract Author addAuthor(Author Author);

	public abstract Author updateAuthor(Author Author);

	public abstract Author deleteAuthor(Author Author);

	public abstract Author getAuthorById(int eid);


	

}
