package br.com.treinamento.debug;

public class TryCatch {

	public static void main(String[] args) {
		
		String frase = "Olá";
		String novaFrase = "Olá, sou a frase 2";
		
		try {
			
			frase = frase.toUpperCase();
			novaFrase = novaFrase.toLowerCase();
			
			System.out.println("Frase: "+frase);
			System.out.println("Nova Frase:" +novaFrase);
			
		} catch (Exception e) {
			
			System.out.println("Não foi possível converter as frases");
			System.out.println("Motivo:"+e.getLocalizedMessage());
			
		} finally {
			System.out.println("Sempre executa esse bloco");
		}

	}

}
