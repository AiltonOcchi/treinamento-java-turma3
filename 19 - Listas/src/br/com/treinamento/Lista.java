package br.com.treinamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		 ArrayList<String> list = new ArrayList<>(10);
		
		

        list.add("Maçã");// Adiciona na ordem que chega
        list.add(1, "Banana"); // adiciona informando a posição
        list.addFirst("Goiaba");// Adiciona no inicio da lista
        list.addLast("Uva");// Adiciona no final da lista
        list.set(1, "Pera");//Adiciona substituindo o elemento da lista
        
        System.out.println(list);
        
        list.remove(1);// Remove o elemento da posição 1
        //list.clear();// Remove todos os elementos da lista
        
        list.clone();// Cria uma cópia da lista
        
        System.out.println(list.contains("Banana"));
        
        list.remove("Banana");// Remove o elemento da lista pelo valor
        list.ensureCapacity(0);// Garante que a lista tenha a capacidade mínima especificada
        list.get(0);// Retorna o elemento da posição 0
        
        list.getFirst();// Retorna o primeiro elemento da lista
        list.getLast();// Retorna o último elemento da lista
        
        list.indexOf("Maçã");// Retorna a posição do elemento na lista
        
        
        list.isEmpty();// Verifica se a lista está vazia
        
        list.lastIndexOf("Maçã");// Retorna a última posição do elemento na lista
        
        list.removeFirst();// Remove o primeiro elemento da lista
        list.removeLast();// Remove o último elemento da lista

       
        
        System.out.println(list);
        
        list.add("Maçã");
        list.add("Uva");
        list.add("Pera");
        
        System.out.println(list.size());// Retorna o tamanho da lista
        System.out.println(list);
        
        System.out.println(list.reversed());// Retorna uma lista com os elementos em ordem reversa
        
        
        //List<String> carros = Arrays.asList("VW","Fiat","Ford");
        List<String> carros = new ArrayList<>(List.of("VW","Fiat","Ford"));
        carros.add("GM");
        System.out.println(carros);
        
        
        List<String> listaComNCopias = Collections.nCopies(10, "Ola");
        System.out.println(listaComNCopias);
        
        
        List<Integer> toBeSorted = new ArrayList<>(List.of(3,2,4,1,-2));
        Collections.sort(toBeSorted);
        System.out.println(toBeSorted);
        System.out.println(toBeSorted.get(2));
        
	}

}
