package Cube;
import java.util.Arrays;
import java.util.Scanner;

public class Cube {

	
	
	public static void main(String[] args) {
		int opcion;
		Scanner reader = new Scanner(System.in);
		System.out.println("1- Jugar contra Pc   2- Jugar contra otro jugador");
		opcion = reader.nextInt();
		
		switch(opcion){
			
			case 1:
				Opcion1();
				break;
				
			case 2:
				Opcion2();
				break;
			
			default:
				System.out.println("Esa opcion no existe pedazo de mierda");
		}
	}
	
	private static void Opcion1() {
	
		int i, k, muertos, heridos, intentos;
		int numeros[] = new int [4];
		int numerosU[] = new int [4];
		Scanner reader = new Scanner(System.in);
		intentos = 1;
			do {
				for(i = 0; i<4; i++) {
					numeros[i] = (int) (Math.random()*9);
					for(k = 0; k<i; k++) {
						if(numeros[i] == numeros[k]) {
							numeros[i] += 1;
							}	
						}
					}
				} while(numeros[0] == 0);

			do {
				muertos = 0;
				heridos = 0;
				System.out.println("Enter four numbers with an space in between \"1 2 3 4\"");
				for(i = 0; i < 4; i++) {
					numerosU[i] = reader.nextInt();
				}
				for(i = 0; i<4; i++) {
					if(numeros[i] == numerosU[i]) {
					muertos++;
						
					} else if (i == 0 && (numeros[i] == numerosU[1] || numeros[i] == numerosU[2] || numeros[i] ==  numerosU[3]) ){
						heridos++;
					} else if (i == 1 && (numeros[i] == numerosU[0] || numeros[i] == numerosU[2] || numeros[i] ==  numerosU[3]) ){
						heridos++;
					} else if (i == 2 && (numeros[i] == numerosU[1] || numeros[i] == numerosU[0] || numeros[i] ==  numerosU[3]) ){
						heridos++;
					} else if (i == 3 && (numeros[i] == numerosU[1] || numeros[i] == numerosU[2] || numeros[i] ==  numerosU[0]) ){
						heridos++;
					}
				}
				intentos++;
				System.out.printf(muertos + " muertos y " + heridos + " heridos");
				System.out.println("");
				} while ((!Arrays.equals(numeros, numerosU)) && (intentos != 10));

				if(intentos == 10) {
				System.out.println("Perdiste");
				} else {
				System.out.println("Ganaste pequeñota");
			}
		}
		
	private static void Opcion2() {
		
		int i, k, muertos, heridos, turno = 2;
		int numeros1[] = new int [4];
		int numeros2[] = new int [4];
		int numerosU1[] = new int [4];
		int numerosU2[] = new int [4];
		String jugador1, jugador2;
		boolean winner = false;
		Scanner reader = new Scanner(System.in);
			
		do {
			System.out.println("Ingresa el nombre de jugador 1");
			jugador1 = reader.next();
			System.out.println( jugador1 + " ingresa tus cuatro numeros separados por un espacios \"1 2 3 4\"");
			
			for(i = 0; i<4; i++) {
				numeros1[i] = reader.nextInt();
			}
			if(numeros1[0] == 0 || numeros1[0] == numeros1[1] || numeros1[0] == numeros1[2] 
					|| numeros1[0] == numeros1[3] || numeros1[1] == numeros1[2] || numeros1[1] == numeros1[3] || numeros1[3] == numeros1[2]) {
				System.out.println("Recuerda que no pueden ser numeros repetidos o empezar por 0");
			}
			
		}while(numeros1[0] == 0 || numeros1[0] == numeros1[1] || numeros1[0] == numeros1[2] 
				|| numeros1[0] == numeros1[3] || numeros1[1] == numeros1[2] || numeros1[1] == numeros1[3] || numeros1[3] == numeros1[2]);
		Limpiar();
		do {
			System.out.println("Ingresa el nombre de jugador 2");
			jugador2 = reader.next();
			System.out.println(jugador2 + " ingresa tus cuatro numeros separados por un espacios \"1 2 3 4\"");
			
			for(i = 0; i<4; i++) {
				numeros2[i] = reader.nextInt();
			}
			if(numeros2[0] == 0 || numeros2[0] == numeros2[1] || numeros2[0] == numeros2[2] 
					|| numeros2[0] == numeros2[3] || numeros2[1] == numeros2[2] || numeros2[1] == numeros2[3] || numeros2[3] == numeros2[2]) {
				System.out.println("Recuerda que no pueden ser numeros repetidos o empezar por 0");
			}
			
		}while(numeros2[0] == 0 || numeros2[0] == numeros2[1] || numeros2[0] == numeros2[2] 
				|| numeros2[0] == numeros2[3] || numeros2[1] == numeros2[2] || numeros2[1] == numeros2[3] || numeros2[3] == numeros2[2]);

		Limpiar();
		System.out.println("Empieza el juego");
		System.out.println("");
		while(winner == false) {
			muertos = 0;
			heridos = 0;
			turno--;
			switch(turno) {
			case 1:
				System.out.println("Turno del jugador 1");
				System.out.println("ingresa tus cuatro numeros separados por un espacios \"1 2 3 4\"");
				for(i = 0; i < 4; i++) {
					numerosU1[i] = reader.nextInt();
				}
				for(i = 0; i<4; i++) {
					if(numeros2[i] == numerosU1 [i]) {
					muertos++;
						
					} else if (i == 0 && (numeros2[i] == numerosU1[1] || numeros2[i] == numerosU1[2] || numeros2[i] ==  numerosU1[3]) ){
						heridos++;
					} else if (i == 1 && (numeros2[i] == numerosU1[0] || numeros2[i] == numerosU1[2] || numeros2[i] ==  numerosU1[3]) ){
						heridos++;
					} else if (i == 2 && (numeros2[i] == numerosU1[1] || numeros2[i] == numerosU1[0] || numeros2[i] ==  numerosU1[3]) ){
						heridos++;
					} else if (i == 3 && (numeros2[i] == numerosU1[1] || numeros2[i] == numerosU1[2] || numeros2[i] ==  numerosU1[0]) ){
						heridos++;
					}
				}
				
				System.out.println(muertos + " muertos y " + heridos + " heridos");
				if(Arrays.equals(numeros2, numerosU1)) {
					winner = true;
					System.out.println(jugador1 + " ha ganado");
				}
				turno = 3;
				break;
			case 2:
				System.out.println("Turno del jugador 2");
				System.out.println("ingresa tus cuatro numeros separados por un espacios \"1 2 3 4\"");
				for(i = 0; i < 4; i++) {
					numerosU2[i] = reader.nextInt();
				}
				for(i = 0; i<4; i++) {
					if(numeros1[i] == numerosU2 [i]) {
					muertos++;
						
					} else if (i == 0 && (numeros1[i] == numerosU2[1] || numeros1[i] == numerosU2[2] || numeros1[i] ==  numerosU2[3]) ){
						heridos++;
					} else if (i == 1 && (numeros1[i] == numerosU2[0] || numeros1[i] == numerosU2[2] || numeros1[i] ==  numerosU2[3]) ){
						heridos++;
					} else if (i == 2 && (numeros1[i] == numerosU2[1] || numeros1[i] == numerosU2[0] || numeros1[i] ==  numerosU2[3]) ){
						heridos++;
					} else if (i == 3 && (numeros1[i] == numerosU2[1] || numeros1[i] == numerosU2[2] || numeros1[i] ==  numerosU2[0]) ){
						heridos++;
					}
				}
				System.out.println(muertos + " muertos y " + heridos + " heridos");
				if(Arrays.equals(numeros1, numerosU2)) {
					winner = true;
					System.out.println(jugador2 + " ha ganado");
				}
				break;
			}
		}
	}
	
	private static void Limpiar() {
		int i;
		for(i=0; i<=50; i++) {
			System.out.println("");
		}
	}
}
			