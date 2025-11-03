package servico;

import modelo.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class CaixaFinanceiro {
    private List<Pagamento> pagamentos;

    public CaixaFinanceiro() {
        pagamentos = new ArrayList<>();
    }

    public void adicionarPagamento(Pagamento p) {
        pagamentos.add(p);
    }

    public void executarPagamentos() {
        System.out.println("\n--- Executando todos os pagamentos ---");
        for (Pagamento p : pagamentos) {
            p.processarPagamento();
            System.out.println("---------------------------------------");
        }
    }
}
