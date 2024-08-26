//5. Criar um projeto Java que receba as bibliotecas criadas no exercício anterior e apresente os resultados dos exercícios 1, 2 e 3(pdf).
package view;

import br.edu.fateczl.bubblesort.BubbleSort;
import br.edu.fateczl.mergesort.MergeSort;
import controller.ControllerSort;

public class Principal {

	public static void main(String[] args) {
		BubbleSort sortB = new BubbleSort();
		MergeSort sortM = new MergeSort();
		ControllerSort contSort = new ControllerSort();
		
		int [] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int [] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int [] vetor3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
	        
	    contSort.sort(sortB, sortM, vetor1);
	    contSort.sort(sortB, sortM, vetor2);
	    contSort.sort(sortB, sortM, vetor3);
		
	}

}
