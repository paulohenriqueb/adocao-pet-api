package paulohenriqueb.silva.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pets")
public class Pet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "pet_tipo", nullable = false, length = 20)
	private String tipo;
	
	@Column(name = "pet_temperamento", nullable = true, length = 30)
	private String temperamento;
	
	@Column(name = "pet_possui_debilidade", nullable = false)
	private Boolean possuiDebilidade;
	
	@Column(name = "pet_debilidade", nullable = true, length = 100)
	private String debilidade;
	
	@Column(name = "fk_instituicao_id", nullable = false)
	private Long instituicaoId;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public Boolean getPossuiDebilidade() {
		return possuiDebilidade;
	}

	public void setPossuiDebilidade(Boolean possuiDebilidade) {
		this.possuiDebilidade = possuiDebilidade;
	}

	public String getDebilidade() {
		return debilidade;
	}

	public void setDebilidade(String debilidade) {
		this.debilidade = debilidade;
	}

	public Long getInstituicaoId() {
		return instituicaoId;
	}

	public void setInstituicaoId(Long instituicaoId) {
		this.instituicaoId = instituicaoId;
	}
	
	
}
