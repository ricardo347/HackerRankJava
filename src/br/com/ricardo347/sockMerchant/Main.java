package br.com.ricardo347.sockMerchant;

public class Main {

    public static void main(String[] args) {
        Socks s = new Socks();
        System.out.println(s.getPairs(10));
        //acima dos 6 milhoes, a minha implementação vence.
        ;//System.out.println(s.getPairsOld(6000000));
    }
}
