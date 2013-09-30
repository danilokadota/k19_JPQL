package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import k19_JPQL.Produto;

public class TesteConsultaNativas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager =factory.createEntityManager();
		
		String sql = "SELECT * FROM Produto";
		Query nativeQuery = manager.createNativeQuery(sql , Produto.class);
		List<Produto> produtos = nativeQuery.getResultList();
		
		for(Produto produto : produtos){
			System.out.println(produto.getNome());
		}

	}

}
