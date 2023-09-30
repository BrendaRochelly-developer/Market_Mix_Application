package br.com.Market.Lirux.Shopping.Cart.Principal;

import br.com.Market.Lirux.Shopping.Cart.Market.MercadoApp;
import br.com.Market.Lirux.Shopping.Cart.Market.Shopping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> productList = getStrings();

        System.out.println("\nProduct Available: ");
        System.out.println("\n" + productList);


        Double limit = 150.0;
        MercadoApp cardBalance = new MercadoApp(limit);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n" + cardBalance);

        Scanner customerResponse = new Scanner(System.in);

        int exit = 1;

        while (exit != 0){

            System.out.println("\nEnter the product: ");
            String nameOfProduct = customerResponse.next();

            System.out.println("\nEnter the value of product: ");
            Double price = customerResponse.nextDouble();

            Shopping product = new Shopping(nameOfProduct, price);

            boolean purchaseMade = cardBalance.lancaCompras(product);

            if (purchaseMade) {
                System.out.println("\nPurchase made successfully!!");
                System.out.println("\nEnter the number 0 to exit or 1 to continue");
                exit = customerResponse.nextInt();
            }
            else {
                System.out.println("Insufficient funds!! Remove the products to continue with the purchase!");
                exit = 0;
            }

            System.out.println("\n+++++++++++++++++++++++++++++++");
            System.out.println("\nLIST OF PURCHASES MADE: \n");

            Collections.sort(cardBalance.getProducts());

            for (Shopping items : cardBalance.getProducts())
            {
               System.out.println(items.getProductDescription() + " - " + items.getValue());
            }

            System.out.println("\nCurrent Balance: " + cardBalance.getCardBalance());


        }



    }

    private static ArrayList<String> getStrings() {
        ArrayList<String> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add("Leite " +  4 + " reais");
        listaDeProdutos.add("Farinha " + 3 + " reais");
        listaDeProdutos.add("Coca-Cola " + 6 + " reais");
        listaDeProdutos.add("Biscoito " + 2 + " reais");
        listaDeProdutos.add("Feijão " + 5 + " reais");
        listaDeProdutos.add("Arroz " + 6 + " reais");
        listaDeProdutos.add("Maizena "+ 2 + " reais");
        listaDeProdutos.add("Café " + 8 + " reais");
        listaDeProdutos.add("Bolacha " + 3 + " reais");
        listaDeProdutos.add("Macarrão " + 4 + " reais");
        listaDeProdutos.add("Fralda " + 65 + " reais");
        listaDeProdutos.add("LeiteNinho " + 45 + " reais");
        return listaDeProdutos;
    }
}