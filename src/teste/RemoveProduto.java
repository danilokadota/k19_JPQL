package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RemoveProduto {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Query query = manager.createQuery("DELETE Produto produto WHERE produto.preco < 500");
		query.executeUpdate();
		
		manager.getTransaction().commit();;
		
		manager.close();
		factory.close();

	}

}