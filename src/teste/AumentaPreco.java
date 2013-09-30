package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import k19_JPQL.Produto;

public class AumentaPreco {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Query query = manager.createQuery("UPDATE Produto produto SET produto.preco = produto.preco * 1.1");
		query.executeUpdate();
		
		manager.getTransaction().commit();;
		
		manager.close();
		factory.close();

	}

}
