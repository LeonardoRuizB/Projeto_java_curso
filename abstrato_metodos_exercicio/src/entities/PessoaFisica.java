package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000.00){
			return getRendaAnual() * 0.15;
		} else {
			return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.50);
		}
	}

}
