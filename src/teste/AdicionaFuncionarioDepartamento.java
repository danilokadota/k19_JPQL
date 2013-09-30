package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import k19_JPQL.Departamento;
import k19_JPQL.Funcionario;

public class AdicionaFuncionarioDepartamento {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_jpql_banco");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Departamento departamento = new Departamento();
		departamento.setNome("estagio");
		
		Funcionario funcionario =  new Funcionario();
		funcionario.setNome("danilo kadota");
		
		funcionario.setDepartamento(departamento);
		
		manager.persist(funcionario);
		manager.persist(departamento);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
