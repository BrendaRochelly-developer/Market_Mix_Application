package br.com.Market.Lirux.Shopping.Cart.Market;

public class Compra implements Comparable<Compra>{

    private String descricao;
    private double valor;

    public Compra(String nomeDoProduto, double valor) {
        this.descricao = nomeDoProduto;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + " valor=" + valor;
    }


    @Override
    public int compareTo(Compra outracompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outracompra.valor));
    }
}
