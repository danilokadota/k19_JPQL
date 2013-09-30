package k19_JPQL;

public class FuncionarioDeparatamento {
	private String funcionario;
	private String departamento;
	
	public FuncionarioDeparatamento(String funcionario, String departamento){
		this.funcionario = funcionario;
		this.departamento = departamento;
	}

	/**
	 * @return the funcionario
	 */
	public String getFuncionario() {
		return funcionario;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	
}
