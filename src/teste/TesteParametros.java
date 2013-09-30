package teste;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import k19_JPQL.Autor;
import k19_JPQL.Livro;

public class TesteParametros {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("Livro.findByPrecoMinimo");
		query.setParameter("preco", 20.0);
		List<Livro> livros = query.getResultList();
			
		for(Livro livro : livros){
			System.out.println("Livro: " + livro.getNome());
			System.out.println("Preco: " + livro.getPreco());
			System.out.println();
		}
		manager.close();
		factory.close();
	}

}