package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Celular celular = new Celular();

        celular.bateria = 50;

        celular.carregarBateria();

        System.out.println("Bateria: " + celular.bateria);

        celular.reduzirBateria();

        System.out.println("Bateria: " + celular.bateria);

        celular.armazenamento = 50;

        celular.aumentarArmazenamento(20);

        System.out.println("Armazenamento: " + celular.armazenamento);

        celular.diminuirArmazenamento(10);

        System.out.println("Armazenamento: " + celular.armazenamento);

        celular.aumentarArmazenamento(-10);

        System.out.println("Armazenamento após valor inválido: " + celular.armazenamento);

        celular.diminuirArmazenamento(100);

        System.out.println("Armazenamento após diminuir valor inválido: " + celular.armazenamento);

        celular.bateria = 100;

        celular.carregarBateria();

        System.out.println("Bateria após tentar carregar cheia: " + celular.bateria);

        celular.bateria = 0;

        celular.reduzirBateria();

        System.out.println("Bateria após tentar reduzir em 0: " + celular.bateria);

        System.out.println("Celular criado!");
    }
}