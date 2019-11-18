package br.com.ricardo347.sockMerchant;

import java.util.ArrayList;

public class Socks {
    public Socks(){

    }
    public ArrayList<Integer> generate(int n) {
        long start = System.nanoTime();
        ArrayList<Integer> socks = new ArrayList<>();

        for(int i = 0; i < n; i++ ){
            socks.add((int)(Math.random() * 3  + 1));
        }

        System.out.println("Tamanho do vetor: "+socks.size());
        long finish = System.nanoTime();
        System.out.println(start);
        System.out.println(finish);
        System.out.println((finish-start) / 1000000f);
        return socks;
    }

    public int[] generate1(int n){
        long start = System.nanoTime();
        int x[] = new int[n] ;
        for(int i = 0; i < n; i++){
            x[i] = (int)(Math.random() * 3  + 1);
        }
        System.out.println("Tamanho do vetor: "+x.length);
        long finish = System.nanoTime();
        System.out.println(start);
        System.out.println(finish);
        System.out.println((finish-start) / 1000000f);
        return x;
    }

    public int getPairs() {
        
        return 0;
    }

    public int getPairs1(){
        return 0;
    }
}
