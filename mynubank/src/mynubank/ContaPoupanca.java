package mynubank;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor + 0.2);
	}

}
