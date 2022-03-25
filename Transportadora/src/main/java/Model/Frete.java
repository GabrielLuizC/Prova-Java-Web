package Model;

import java.util.Date;

public class Frete {
	private int idFrete;
	private String produtoTransp;
	private int qntProduto;
	private float pesoInicial;
	private float pesoTotalTransp;
	private Date dataInicial;
	private Date dataFinal;
	private float precoPorTone;
	private float valorTotBruto;
	private float valorTotLiqui;
	private String observacao;
	private Viagem viagem;
	private Caminhao caminhao;
	private Motorista motorista;
	private Despesas despesas;
	
	public Frete(int idFrete, String produtoTransp, int qntProduto, float pesoInicial, float pesoTotalTransp,
			Date dataInicial, Date dataFinal, float precoPorTone, float valorTotBruto, float valorTotLiqui,
			String observacao, Viagem viagem, Caminhao caminhao, Motorista motorista, Despesas despesas) {
		this.idFrete = idFrete;
		this.produtoTransp = produtoTransp;
		this.qntProduto = qntProduto;
		this.pesoInicial = pesoInicial;
		this.pesoTotalTransp = pesoTotalTransp;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.precoPorTone = precoPorTone;
		this.valorTotBruto = valorTotBruto;
		this.valorTotLiqui = valorTotLiqui;
		this.observacao = observacao;
		this.viagem = viagem;
		this.caminhao = caminhao;
		this.motorista = motorista;
		this.despesas = despesas;
		
		
	}

	public int getIdFrete() {
		return idFrete;
	}

	public void setIdFrete(int idFrete) {
		this.idFrete = idFrete;
	}

	public String getProdutoTransp() {
		return produtoTransp;
	}

	public void setProdutoTransp(String produtoTransp) {
		this.produtoTransp = produtoTransp;
	}

	public int getQntProduto() {
		return qntProduto;
	}

	public void setQntProduto(int qntProduto) {
		this.qntProduto = qntProduto;
	}

	public float getPesoInicial() {
		return pesoInicial;
	}

	public void setPesoInicial(float pesoInicial) {
		this.pesoInicial = pesoInicial;
	}

	public float getPesoTotalTransp() {
		return pesoTotalTransp;
	}

	public void setPesoTotalTransp(float pesoTotalTransp) {
		this.pesoTotalTransp = pesoTotalTransp;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public float getPrecoPorTone() {
		return precoPorTone;
	}

	public void setPrecoPorTone(float precoPorTone) {
		this.precoPorTone = precoPorTone;
	}

	public float getValorTotBruto() {
		return valorTotBruto;
	}

	public void setValorTotBruto(float valorTotBruto) {
		this.valorTotBruto = valorTotBruto;
	}

	public float getValorTotLiqui() {
		return valorTotLiqui;
	}

	public void setValorTotLiqui(float valorTotLiqui) {
		this.valorTotLiqui = valorTotLiqui;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

	public Caminhao getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Despesas getDespesas() {
		return despesas;
	}

	public void setDespesas(Despesas despesas) {
		this.despesas = despesas;
	}
}
