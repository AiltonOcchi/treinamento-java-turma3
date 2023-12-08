package br.com.treinamento.abstrato;

public class Principal {

	public static void main(String[] args) {
		
		NuvemBrodis nuvem = new NuvemBrodis();
		nuvem.setNomeImagem("foto_perfil.png");
		
		String base64 = nuvem.convertBase64(nuvem.getNomeImagem());

		nuvem.upload(base64);
		
		System.out.println(nuvem.getUrlImagem());
	}

}
