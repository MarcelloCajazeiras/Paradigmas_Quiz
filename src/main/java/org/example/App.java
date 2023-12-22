package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        System.out.println("BEM - VINDO AO QUIZ DE PARADIGMAS DE LINGUAGEM DE PROGRAMAÇÃO ");
        System.out.println("");
        System.out.println("Responda as Perguntas Selecionadas");
        System.out.println("");

        Perguntas[] perguntas = {
                new Perguntas("a. O que é programação estruturada?", new String[] {"Um paradigma de programação que usa sequência lógica de instruções.", "Uma linguagem de programação.", "Um Banco de Dados."}, new int[] {1}),
                new Perguntas("b. Quais as características da programação estruturada?", new String[] {"Nenhuma.", "Usar Threads.", "Divisão de código em módulos."}, new int [] {3}),
                new Perguntas("c. O que é programação orientada a objetos (POO)?", new String[] {"Um estilo de programação baseado em objetos reais.", "Uma Linguagem que possui objetos como símbolos.", "Um Jogo de Programar."}, new int[] {1}),
                new Perguntas("d. O que é Herança?", new String[] {"Um erro de compilação", "Um conceito que permite uma classe herdar propriedades de outra.", "Uma Erro sql."}, new int [] {2}),
                new Perguntas("e. O que é Interfaces?", new String[] {"Uma rede de comptadores.", "não sei.", "Uma maneira de conectar diferentes classes."}, new int[] {3}),
                new Perguntas("f. O que é Polimorfismo?", new String[] {"Um conceito que permite objetos de diferentes classes serem tratados como objetos de uma classe comum.", "Uma Doença.", "Uma Variante do Covid 19."}, new int [] {1}),};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ": ");
            perguntas[i].exibirPergunta();

            System.out.print("Sua resposta (digite o número da alternativa): ");
            int respostaJogador = scanner.nextInt();

            if (perguntas[i].verificarResposta(respostaJogador)) {
                System.out.println("Correto! +5 pontos");
                pontuacao += 5;
            } else {
                System.out.println("Incorreto! -1 ponto");
                pontuacao--;
            }
        }

        System.out.println("Pontuação final: " + pontuacao);

        System.out.println("Respostas corretas:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ": ");
            for (int respostaCorreta : perguntas[i].getRespostasCorretas()) {
                System.out.println("  " + respostaCorreta + ". " + perguntas[i].getAlternativas()[respostaCorreta - 1]);
            }
        }
    }
}