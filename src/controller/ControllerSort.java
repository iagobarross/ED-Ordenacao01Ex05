package controller;
import br.edu.fateczl.bubblesort.BubbleSort;
import br.edu.fateczl.mergesort.MergeSort;

public class ControllerSort {

	public ControllerSort() {
		super();
	}
	
	public static void sort(BubbleSort sortB, MergeSort sortM, int[] vetor) {
		int tamanho = vetor.length;
		int[] bVetor = new int [tamanho];
		int[] mVetor = new int [tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			bVetor[i] = vetor[i];
			mVetor[i] = vetor[i];
		}
		
		bVetor = sortB.Bubble(mVetor);
		mVetor = sortM.Merge(mVetor, 0, tamanho - 1);
		
		System.out.println("\nVetor Original");
		printVetor(vetor);
		
		System.out.println("\nBubble:");
		printVetor(bVetor);
		
		System.out.println("\nMerge:");
		printVetor(mVetor);
	}
	
	private static void printVetor(int [] vetor) {
		for(int i:vetor) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
