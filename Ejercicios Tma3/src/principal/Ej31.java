package principal;

import java.util.*;

public class Ej31 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double precipitacionM = 0;
		String dichoMes = "";
		String[] meses = new String[12];
		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";
		meses[5] = "Junio";
		meses[6] = "Julio";
		meses[7] = "Agosto";
		meses[8] = "Septiembre";
		meses[9] = "Octubre";
		meses[10] = "Noviembre";
		meses[11] = "Diciembre";
		
		Double[] mm = new Double[12];
		
		for (int i = 0;i < meses.length;i++) {
		
		
			System.out.println("Lluvias en "+meses[i]+" en mm");
			mm[i] = teclado.nextDouble();
		}
		
		for(int i=0; i < meses.length;i++) {
			
			if(mm[i] > precipitacionM) {
				
				precipitacionM = mm[i];
				dichoMes = meses[i];
			}
		}
		
		System.out.printf("El mes mas lluvioso es %s con %f mm", dichoMes, precipitacionM);
	}
}
