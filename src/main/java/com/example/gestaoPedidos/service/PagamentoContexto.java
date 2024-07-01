package com.example.gestaoPedidos.service;

public class PagamentoContexto {

	private Pagamento pagamento;

    public void setEstrategia(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void pagar(double quantia) {
    	pagamento.pagar(quantia);
    }
}
