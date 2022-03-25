package Model;

public class Caminhao {
	private int idCaminhao;
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private float kmlUrbano;
	private float kmlRodoviario;
	private int tanqTotal;
	private int autonomia;
	private int qntEixo;
	private int tara;
	private int lotacao;
	private int pbt;
	private String cor;
	private String observacao;
	
	public Caminhao(int idCaminhao, String placa, String marca, String modelo, int ano, float kmlUrbano,
			float kmlRodoviario, int tanqTotal, int autonomia, int qntEixo, int tara, int lotacao, int pbt, String cor,
			String observacao) {
		this.idCaminhao = idCaminhao;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.kmlUrbano = kmlUrbano;
		this.kmlRodoviario = kmlRodoviario;
		this.tanqTotal = tanqTotal;
		this.autonomia = autonomia;
		this.qntEixo = qntEixo;
		this.tara = tara;
		this.lotacao = lotacao;
		this.pbt = pbt;
		this.cor = cor;
		this.observacao = observacao;
		
		
	}

	public int getIdCaminhao() {
		return idCaminhao;
	}

	public void setIdCaminhao(int idCaminhao) {
		this.idCaminhao = idCaminhao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getKmlUrbano() {
		return kmlUrbano;
	}

	public void setKmlUrbano(float kmlUrbano) {
		this.kmlUrbano = kmlUrbano;
	}

	public float getKmlRodoviario() {
		return kmlRodoviario;
	}

	public void setKmlRodoviario(float kmlRodoviario) {
		this.kmlRodoviario = kmlRodoviario;
	}

	public int getTanqTotal() {
		return tanqTotal;
	}

	public void setTanqTotal(int tanqTotal) {
		this.tanqTotal = tanqTotal;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public int getQntEixo() {
		return qntEixo;
	}

	public void setQntEixo(int qntEixo) {
		this.qntEixo = qntEixo;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}

	public int getPbt() {
		return pbt;
	}

	public void setPbt(int pbt) {
		this.pbt = pbt;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}
