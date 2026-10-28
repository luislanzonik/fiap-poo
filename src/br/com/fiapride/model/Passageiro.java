package br.com.fiapride.model;

/** Passageiro do sistema FiapRide (aulas 1 a 5). */
public class Passageiro {
    private final String nome;
    private double saldo;

    public Passageiro() {
        this("Não informado", 0);
    }

    public Passageiro(String nome, double saldo) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do passageiro é obrigatório.");
        }
        if (!Double.isFinite(saldo) || saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial inválido.");
        }
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
        this.saldo += valor;
    }

    public boolean descontarSaldo(double valor) {
        if (!Double.isFinite(valor) || valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
