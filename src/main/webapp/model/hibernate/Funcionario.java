package model.hibernate;

// Generated 23/09/2013 21:12:48 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Funcionario generated by hbm2java
 */
@Entity
@Table(name = "funcionario", catalog = "sghh")
public class Funcionario implements java.io.Serializable {

	private Integer funcionarioId;
	private String nome;
	private String cpf;
	private String senha;
	private Set<Ocupacao> ocupacaosForFuncBaixa = new HashSet<Ocupacao>(0);
	private Set<Ocupacao> ocupacaosForFuncCadastro = new HashSet<Ocupacao>(0);

	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Funcionario(String nome, String cpf, String senha,
			Set<Ocupacao> ocupacaosForFuncBaixa,
			Set<Ocupacao> ocupacaosForFuncCadastro) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.ocupacaosForFuncBaixa = ocupacaosForFuncBaixa;
		this.ocupacaosForFuncCadastro = ocupacaosForFuncCadastro;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FuncionarioId", unique = true, nullable = false)
	public Integer getFuncionarioId() {
		return this.funcionarioId;
	}

	public void setFuncionarioId(Integer funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	@Column(name = "Nome", nullable = false, length = 40)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "Cpf", nullable = false, length = 11)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "Senha", nullable = false, length = 10)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionarioByFuncBaixa")
	public Set<Ocupacao> getOcupacaosForFuncBaixa() {
		return this.ocupacaosForFuncBaixa;
	}

	public void setOcupacaosForFuncBaixa(Set<Ocupacao> ocupacaosForFuncBaixa) {
		this.ocupacaosForFuncBaixa = ocupacaosForFuncBaixa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionarioByFuncCadastro")
	public Set<Ocupacao> getOcupacaosForFuncCadastro() {
		return this.ocupacaosForFuncCadastro;
	}

	public void setOcupacaosForFuncCadastro(
			Set<Ocupacao> ocupacaosForFuncCadastro) {
		this.ocupacaosForFuncCadastro = ocupacaosForFuncCadastro;
	}

}
