package br.com.ricardo347.RepeatedString;



public class Pattern {
    public Pattern(){

    }

    public String generator(){
        return "aba";
    }

    public int play(String s, long n){
       long fault = n % s.length();
       StringBuilder sb = new StringBuilder();
       sb.append(s);

       int count = 0;

       for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == 'a')
              count ++;
       }

       System.out.println(fault);
       System.out.println(1000);
       return 0;
    }
}
