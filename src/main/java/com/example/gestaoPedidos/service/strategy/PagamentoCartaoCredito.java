package com.example.gestaoPedidos.service.strategy;

import com.example.gestaoPedidos.service.Pagamento;

public class PagamentoCartaoCredito implements Pagamento {
	
	 @Override
	    public void pagar(double quantia) {
	        System.out.println("Pagamento de " + quantia + " realizado com cartão de crédito.");
	    }

}
