package br.com.ricardo347;

import br.com.ricardo347.sockMerchant.Socks;

public class Main {

    public static void main(String[] args) {
        Socks s = new Socks();
        s.generate(200000000);
        //s.generate1(200000000);
    }
}
