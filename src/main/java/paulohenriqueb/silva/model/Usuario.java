package paulohenriqueb.silva.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adocao_user")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "usuario_nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "usuario_tel", nullable = false, length = 15)
	private String telefone;
	
	@Column(name = "usuario_email", nullable = false, length = 100)
	private String email;
	
	@Column(name = "usuario_senha", nullable = false, length = 140)
	private String senha;
	
	@Column(name = "usuario_endereco", nullable = false, length = 100)
	private String endereco;
	
	@Column(name = "usuario_uf", nullable = false, length = 3)
	private String uf;
	
	@Column(name = "usuario_cep", nullable = false, length = 10)
	private String cep;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}

