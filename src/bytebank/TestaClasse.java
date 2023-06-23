package bytebank;

public class TestaClasse {
	public static void main(String[] args) {
		Conta conta = new Conta();
//		conta.saldo = 100;
		System.out.println(conta.getSaldo());
		conta.deposita(100);
		System.out.println(conta.getSaldo());
//		System.out.println(conta.saldo);
		System.out.println(conta.getSaldo());
		conta.saca(1000);

//		System.out.println(conta.saca(10));
		System.out.println(conta.titular);
		
		// conta.titular = new Cliente();
		conta.titular.nome = "Joaquim";
		System.out.println(conta.titular.nome);
	}
}
