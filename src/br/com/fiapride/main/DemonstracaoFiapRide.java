package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Rastreavel;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;
import java.util.ArrayList;
import java.util.List;

/** Teste integrado de POO do exemplo FiapRide (Aulas 1–9). */
public class DemonstracaoFiapRide {
    public static void main(String[] args) {
        System.out.println("=== FIAPRIDE — AULAS 1 A 9 ===");

        // Aulas 1–4: objetos, métodos, encapsulamento e construtores.
        Passageiro passageiroPadrao = new Passageiro();
        Passageiro ana = new Passageiro("Ana Silva", 150.0);
        ana.adicionarSaldo(50.0);
        System.out.println("Passageiro padrão: " + passageiroPadrao.getNome());
        System.out.println("Passageira: " + ana.getNome() + " | Saldo: " + ana.getSaldo());

        // Aulas 6–8: herança, polimorfismo e classes abstratas.
        Veiculo carro = new Carro("ABC-1234", "Honda Civic");
        Veiculo moto = new Moto("DEF-5678", "Honda CG 160");
        carro.abastecer(50);
        moto.abastecer(50);
        // Não compila: Veiculo generico = new Veiculo("AAA-1234", "Genérico");
        List<Veiculo> frota = new ArrayList<>();
        frota.add(carro);
        frota.add(moto);
        for (Veiculo veiculo : frota) {
            veiculo.exibirTipo();
            System.out.println(veiculo.getModelo() + " — " + veiculo.calcularAutonomia());
        }

        // Aula 5: associação — a viagem recebe os objetos completos.
        Viagem viagem = new Viagem(ana, carro, 10.0);
        System.out.println(viagem.resumo());
        System.out.println("Viagem concluída: " + viagem.concluir());
        System.out.println("Saldo após viagem: " + ana.getSaldo());

        // Aula 9: interface e polimorfismo por contrato.
        List<Rastreavel> rastreaveis = new ArrayList<>();
        rastreaveis.add((Carro) carro);
        rastreaveis.add((Moto) moto);
        System.out.println("Tecnologia padrão: " + Rastreavel.TECNOLOGIA_PADRAO);
        for (Rastreavel item : rastreaveis) {
            System.out.println(item.rastrear());
        }
    }
}
