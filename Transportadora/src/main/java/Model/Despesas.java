package Model;

public class Despesas {
	private int idDespesas;
	private float valor;
	private boolean situacao;
	private TipoDespesa tipoDespesa;
	
	public Despesas(int idDespesas, float valor, boolean situacao, TipoDespesa tipoDespesa) {
		this.idDespesas = idDespesas;
		this.valor = valor;
		this.situacao = situacao;
		this.tipoDespesa = tipoDespesa;
	}

	public int getIdDespesas() {
		return idDespesas;
	}

	public void setIdDespesas(int idDespesas) {
		this.idDespesas = idDespesas;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	
	
	
}
