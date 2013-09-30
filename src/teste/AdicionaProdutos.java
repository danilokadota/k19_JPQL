package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_JPQL.Produto;

public class AdicionaProdutos {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		for (int i = 0; i <= 1000; i++){
			Produto produto = new Produto();
			produto.setNome("Produto " + i);
			produto.setPreco(i * 10.0);
			manager.persist(produto);
		}
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
