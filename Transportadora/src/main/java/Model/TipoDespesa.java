package Model;

public class TipoDespesa {
	private int idTipoDespesa;
	private String tipo;
	
	public TipoDespesa(int idTipoDespesa, String tipo) {
		this.idTipoDespesa = idTipoDespesa;
		this.tipo = tipo;
	}

	public int getIdTipoDespesa() {
		return idTipoDespesa;
	}

	public void setIdTipoDespesa(int idTipoDespesa) {
		this.idTipoDespesa = idTipoDespesa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
