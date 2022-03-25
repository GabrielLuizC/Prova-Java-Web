package Model;

public class Fluxo {
	private int idFluxo;
	private String etapa;
	
	public Fluxo(int idFluxo, String etapa) {
		this.idFluxo = idFluxo;
		this.etapa = etapa;
	}

	public int getIdFluxo() {
		return idFluxo;
	}

	public void setIdFluxo(int idFluxo) {
		this.idFluxo = idFluxo;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	
	
	

}
