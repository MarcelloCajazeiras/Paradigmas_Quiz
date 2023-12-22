package org.example;

public class Perguntas {
    private String pergunta;
    private String[] alternativas;
    private int[] respostasCorretas;

    public Perguntas(String pergunta, String[] alternativas, int[] respostasCorretas) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostasCorretas = respostasCorretas;
    }

    public void exibirPergunta() {
        System.out.println(pergunta);
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println("  " + (i + 1) + ". " + alternativas[i]);
        }
    }

    public boolean verificarResposta(int resposta) {
        for (int respostaCorreta : respostasCorretas) {
            if (resposta == respostaCorreta) {
                return true;
            }
        }
        return false;
    }

    public int[] getRespostasCorretas() {
        return respostasCorretas;
    }

    public String[] getAlternativas() {
        return alternativas;
    }
}
