package paulohenriqueb.silva.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "adocao_solidaria")
public class Instituicao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "instituicao_id")
	private Long id;
	
	@Column(name = "instituicao_nome", nullable = false, length = 100)
	private String nomeInstituicao;
	
	@Column(name = "instituicao_endereco", nullable = false, length = 120)
	private String enderecoInstituicao;
	
	@Column(name = "instituicao_horario_atendimento", nullable = false, length = 40)
	private String horarioAtendimento;
	
	@Column(name = "instituicao_responsavel", nullable = false, length = 80)
	private String responsavelInstituicao;
	
	@Column(name = "instituicao_rede_social", nullable= true, length = 100)
	private String redeSocialInstituicao;
	
	@Column(name = "instituicao_email", nullable = false, length = 100)
	private String emailInstituicao;
	
	@Column(name = "instiuicao_tel", nullable = false)
	private String telefone;
	
	@Column(name = "fk_instituicao_pet_id", nullable = true)
	private Long idPetRelacional;
	
	@Column(name = "instituicao_cep", nullable = false, length = 10)
	private String cep;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getEnderecoInstituicao() {
		return enderecoInstituicao;
	}

	public void setEnderecoInstituicao(String enderecoInstituicao) {
		this.enderecoInstituicao = enderecoInstituicao;
	}

	public String getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(String horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	public String getResponsavelInstituicao() {
		return responsavelInstituicao;
	}

	public void setResponsavelInstituicao(String responsavelInstituicao) {
		this.responsavelInstituicao = responsavelInstituicao;
	}

	public String getRedeSocialInstituicao() {
		return redeSocialInstituicao;
	}

	public void setRedeSocialInstituicao(String redeSocialInstituicao) {
		this.redeSocialInstituicao = redeSocialInstituicao;
	}

	public String getEmailInstituicao() {
		return emailInstituicao;
	}

	public void setEmailInstituicao(String emailInstituicao) {
		this.emailInstituicao = emailInstituicao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Long getIdPetRelacional() {
		return idPetRelacional;
	}

	public void setIdPetRelacional(Long idPetRelacional) {
		this.idPetRelacional = idPetRelacional;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
