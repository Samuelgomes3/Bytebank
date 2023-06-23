package bytebank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println(this.saldo);
			System.out.println("Transferência realizada com sucesso");
			return true;
		} else {
			System.out.println("Transferência recusada, saldo insuficiente");
			return false;
		}
	}
}
