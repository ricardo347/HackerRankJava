package br.com.ricardo347.RepeatedString;

public class Pattern {
    public Pattern(){

    }

    public String generator(){
        return "aba";
    }

    public int play(String s, long n){
        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < n; i++){
            sb.append(s);
        }

        System.out.println(1);
        return 0;
    }
}
