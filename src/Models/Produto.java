package Models;

/*Abstract diz que a super classe n�o pode ser instanciada
 * Eu n�o posso criar um objeto na mem�ria do tipo Produto*/

public abstract class Produto {

	private String titulo;
	private String genero;
	private double preco;
	private int quantidade;

	/*
	 * Uma classe abstrata PODE ter m�todos abstratos e m�todos
	 * concretos(codificados) Um m�todo abstrato significa que na superclasse ele
	 * n�o vai ser programado mas exige que todas as subclasses programem.
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
