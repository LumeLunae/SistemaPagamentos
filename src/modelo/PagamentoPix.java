package modelo;

import java.time.LocalDate;

public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(double valor, LocalDate data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Pix...");
        System.out.println("Chave PIX: " + chavePix);
        System.out.println("Valor: R$" + valor + " | Data: " + data);
    }
}