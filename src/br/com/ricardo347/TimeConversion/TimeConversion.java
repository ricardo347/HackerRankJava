package br.com.ricardo347.TimeConversion;

public class TimeConversion {
    public TimeConversion(){

    }

    public String generator(){
       return"12:45:54PM";
    }

    public String play(String s){
        String hour = s.substring(0, 2);
        if(s.charAt(s.length()-2) == 'P' && !s.substring(0,2).equals("12")) {
            System.out.println(String.valueOf(12 + Integer.valueOf(hour)) + s.substring(2, s.length()-2));
            return String.valueOf(12 + Integer.valueOf(hour)) + s.substring(2, s.length()-2);

        }else if(s.substring(0,2).equals("12") && s.charAt(s.length()-2) == 'A'){
            System.out.println("00"+ s.substring(2, s.length()-2));
            return String.valueOf("00"+ s.substring(2, s.length()-2));
        }
        System.out.println(s.substring(0, s.length()-2));
        return s.substring(0, s.length()-2);
    }
}
