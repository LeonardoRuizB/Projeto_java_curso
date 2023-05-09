package entities;

public class PessoaJuridica extends Contribuinte{

	private int numeroFuncs;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double rendaAnual, int numeroFuncs) {
		super(name, rendaAnual);
		this.numeroFuncs = numeroFuncs;
	}

	public int getNumeroFuncs() {
		return numeroFuncs;
	}

	public void setNumeroFuncs(int numeroFuncs) {
		this.numeroFuncs = numeroFuncs;
	}

	@Override
	public Double imposto() {
		if (getNumeroFuncs() > 10) {
			return (getRendaAnual() * 0.14);
		} else {
			return (getRendaAnual() * 0.16); 
		}
	}
}
