package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo2 {

	public static void main(String[] args) {
		
		//declararar variaveis usadas na aplicação
		int escolhaJogador, escolhaComputador;
		Scanner leitor = new Scanner(System.in);
	    Random sorteio = new Random();
		
		//criar a tela do usuario
		System.out.println("*****JOKENPÔ*****");
		System.out.println();
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("-----------------");
		System.out.println("Qual a sua escolha? ( 1 - 3");
		
		// Determinar a escolha do usuário
				escolhaJogador = leitor.nextInt();
				leitor.close();
				
				// Determinar a escolha do computador
				escolhaComputador = sorteio.nextInt(1, 4);
				
				// Exibir as escolhas de cada jogador
				if (escolhaJogador == 1) {
					System.out.println("Você escolheu PEDRA!");
				}
				
				if (escolhaJogador == 2) {
					System.out.println("Você escolheu PAPEL!");
				}
				
				if (escolhaJogador == 3) {
					System.out.println("Você escolheu TESOURA!");
				}
				
				if (escolhaJogador < 0 || escolhaJogador > 3) {
					System.out.println("Jogador escolheu opção incorreta. Jogo cancelado!!");
				}
				
				if (escolhaComputador == 1) {
					System.out.println("Computador escolheu PEDRA!");
				}
				
				if (escolhaComputador == 2) {
					System.out.println("Computador escolheu PAPEL!");
				}
				
				if (escolhaComputador == 3) {
					System.out.println("Computador escolheu TESOURA!");
				}
				
				// Determinar quem venceu o jogo
				if (escolhaJogador == 1) {
					if (escolhaComputador == 1) {
						System.out.println("O jogo EMPATOU!!");
					}
					if (escolhaComputador == 2) {
						System.out.println("O computador VENCEU!!");
					}
					if (escolhaComputador == 3) {
						System.out.println("O humano VENCEU!!");
					}
				}
				
				if (escolhaJogador == 2) {
					if (escolhaComputador == 1) {
						System.out.println("O humano VENCEU!!");
					}
					if (escolhaComputador == 2) {
						System.out.println("O jogo EMPATOU!!");
					}
					if (escolhaComputador == 3) {
						System.out.println("O computador VENCEU!!");
					}
				}
				
				if (escolhaJogador == 3) {
					if (escolhaComputador == 1) {
						System.out.println("O computador VENCEU!!");
					}
					if (escolhaComputador == 2) {
						System.out.println("O humano VENCEU!!");
					}
					if (escolhaComputador == 3) {
						System.out.println("O jogo EMPATOU!!");
					}
				}

			}

		}