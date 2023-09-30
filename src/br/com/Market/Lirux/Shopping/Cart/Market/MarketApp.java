package br.com.Market.Lirux.Shopping.Cart.Market;

import java.util.ArrayList;
import java.util.List;

public class MercadoApp {

    private double creditCardLimit;
    private double cardBalance;
    private List<Shopping> products;

    public MercadoApp(double newLimit) {
        this.creditCardLimit = newLimit;
        this.cardBalance = newLimit;
        this.products = new ArrayList<>();
    }

    public boolean lancaCompras(Shopping compra) {
        if (this.cardBalance > compra.getValue()){
            this.cardBalance -= compra.getValue();
            this.products.add(compra);
            return true;
        }
        else {
            return false;
        }
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public List<Shopping> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Food voucher balance: R$" + this.cardBalance;
    }
}
