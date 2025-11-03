import modelo.*;
import servico.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CaixaFinanceiro caixa = new CaixaFinanceiro();

        Pagamento cartao = new PagamentoCartaoCredito(250.00, LocalDate.now(), "1234-****-****-5678");
        Pagamento pix = new PagamentoPix(120.50, LocalDate.now(), "arthur@email.com");
        Pagamento boleto = new PagamentoBoleto(500.00, LocalDate.now(), "34191.79001 01043.510047 91020.150008 9 99990000050000");

        caixa.adicionarPagamento(cartao);
        caixa.adicionarPagamento(pix);
        caixa.adicionarPagamento(boleto);

        caixa.executarPagamentos();
    }
}
