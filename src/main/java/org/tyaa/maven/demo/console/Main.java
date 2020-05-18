package org.tyaa.maven.demo.console;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        // System.out.println("Hello Maven!");
        Gson gson = new Gson();
        String message =
            gson.toJson(new String[]{"Hello ", "Maven!"});
        System.out.println(message);

        Product product =
                new Product("P1", new BigDecimal(1000));
        String productMessage =
                gson.toJson(product);
        System.out.println(productMessage);
    }
}
