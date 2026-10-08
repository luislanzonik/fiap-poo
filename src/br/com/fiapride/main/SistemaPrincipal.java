
package br.com.fiapride.main;

import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.Android;
import br.com.fiapride.model.Iphone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // 1. Criando o dono e o celular
        Dono dono = new Dono("Luis", 20);
        Celular celular = new Celular(dono);

        // 2. Mostrando as informações do dono
        System.out.println("Dono: " + celular.getProprietario().getNome());
        System.out.println("Idade: " + celular.getProprietario().getIdade());

        // 3. Testando o carregamento da bateria
        celular.bateria = 50;
        celular.carregarBateria();
        System.out.println("Bateria: " + celular.bateria);

        // 4. Testando a redução da bateria
        celular.reduzirBateria();
        System.out.println("Bateria: " + celular.bateria);

        // 5. Testando o aumento do armazenamento
        celular.armazenamento = 50;
        celular.aumentarArmazenamento(20);
        System.out.println("Armazenamento: " + celular.armazenamento);

        // 6. Testando a diminuição do armazenamento
        celular.diminuirArmazenamento(10);
        System.out.println("Armazenamento: " + celular.armazenamento);

        // 7. Testando valores inválidos no armazenamento
        celular.aumentarArmazenamento(-10);
        System.out.println("Armazenamento após valor inválido: " + celular.armazenamento);

        celular.diminuirArmazenamento(100);
        System.out.println("Armazenamento após diminuir valor inválido: " + celular.armazenamento);

        // 8. Testando a bateria quando está cheia
        celular.bateria = 100;
        celular.carregarBateria();
        System.out.println("Bateria após tentar carregar cheia: " + celular.bateria);

        // 9. Testando a bateria quando está vazia
        celular.bateria = 0;
        celular.reduzirBateria();
        System.out.println("Bateria após tentar reduzir em 0: " + celular.bateria);

        System.out.println("Celular criado!");

        // 10. Criando e testando o Android (herança)
        Android samsung = new Android(dono, true);

        System.out.println("\n--- Android ---");
        System.out.println("Dono: " + samsung.getProprietario().getNome());
        System.out.println("Possui digital: " + samsung.isTemDigital());

        // 11. Criando e testando o Iphone (herança)
        Iphone iphone = new Iphone(dono, true);

        System.out.println("\n--- Iphone ---");
        System.out.println("Dono: " + iphone.getProprietario().getNome());
        System.out.println("Possui Face ID: " + iphone.isTemFaceID());
    }
}
