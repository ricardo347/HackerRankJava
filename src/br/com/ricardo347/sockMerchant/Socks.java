package br.com.ricardo347.sockMerchant;

import java.util.*;


public class Socks {

    private ArrayList<Integer> socks;
    private int ar[];
    private long a;

    public Socks(){
        //this.socks = new ArrayList<>();//new ArrayList<>(Arrays.asList(1,2,1,3,3,1,1,3,2,1,2,3,1,1));

    }

    private void generate(int n) {
        this.socks = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++ ){
            this.socks.add((int)(Math.random() * 100  + 1));
        }

        /*System.out.println("Tamanho do vetor: " + this.socks.size());
        for (int sock:socks) {
           sb.append(", ");
           sb.append(sock);
        }
        System.out.println(sb.toString());*/
    }

    private void generateOld(int n){
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        this.ar = new int[n] ;
        for(int i = 0; i < n; i++){
            ar[i] = (int)(Math.random() * 3  + 1);
        }
        System.out.println("Tamanho do vetor: " + ar.length);
        for (int i:ar) {
           sb.append(", ");
           sb.append(i);
        }
        System.out.println(sb.toString());
        System.out.println("Tamanho do vetor: " + ar.length);
        long finish = System.nanoTime();
        System.out.println((finish-start) / 1000000f);

    }

    public int getPairs(int n) {
        //long start = System.nanoTime();
        generateOld(n);
        int pairs = 0;

        Map<Integer, Integer> colors = new HashMap<Integer, Integer>();

        for(int i = 0; i < ar.length; i++){
           if(colors.containsKey(ar[i])){
               colors.replace(ar[i], colors.get(ar[i]) + 1);
           }else{
               colors.put(ar[i], 1) ;
           }
        }

        for(Map.Entry<Integer,Integer> color: colors.entrySet()){
            pairs = pairs + color.getValue() / 2;
        }

        //long finish = System.nanoTime();
       // System.out.println((finish-start) / 1000000f);
        System.out.println(pairs);
        return pairs;
    }

    public int getPairsOld(int n){

        long start = System.nanoTime();
        int pairs = 0;
        Set<Integer> colors = new HashSet<>();
        generate(n);

        for(int i = 0; i < socks.size(); i++){
            if(!colors.contains(socks.get(i))){
                colors.add(socks.get(i));
            }else{
                pairs++;
                colors.remove(socks.get(i));
            }
        }
        long finish = System.nanoTime();
        System.out.println((finish-start) / 1000000f);
        return pairs;
    }
}

