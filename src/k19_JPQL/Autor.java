package k19_JPQL;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Autor.findAll", query="select a from Autor a")
public class Autor {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@ManyToMany
	private Collection<Livro> livros = new ArrayList<Livro>();

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the livros
	 */
	public Collection<Livro> getLivros() {
		return livros;
	}

	/**
	 * @param livros the livros to set
	 */
	public void setLivros(Collection<Livro> livros) {
		this.livros = livros;
	}
	
	
}
