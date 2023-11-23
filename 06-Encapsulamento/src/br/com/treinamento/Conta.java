package br.com.treinamento;

public class Conta {
	
	// Atributos
	private String agencia;
	private int numeroConta;
	private double saldo;
	private Cliente titular;
	
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	// 
	void transferir(Conta contaDestino, double valor){
		if(saldo<valor) {
			System.out.println("Saldo insuficiente");					
		}else {
			saldo = saldo - valor;
			contaDestino.saldo = contaDestino.saldo + valor;	
		}
	}
	
	void sacar(double valor){
		saldo = saldo-valor;
		System.out.println("Saque efetuado com sucesso!");
	}
	
	void depositar(double valor) {
		saldo = saldo+valor;
		System.out.println("Depósito efetuado com sucesso!");
	}

}
