package mynubank;

public abstract class Conta {

	private double saldo;
	protected int numero;
	protected int agencia;
	protected String titular;
	
	
	public Conta(int numero, int agencia){
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Não foi possível realizar o depósito.");
		}
	}
	
	public void saca(double valor) {
		if(this.saldo > 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Não foi possível realizar o saque.");
		}
	}
	
	public void transfere(double valor, Conta destino) {
		if(this.saldo > 0) {
			this.saca(valor);
			destino.deposita(valor);
		} else {
			System.out.println("Não foi possível realizar a transferência");
		}
	}
	
	public double mostraSaldo() {
		return this.saldo;
	}
	
	
}
