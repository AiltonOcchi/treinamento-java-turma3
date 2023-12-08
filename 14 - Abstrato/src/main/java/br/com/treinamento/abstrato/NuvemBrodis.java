package br.com.treinamento.abstrato;

public class NuvemBrodis extends Nuvem{

	@Override
	String convertBase64(String imagem) {
		
		String imagemBase64 = imagem.replaceAll("-", "$");
		
		return imagemBase64;
	}

}
