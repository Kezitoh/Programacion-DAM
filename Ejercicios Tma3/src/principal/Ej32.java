package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Ej32 {

	public static void main(String[] args) {
		
		//APARTADO A
		
		System.out.println("APARTADO A");
		
		int[] a1 = new int[20];
		for(int i = 0; i < a1.length; i++) {
			a1[i]= (int) (Math.random()*51);
		}
		System.out.println(Arrays.toString(a1));
		
		int[] referencia =new int[20];
		referencia = a1;
		referencia[5] = 99;
		
		System.out.println("a1[5]: "+ a1[5]);
		
		
		//APARTADO B
		
		System.out.println("APARTADO B\n");
		//Se crea array unidimensional b1 y se le da valores
		String b1[] = new String[2];
		b1[0] = "Este es b1[0]";
		b1[1] = "Este es b1[1]";
		//Se crea clon de b1
		String[] clon1 = b1.clone();
		
		//Se crea array bidimensional b2 y se le da valores
		String[][] b2 = new String[2][2];
		b2[0][0] = "Este es b2[0][0]";
		b2[1][0] = "Este es b2[1][0]";
		b2[0][1] = "Este es b2[0][1]";
		b2[1][1] = "Este es b2[1][1]";
		//Se crea clon de b2
		String[][] clon2 = b2.clone();
		
		//Se cambian valores de los arrays originales para comprobar si los clones referencian a estos o si son independientes
		b1[0] = "jaja xd caiste";
		b2[0][0] = "mae mia willi";
		
		//Compara ambos arrays para comprobar si realmente son el mismo objeto
		System.out.println("Son b1 y clon1 el mismo objeto? "+ (b1 == clon1));
		//Comprueba si refieren a lo mismo si se les dan las misma posición
		System.out.println("En su respectiva posicion (0) se refieren a lo mismo? "+(b1[0] == clon1[0]));
		//Saca por pantalla ambos arrays para ver sus contenidos
		System.out.println("B1: "+Arrays.toString(b1));
		System.out.println("Clon1: "+Arrays.toString(clon1));
		//Compara ambos arrays para ver si realmente son el mismo objeto
		System.out.println("Son b2 y clon 2 el mismo objeto? "+ (b2 == clon2));
		//Comprueba si refieren a lo mismo si se les dan las mismas posiciones
		System.out.println("En sus respectivas posiciones (0,0), se refieren a lo mismo? " +(b2[0][0] == clon2[0][0]));
		//Saca por pantalla ambos arrays para ver sus contenidos
		for(int i=0; i< b2.length; i++) {
			System.out.println("B2: "+Arrays.toString(b2[i]));
			System.out.println("Clon2: "+Arrays.toString(clon2[i]));
		}
		
		
		//APARTADO C
		System.out.println("APARTADO C\n");
		
		int[] c1 = {1,2,3,4,5};
		int[] c2 = new int[5];
		for(int i = 0; i < c1.length; i++) {
			c2[i] = c1[c2.length-1-i];
		}
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		//APARTADO D
		System.out.println("APARTADO D\n");
		
		int[] d1 = {1,2,3,4};
		int[] d2 = new int[4];
		d2 = Arrays.copyOf(d1, 4);
		System.out.println(Arrays.toString(d2));
		
		//APARTADO E
		System.out.println("APARTADO E\n");
		
		System.out.println("Son iguales los dos arrays d1 y d2? "+Arrays.equals(d1, d2));
		
		//APARTADO F
		System.out.println("APARTADO F\n");
		
		Scanner teclado = new Scanner(System.in);
		
		int[] f = new int[20];
		for(int i = 0; i< f.length;i++){
			f[i] =(int) (Math.random()*101);
		}
		System.out.println(Arrays.toString(f));
		
		int valor = 0;
		do {
			System.out.println("Introduzca un valor del 0 al 100: ");
			valor = teclado.nextInt();
		}while(valor < 0 && valor > 100);
		int posicion = -1;
		for(int i=0; i<f.length; i++) {
			if(valor == f[i]) {
				posicion=i;
				System.out.println("Se encuentra en la posición "+(posicion+1));
				break;
			}
		}
		if (posicion < 0);
			System.out.println("Valor no encontrado");
		
		//APARTADO G
		System.out.println("APARTADO G\n");
			
		Arrays.sort(f);
		
		System.out.println("Ordenado: "+Arrays.toString(f));
		
		//APARTADO H
		System.out.println("APARTADO H\n");
		
		do {
			System.out.println("Introduzca un valor del 0 al 100: ");
			valor = teclado.nextInt();
		}while(valor < 0 && valor > 100);
		
		int largo = f.length;
		int inferior = 0, superior = largo-1;
		int centro = (inferior + superior)/2;
		if(valor == f[centro]) {
			System.out.println(valor+" está en la posición "+centro+" del array.");
		}
		else if(valor < f[centro]) {
			
		}
		else if(valor > f[centro]) {
			
		}
	}
}
