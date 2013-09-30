package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import k19_JPQL.FuncionarioDeparatamento;

public class TesteBuscaFuncionarioDepartamento {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager =factory.createEntityManager();
		Query query = manager.createQuery("select new k19_JPQL.FuncionarioDeparatamento( f.nome, f.departamento.nome) from Funcionario f ");
		List<FuncionarioDeparatamento> lista = query.getResultList();
		
		for(FuncionarioDeparatamento fd : lista){
			System.out.println("Funcionario: " + fd.getFuncionario());
			System.out.println("Departamento: " + fd.getDepartamento());
		}
		manager.close();
		factory.close();
	}

}
