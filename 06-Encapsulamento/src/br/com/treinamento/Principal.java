package br.com.treinamento;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Ailton");
		cliente1.setCpf("123456789");
		
		Conta conta1 = new Conta();
		conta1.setAgencia("778-9");
		conta1.setNumeroConta(456987);
		conta1.setSaldo(100.00);
		conta1.setTitular(cliente1);

		//###############################
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("José");
		cliente2.setCpf("987.654.999-58");
		
		System.out.println("CPF do Cliente: "+cliente2.getCpf());
		
		Conta conta2 = new Conta();
		conta2.setAgencia("0058-9");;
		conta2.setNumeroConta(134679);;
		conta2.setSaldo(100.00);
		
		
		//#######EXECUÇÃO DO PROGRAMA
		System.out.println("Valor da conta1 antes do depósito: "+conta1.getSaldo());
		conta1.depositar(30.00);
		System.out.println("Saldo atualizado: R$"+conta1.getSaldo());
		
		conta1.sacar(20.00);
		System.out.println("Saldo atualizado: R$"+conta1.getSaldo());
		System.out.println("\n\n");
		
		
		//Execução de transferência entre contas
		conta1.transferir(conta2, 27.00);
		System.out.println("Saldo atualizado conta1: "+conta1.getSaldo());
		System.out.println("Saldo atualizado conta2: "+conta2.getSaldo());
		
		//Execução Conta e Cliente
		System.out.println("Nome do cliente conta1: "+ conta1.getTitular().getNome());
		
		
	}

}
