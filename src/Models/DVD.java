package Models;

public class DVD extends Produto {

	private int anoLancamento;

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	@Override
	public double doTotal() {
		super.setPreco(getPreco() * 1.30);
		return getPreco();
	}

}
