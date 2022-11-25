package paulohenriqueb.silva.model;

import java.io.Serializable;
import java.util.Objects;

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
	@Column(name="pet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "pet_nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "pet_tipo", nullable = false, length = 20)
	private String tipo;
	
	@Column(name = "pet_temperamento", nullable = true, length = 30)
	private String temperamento;
	
	@Column(name = "pet_possui_debilidade", nullable = false)
	private Boolean possuiDebilidade;
	
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


	public Long getInstituicaoId() {
		return instituicaoId;
	}

	public void setInstituicaoId(Long instituicaoId) {
		this.instituicaoId = instituicaoId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, instituicaoId, nome, possuiDebilidade, temperamento, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(id, other.id) && Objects.equals(instituicaoId, other.instituicaoId)
				&& Objects.equals(nome, other.nome) && Objects.equals(possuiDebilidade, other.possuiDebilidade)
				&& Objects.equals(temperamento, other.temperamento) && Objects.equals(tipo, other.tipo);
	}
	
	
}
