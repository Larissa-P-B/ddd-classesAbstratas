package Models;

public class CD extends Produto {

	private String artista;

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	@Override // @ => anota��o
	public double doTotal() {
		super.setPreco(getPreco() * 1.10);
		return getPreco();
	}

}
