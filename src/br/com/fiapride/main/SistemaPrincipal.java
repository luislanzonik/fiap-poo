
package br.com.fiapride.main;

import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.Android;
import br.com.fiapride.model.Iphone;
import br.com.fiapride.model.Conectavel;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // 1. Criando o dono e o celular
        Dono dono = new Dono("Luis", 20);
        Celular celular = new Android(dono, true);

        // 2. Mostrando as informações do dono
        System.out.println("Dono: " + celular.getProprietario().getNome());
        System.out.println("Idade: " + celular.getProprietario().getIdade());

        // 3. Testando o carregamento da bateria
        celular.setBateria(50);
        celular.carregarBateria();
        System.out.println("Bateria: " + celular.getBateria());

        // 4. Testando a redução da bateria
        celular.reduzirBateria();
        System.out.println("Bateria: " + celular.getBateria());

        // 5. Testando o aumento do armazenamento
        celular.setArmazenamento(50);
        celular.aumentarArmazenamento(20);
        System.out.println("Armazenamento: " + celular.getArmazenamento());

        // 6. Testando a diminuição do armazenamento
        celular.diminuirArmazenamento(10);
        System.out.println("Armazenamento: " + celular.getArmazenamento());

        // 7. Testando valores inválidos no armazenamento
        celular.aumentarArmazenamento(-10);
        System.out.println("Armazenamento após valor inválido: " + celular.getArmazenamento());

        celular.diminuirArmazenamento(100);
        System.out.println("Armazenamento após diminuir valor inválido: " + celular.getArmazenamento());

        // 8. Testando a bateria quando está cheia
        celular.setBateria(100);
        celular.carregarBateria();
        System.out.println("Bateria após tentar carregar cheia: " + celular.getBateria());

        // 9. Testando a bateria quando está vazia
        celular.setBateria(0);
        celular.reduzirBateria();
        System.out.println("Bateria após tentar reduzir em 0: " + celular.getBateria());

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

        // 12. Aula 7 - Polimorfismo de Sobrescrita
        System.out.println("\n--- POLIMORFISMO ---");

        samsung.setBateria(100);
        iphone.setBateria(100);

        List<Celular> celulares = new ArrayList<>();

        celulares.add(samsung);
        celulares.add(iphone);

        for (Celular aparelho : celulares) {
            System.out.println(aparelho.calcularAutonomia());
        }

        // 13. Aula 8 - Classes Abstratas
        System.out.println("\n--- CLASSES ABSTRATAS ---");

        // Classe abstrata não pode ser instanciada.
        // Celular teste = new Celular(dono);

        Celular androidTeste = new Android(dono, true);
        Celular iphoneTeste = new Iphone(dono, true);

        System.out.println(androidTeste.exibirSistemaOperacional());
        System.out.println(iphoneTeste.exibirSistemaOperacional());

        // 14. Aula 3 - Encapsulamento
        System.out.println("\n--- ENCAPSULAMENTO ---");

        celular.setMarca("Samsung");
        System.out.println("Marca: " + celular.getMarca());

        celular.setBateria(150);
        System.out.println("Bateria após valor inválido: " + celular.getBateria());

        celular.setArmazenamento(-50);
        System.out.println("Armazenamento após valor inválido: " + celular.getArmazenamento());

        // 15. Aula 4 - Construtores
        System.out.println("\n--- CONSTRUTORES ---");

        // Testando construtores padrão
        Android androidPadrao = new Android();
        Iphone iphonePadrao = new Iphone();

        System.out.println("Android padrão:");
        System.out.println("Dono: " + androidPadrao.getProprietario().getNome());
        System.out.println("Possui digital: " + androidPadrao.isTemDigital());

        System.out.println("iPhone padrão:");
        System.out.println("Dono: " + iphonePadrao.getProprietario().getNome());
        System.out.println("Possui Face ID: " + iphonePadrao.isTemFaceID());

        // Testando construtores personalizados
        Android androidPersonalizado = new Android(dono, true);
        Iphone iphonePersonalizado = new Iphone(dono, true);

        System.out.println("Android personalizado:");
        System.out.println("Dono: " + androidPersonalizado.getProprietario().getNome());
        System.out.println("Possui digital: " + androidPersonalizado.isTemDigital());

        System.out.println("iPhone personalizado:");
        System.out.println("Dono: " + iphonePersonalizado.getProprietario().getNome());
        System.out.println("Possui Face ID: " + iphonePersonalizado.isTemFaceID());

        // 16. Aula 9 - Interfaces
        System.out.println("\n--- INTERFACES ---");

        System.out.println("Rede padrão: " + Conectavel.REDE_PADRAO);

        // Lista de objetos que implementam a interface
        List<Conectavel> dispositivos = new ArrayList<>();

        dispositivos.add(samsung);
        dispositivos.add(iphone);

        // Testando o método da interface
        for (Conectavel dispositivo : dispositivos) {
            System.out.println(dispositivo.conectar());
        }

    }
}
