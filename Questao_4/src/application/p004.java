package application;

import java.util.Scanner;

/*
  Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 */

public class p004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		int horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final: ");
		int horaFinal = sc.nextInt();
		
		int duracao;
	
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " horas");
		sc.close();
	}

}
