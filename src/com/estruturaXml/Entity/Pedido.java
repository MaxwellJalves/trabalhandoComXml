package com.estruturaXml.Entity;

public class Pedido {
    private int id;
    private int cdLojaParceira ;
    private Cliente cliente;
    Produto pedidoItem;

    public Pedido(int id, int cdLojaParceira) {
        this.id = id;
        this.cdLojaParceira = cdLojaParceira;
    }

    public Pedido(int id, int cdLojaParceira, Cliente cliente, Produto pedidoItem) {
        this.id = id;
        this.cdLojaParceira = cdLojaParceira;
        this.cliente = cliente;
        this.pedidoItem = pedidoItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCdLojaParceira() {
        return cdLojaParceira;
    }

    public void setCdLojaParceira(int cdLojaParceira) {
        this.cdLojaParceira = cdLojaParceira;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getPedidoItem() {
        return pedidoItem;
    }

    public void setPedidoItem(Produto pedidoItem) {
        this.pedidoItem = pedidoItem;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cdLojaParceira=" + cdLojaParceira +
                ", cliente=" + cliente +
                ", pedidoItem=" + pedidoItem +
                '}';
    }
}
