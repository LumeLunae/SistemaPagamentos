package modelo;

import java.time.LocalDate;

public abstract class Pagamento {
    protected double valor;
    protected LocalDate data;

    public Pagamento(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    // Método abstrato que será sobrescrito nas subclasses
    public abstract void processarPagamento();
}