package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Ej33 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int selecAlumn= 0;
		int nAlumnos = 0;
		int nModulos = 0;
		int posAlumn = 0;
		
		
		
		do {
			System.out.print("Máximo número de alumnos(>0): ");
			nAlumnos = teclado.nextInt();
		}while(nAlumnos <= 0);
		
		String[] nombres = new String[nAlumnos];
		String[][] modulos = new String[nAlumnos][];
		float[][] notas = new float[nAlumnos][];
		
		 
		int menu = 0;
		
		do {
			
			System.out.println("\n	GESTIÓN DE ALUMNOS\n1.Insertar nuevo alumno\n2.Ver datos de un alumno\n3.Listado de asignaturas\n4.Borrar alumno\n5.Salir");
			menu = teclado.nextInt();
			
		
			switch(menu) {
			case 1: {
				if(posAlumn == nombres.length) {
					System.out.println("Ya no quedan espacios!");
				}
				else{
			
					System.out.print("Apellidos y nombre: ");
					teclado.nextLine();
					nombres[posAlumn] = teclado.nextLine();
					System.out.print("En cuantos modulos esta matriculado: ");
					nModulos = teclado.nextInt();
					modulos[posAlumn] = new String[nModulos];
					notas[posAlumn] = new float[nModulos];
					for(int i = 0; i < nModulos; i++) {
						System.out.print("Modulo["+(i)+"]: ");
						teclado.nextLine();
						modulos[posAlumn][i] = teclado.nextLine();
						System.out.print("Nota["+(i)+"]: ");
						notas[posAlumn][i] = teclado.nextFloat();
						}
					}
				posAlumn ++;
			}
				break;
			case 2: {
				System.out.print("Posicion del alumno: ");
				selecAlumn = teclado.nextInt();
				if(nombres[selecAlumn] != null) {
					System.out.println("Apellidos y nombre: "+ nombres[selecAlumn]);
					System.out.println("En cuantos modulos esta matriculado: "+ modulos[selecAlumn].length);
					for(int i=0; i < modulos[selecAlumn].length;i++) {
						System.out.println("Modulo["+i+"]:"+ modulos[selecAlumn][i]);
						System.out.println("Nota: "+notas[selecAlumn][i]);
					}
				
				}
				else {
					System.out.print("	No existe!");
				}
			
			}
				break;
			case 3:{
				System.out.print("Escriba la inicial del( modulo(s): ");
				teclado.nextLine();
				String inicial = teclado.nextLine();
				for(int i=0; i < modulos.length; i++) {
					for(int b = 0; b < modulos[i].length; b++) {
						if(modulos[i][b].startsWith(inicial)){
							System.out.println(nombres[i].substring(nombres[i].indexOf(",")+2)+"("+modulos[i][b]+": "+notas[i][b]+")");
						}
					}
				}
			}
				break;
			case 4:{
				System.out.print("Indique la posición del alumno a borrar: ");
				int borrar = teclado.nextInt();
				System.out.print("Seguro que quieres borrar a "+nombres[borrar]+"? (s/n) ");
				char decision = teclado.next().charAt(0);
				if(decision == 's') {
					nombres[borrar]=null;
					modulos[borrar]=null;
					notas[borrar]=null;
					for(int i = borrar; i < posAlumn; i++) {
						nombres[i] = nombres[i+1];
						for(int b = 0; b< modulos[i+1].length;b++) {
							modulos[i][b] = modulos[i+1][b];
							notas[i][b] = notas[i+1][b];
						}
					}
					posAlumn--;
				}
			}
				break;
			case 5:{
			
				System.out.println("Programa finalizado..");
			}
				break;
			}
		
		}while(menu != 5);
	teclado.close();
	}
	
	
}
