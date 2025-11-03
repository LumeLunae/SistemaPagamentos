package modelo;

import java.time.LocalDate;

public class PagamentoCartaoCredito extends Pagamento {

    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, LocalDate data, String numeroCartao) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Cartão de Crédito...");
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Valor: R$" + valor + " | Data: " + data);
    }
}
