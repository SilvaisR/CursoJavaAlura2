package mynubank;

public class TestaContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(78945, 456);
		cc.deposita(5000.0);
		
		ContaPoupanca cp = new ContaPoupanca(74185, 236);
		cp.deposita(5000.0);
		
		ContaCorrente cc2 = new ContaCorrente(5632, 485);
		
		System.out.println("Saldo CC: " + cc.mostraSaldo());
		System.out.println("Saldo CP: " + cp.mostraSaldo());
		System.out.println(); 
		
		cc.saca(100.0); 
		cp.saca(100.0);
		
		System.out.println("Saldo CC: " + cc.mostraSaldo());
		System.out.println("Saldo CP: " + cp.mostraSaldo());
		System.out.println(); 
		
		cc.transfere(200, cc2); 
		cp.transfere(200, cc2);
		System.out.println("Saldo CC: " + cc.mostraSaldo());
		System.out.println("Saldo CP: " + cp.mostraSaldo());
		System.out.println("Saldo CC2: " + cc2.mostraSaldo());
		System.out.println(); 
	}

}
