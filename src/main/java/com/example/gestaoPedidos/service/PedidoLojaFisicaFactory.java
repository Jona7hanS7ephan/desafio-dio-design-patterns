package com.example.gestaoPedidos.service;

public class PedidoLojaFisicaFactory extends PedidoFactory {
	
	@Override
	public Pedido criarPedido() {
		return new PedidoLojaFisica();
	}
}
