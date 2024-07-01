package com.example.gestaoPedidos.service;


public class PedidoOnlineFactory extends PedidoFactory {
@Override
public Pedido criarPedido() {
  return new PedidoOnline();
}
}
