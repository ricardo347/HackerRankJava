package br.com.ricardo347.CountingValleys;

public class Hike {
    private String track;

    public Hike(){

    }

    public String generator(){
        return "UDDDUDUU";
    }

    public int countingValleys(int n, String s){
   
        System.out.println(v+v2);
        int sealvl = 0;
        int valleys = 0;
        for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == 'U')
               sealvl ++;
           if(s.charAt(i) == 'D')
               sealvl --;
           if(sealvl == -1 && s.charAt(i) == 'D')
               valleys ++;
        }
        return valleys;
    }
}
