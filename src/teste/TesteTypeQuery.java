package teste;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import k19_JPQL.Autor;

public class TesteTypeQuery {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<Autor> query = manager.createNamedQuery("Autor.findAll", Autor.class);
		List<Autor> autores = query.getResultList();
		
		for(Autor autor : autores){
			System.out.println("Autor: " + autor.getNome());
		}
	}

}
