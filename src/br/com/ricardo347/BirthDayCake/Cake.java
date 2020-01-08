package br.com.ricardo347.BirthDayCake;

public class Cake {
    public Cake(){

    }
    public int[] generator(){
        return new int[] {3,2,1,3};
    }
    public int play(int[] ar){
        int result =0;
        int maxvalue = 0;

        for(int i =0;i < ar.length; i++){
            if(ar[i] > maxvalue) {
                maxvalue = ar[i];
                result = 1;
            }
            else if(ar[i] == maxvalue)
                result ++;
        }
        System.out.println(result);
        return result;
    }
}
