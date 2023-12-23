package Models;

/*Abstract diz que a super classe não pode ser instanciada
 * Eu não posso criar um objeto na memória do tipo Produto*/

public abstract class Produto {

	private String titulo;
	private String genero;
	private double preco;
	private int quantidade;

	/*
	 * Uma classe abstrata PODE ter métodos abstratos e métodos
	 * concretos(codificados) Um método abstrato significa que na superclasse ele
	 * não vai ser programado mas exige que todas as subclasses programem.
	 */

	public abstract double doTotal();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
