package br.com.ricardo347.CountingValleys;

public class Hike {
    private String track;

    public Hike(){

    }

    public String generator(){
        return "UDDDUDUU";
    }

    public int countingValleys(int n, String s){


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

    public void mmc(float n){

        for(int i = 1; i<=n; i++){
            if(n%i == 0)
                System.out.printf("%f / %d = %f\n",n,i,n/i);
        }
    }
}
