package br.com.treinamento.calculos;

/**
 * Essa classe é responsável por fornecer diversas fórmulas
 * de cálculos que podem ser utilizadas em vários projetos.<br/>
 * <b>A classe não possui atributos e os métodos são todos estáticos</b>
 * Veja mais informações em: <a href="http://www.github.com/AiltonOcchi/treinamento"> LINK </a>
 */
public class Calculos {
	
	/**
	 * Método para somar dois números distintos
	 * @param numero1 recebe o primeiro valor para o cálculo
	 * @param numero2 recebe o segundo valor para o cálculo
	 * @return Resultado com a soma dos dois números
	 * @author Ailton
	 * @since  v1
	 */
	public static Integer somarDoisNumeros(Integer numero1, Integer numero2){
		return numero1+numero2;
	}
	
	/**
	 * Calcula o perímetro da circunferência a partir de um diâmetro
	 * @param diametro recebe o valor do diâmetro 
	 * @return o perímetro da circunferência
	 */
	public static Double calculaCircunferencia(Integer diametro) {
		Double pi = 3.14159265;
		return pi*diametro;
	}
	
	public static Integer caculaAreaQuadrado(Integer base, Integer altura) {
		return base*altura;
	}

}
