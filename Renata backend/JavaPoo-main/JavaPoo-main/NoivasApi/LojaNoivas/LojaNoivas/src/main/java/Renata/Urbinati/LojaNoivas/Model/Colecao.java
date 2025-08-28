package Renata.Urbinati.LojaNoivas.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="colecao")

public class Colecao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int ano;
	
	@OneToMany(mappedBy = "colecao", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("colecao")
	private List<Colecao>colecao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public List<Colecao> getColecao() {
		return colecao;
	}

	public void setColecao(List<Colecao> colecao) {
		this.colecao = colecao;
	}
	
	
	

}
