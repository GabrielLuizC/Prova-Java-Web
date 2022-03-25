package Model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

public class Motorista {
	private int idMotorista;
	private String nome;
	private String cpf;
	private String telefone;
	private String dataNascimento;
	private String endereco;
	private float porcComissao;
	private String observacao;
	private Usuario usuario;
	
	public Motorista(int idMotorista, String nome, String cpf, String telefone, String dataNascimento, String endereco,
			float porcComissao, String observacao, Usuario usuario) {
		this.idMotorista = idMotorista;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.porcComissao = porcComissao;
		this.observacao = observacao;
		this.usuario = usuario;
	}
	
	public Motorista(){	
		
	}

	public int getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getPorcComissao() {
		return porcComissao;
	}

	public void setPorcComissao(float porcComissao) {
		this.porcComissao = porcComissao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
}
