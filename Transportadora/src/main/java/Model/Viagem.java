package Model;

public class Viagem {
	private int idViagem;
	private String cidOrigem;
	private String cidDestino;
	private float kmInicial;
	private float kmFinal;
	private float kmIniCaminh;
	private float kmFinalCaminh;
	private Fluxo fluxo;
	
	public Viagem(int idViagem, String cidOrigem, String cidDestino, float kmInicial, float kmFinal, float kmIniCaminh,
			float kmFinalCaminh, Fluxo fluxo) {
		this.idViagem = idViagem;
		this.cidOrigem = cidOrigem;
		this.cidDestino = cidDestino;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.kmIniCaminh = kmIniCaminh;
		this.kmFinalCaminh = kmFinalCaminh;
		this.fluxo = fluxo;
	}

	public int getIdViagem() {
		return idViagem;
	}

	public void setIdViagem(int idViagem) {
		this.idViagem = idViagem;
	}

	public String getCidOrigem() {
		return cidOrigem;
	}

	public void setCidOrigem(String cidOrigem) {
		this.cidOrigem = cidOrigem;
	}

	public String getCidDestino() {
		return cidDestino;
	}

	public void setCidDestino(String cidDestino) {
		this.cidDestino = cidDestino;
	}

	public float getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(float kmInicial) {
		this.kmInicial = kmInicial;
	}

	public float getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(float kmFinal) {
		this.kmFinal = kmFinal;
	}

	public float getKmIniCaminh() {
		return kmIniCaminh;
	}

	public void setKmIniCaminh(float kmIniCaminh) {
		this.kmIniCaminh = kmIniCaminh;
	}

	public float getKmFinalCaminh() {
		return kmFinalCaminh;
	}

	public void setKmFinalCaminh(float kmFinalCaminh) {
		this.kmFinalCaminh = kmFinalCaminh;
	}

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}
	
	

}
