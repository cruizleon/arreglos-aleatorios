/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

/**
 *
 * @author Administrador
 */
import java.util.Random;

public class matrices {

	public static void main(String[] args) {
		

		//int[] arreglo ={123,456,879,423,424,5731,213};
		Random rd = new Random();
		int []arreglo = new int [100 + rd.nextInt(401)];
		
		for(int i= 0; i < arreglo.length; i++)
		{
			arreglo[i] = rd.nextInt();		
		}
		
		
		int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
		int counter = 0;
		
		for(int i= 0; i < arreglo.length; i++)
		{
			min = arreglo[i] < min ? arreglo[i]: min;
			max = arreglo[i] > max ? arreglo[i]: max;
			counter = arreglo [i];
		}
		
		System.out.println("El minimo es "+ min + " y el maximo es "+ max);

	}

}
