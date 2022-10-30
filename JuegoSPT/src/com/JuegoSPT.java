package com;

import java.util.Scanner;

public class JuegoSPT {

	public static void main(String[] args) {
		// Inicio de Scanner

		Scanner teclado;
		teclado = new Scanner(System.in);

		// Declaración de variables, que servirán para que los jugadores puedan
		// introducir sus jugadas mas adelante.

		char jugadaJ1;
		char jugadaJ2;
		jugadaJ1 = ' ';
		jugadaJ2 = ' ';

		// Declaración de variables para incluir las puntuaciones de los jugadores.

		int puntosJ1;
		puntosJ1 = 0;
		int puntosJ2;
		puntosJ2 = 0;

		// Declaración de variable para las combinaciones de jugadas en las rondas entre
		// J1 y J2.
		String jugadasRonda;

		// Declaración variables Booleanas de validación.
		boolean validacionJ1;
		boolean validacionJ2;

//INSTRUCCIONES DE JUEGO

		// Mensaje con instrucciones y explicación de como se desarrollará el juego para
		// los usuarios.
		System.out.println("Hola, jugadores! Bienvenidos al torneo de piedra, papel o tijera.");
		System.out.println(
				"Se jugaran tres rondas, en las que cada uno de vosotros debera elegir que jugada quiere hacer a continuacion.");
		System.out.println("Al final de cada ronda se mostrará quién ha ganado la misma.");
		System.out.println("Si empatáis ambos os llevaréis el punto.");
		System.out.println(
				"Cada jugador tendra dos oprtunidades de introducir su jugada de forma correcta (por cada ronda)");
		System.out.println(
				"En caso de que uno de los jugadores no introduzca la jugada se otorgara un punto al contrincante");
		System.out.println(
				"En caso de que ninguno de los dos jugadores introduzcan una jugada correcta, ninguno de los dos obtendra puntos esa ronda");
		System.out.println("Cuando finalicen las tres rondas podréis ver cómo ha quedado el marcador.");
		System.out.println("BUENA SUERTE!");

//PRIMERA RONDA

		// Inicialización de las validaciones en true

		validacionJ1 = true;
		validacionJ2 = true;

		// Introducción de jugadas para la primera ronda
		System.out.println(
				"JUGADOR 1, es tu momento. Por favor, elige tu arma para esta primera ronda y escribe LA LETRA que le corresponda en MAYUSCULA.");
		System.out.println(
				"Si eliges piedra, escribe R (de Rock), si eliges papel, escribe P (de Paper), si eliges tijera, escribe S (de Scissor)");

		jugadaJ1 = teclado.next().charAt(0);

		if (jugadaJ1 != 'R' && jugadaJ1 != 'S' && jugadaJ1 != 'P') {
			System.out.println(
					"La jugada que has introducido no es una valor valido. Por favor, introducelo de nuevo corerectamente. Recuerda que debe ser R, S o P, en MAYUSCULAS.");
			jugadaJ1 = teclado.next().charAt(0);
			if (jugadaJ1 != 'R' && jugadaJ1 != 'S' && jugadaJ1 != 'P') {
				validacionJ1 = false;
			}
		}

		System.out.println("Ahora tu, JUGADOR 2. Elige tu arma y escribe su letra en MAYUSCULA.");
		System.out.println(
				"Si eliges piedra, escribe R (de Rock), si eliges papel, escribe P (de Paper), si eliges tijera, escribe S (de Scissor)");

		jugadaJ2 = teclado.next().charAt(0);

		if (jugadaJ2 != 'R' && jugadaJ2 != 'S' && jugadaJ2 != 'P') {
			System.out.println(
					"La jugada que has introducido no es una valor valido. Por favor, introducelo de nuevo corerectamente. Recuerda que debe ser R, S o P, en MAYUSCULAS.");
			jugadaJ2 = teclado.next().charAt(0);
			if (jugadaJ2 != 'R' && jugadaJ2 != 'S' && jugadaJ2 != 'P') {
				validacionJ2 = false;
			}
		}

		if (validacionJ1 == true && validacionJ2 == true) {

			jugadasRonda = "" + jugadaJ1 + jugadaJ2;

			switch (jugadasRonda) {

			// Casos con Piedra
			case "RR":
				System.out.println(
						"Piedra(R) vs Piedra(R).Ey, habeis empatado. Os llevais un punto cada uno en esta ronda.");
				puntosJ1 = puntosJ1 + 1;
				puntosJ2 = puntosJ2 + 1;
				break;
			case "RP":
				System.out.println("Piedra(R) vs Papel(P), gana Papel");
				puntosJ2 = puntosJ2 + 1;
				break;
			case "RS":
				System.out.println("Piedra(R) vs Tijeras(S), gana Piedra");
				puntosJ1 = puntosJ1 + 1;
				break;

			// Casos con Tijera
			case "SS":
				System.out.println(
						"Tijeras (S) vs Tijeras (S).Ey, habeis empatado. Os llevais un punto cada uno en esta ronda.");
				puntosJ1 = puntosJ1 + 1;
				puntosJ2 = puntosJ2 + 1;
				break;
			case "SR":
				System.out.println("Tijeras (T) vs Piedra (R), gana Piedra");
				puntosJ2 = puntosJ2 + 1;
				break;
			case "SP":
				System.out.println("Tijeras (S) vs Papel (P), gana Tijeras");
				puntosJ1 = puntosJ1 + 1;
				break;

			// Casos con Papel
			case "PP":
				System.out.println(
						"Papel (P) vs Papel (P).Ey, habeis empatado. Os llevais un punto cada uno en esta ronda.");
				puntosJ1 = puntosJ1 + 1;
				puntosJ2 = puntosJ2 + 1;
				break;
			case "PS":
				System.out.println("Papel (P) vs Tijeras (S), gana Tijeras");
				puntosJ2 = puntosJ2 + 1;
				break;
			case "PR":
				System.out.println("Papel (P) vs Piedra (R), gana Papel");
				puntosJ1 = puntosJ1 + 1;
				break;
			}
		} else {
			// Si la validacion 1 y validacion 2 son erroneas (false) muestro un mensaje
			if (validacionJ1 == false && validacionJ2 == false) {
				System.out.println(
						"Ambos jugadores habéis introducido jugadas erroneas. No os llevais ningun punto esta ronda.");
			} else {
				if (validacionJ1 == true) {
					System.out
							.println("El Jugador 2 ha introducido una jugada erronea. El punto se lo lleva Jugador 1.");
					puntosJ1 = puntosJ1 + 1;
				} else {
					System.out
							.println("El Jugador 1 ha introducido una jugada erronea. El punto se lo lleva Jugador 2.");
					puntosJ2 = puntosJ2 + 1;
				}
			}
		}

//MARCADORES FINALES		

		System.out.println("Ya hemos acabado las tres rondas. A continuación os mostraremos los marcadores finales.");
		System.out.println("El JUGADOR 1 ha obtenido la puntuacion de " + puntosJ1
				+ ", y el JUGADOR 2 ha obtenido la puntuacion de " + puntosJ2 + ".");
		if (puntosJ1 > puntosJ2) {
			System.out.println("FELICIDADES JUGADOR 1!!");
		} else {
			if (puntosJ1 < puntosJ2) {
				System.out.println("FELICIDADES JUGADOR 2!!");
			} else {
				System.out.println("HABEIS EMPATADO EN TODAS LAS RONDAS!!");
			}
		}

		teclado.close();

	}

}
