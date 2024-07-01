package com.example.gestaoPedidos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestaoPedidos.service.PagamentoContexto;
import com.example.gestaoPedidos.service.Pedido;
import com.example.gestaoPedidos.service.PedidoFactory;
import com.example.gestaoPedidos.service.PedidoLojaFisicaFactory;
import com.example.gestaoPedidos.service.PedidoOnlineFactory;
import com.example.gestaoPedidos.service.strategy.PagamentoCartaoCredito;
import com.example.gestaoPedidos.service.strategy.PagamentoPaypal;

 @RestController
 @RequestMapping("/pedido")
 public class PedidoController {

	 @GetMapping("/criarPedido")
	 public String criarPedido(@RequestParam String tipo) {
	 		PedidoFactory factory;
	 		if ("online".equalsIgnoreCase(tipo)) {
	 			factory = new PedidoOnlineFactory();
	 		} else if ("loja".equalsIgnoreCase(tipo)) {
	 			factory = new PedidoLojaFisicaFactory();
	 		} else {
	 			return "Tipo de pedido inválido.";
	 		}

	 		Pedido pedido = factory.criarPedido();
	 		pedido.processar();
	 		return "Pedido criado com sucesso!";
	 	}

	 	@GetMapping("/pagar")
	 	public String pagar(@RequestParam String metodo, @RequestParam double
	 			quantia) {
	 		PagamentoContexto contexto = new PagamentoContexto();

	 		if ("cartao".equalsIgnoreCase(metodo)) {
	 			contexto.setEstrategia(new PagamentoCartaoCredito());
	 		} else if ("paypal".equalsIgnoreCase(metodo)) {
	 			contexto.setEstrategia(new PagamentoPaypal());
	 		} else {
	 			return "Método de pagamento inválido.";
	 		}

	 		contexto.pagar(quantia);
	 		return "Pagamento realizado com sucesso!";
	 	}
 }
