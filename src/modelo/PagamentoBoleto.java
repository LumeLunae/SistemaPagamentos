package modelo;

import java.time.LocalDate;

public class PagamentoBoleto extends Pagamento {

    private String codigoBarras;

    public PagamentoBoleto(double valor, LocalDate data, String codigoBarras) {
        super(valor, data);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Boleto...");
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Valor: R$" + valor + " | Data: " + data);
    }
}