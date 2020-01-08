package br.com.ricardo347.RepeatedString;

public class Pattern {

    public Pattern(){

    }

    public String generator(){
        return "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
    }

    public long play(String s, long n){
       Long fault = n % s.length();
       String tail = s.substring(0, Integer.valueOf(fault.intValue()) );

       int count = 0;
       int tailCount = 0;

       for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == 'a')
              count++;
          if(i < tail.length() && tail.charAt(i) == 'a')
              tailCount++;
       }



       System.out.println ((n / s.length() * count) + tailCount);
       return  (n / s.length() * count) + tailCount;
    }
}
