package br.com.ricardo347.Java1DGame;


import br.com.ricardo347.Tools;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        Game1D g = new Game1D();

        List<List<Object>> testCases = Tools.fileToArray("C:\\Users\\rgoncalves\\Desktop\\java1d.txt");
        //int[] arr = (int[]) testCases.get(0).get(2);
        /*int[] a = (int[]) testCases.get(1).get(0);

        System.out.println(testCases.size());
        System.out.println(testCases.get(0).toString());*/

        List<String> results = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < testCases.size(); i +=2){
            int[] temp = (int[]) testCases.get(i+1).get(0);
            //boolean result = g.play((int) testCases.get(i).get(1), temp );
            boolean result = g.rPlay(0,(int) testCases.get(i).get(1), temp );
            if(result){
                results.add("YES");
                //System.out.println(count+" YES");
            }
            else{
                results.add("NO");
                //System.out.println(count+" NO");
            }
            count++;
        }

        List<String> officialResults = Tools.resultFileToArray("C:\\Users\\rgoncalves\\Desktop\\results.txt");
        for(int i = 0; i < officialResults.size(); i++){
            if(!(officialResults.get(i).equals(results.get(i)))){
                System.out.printf("%d - %s %s %d %d\n",
                        i+1,
                        officialResults.get(i),
                        results.get(i),
                        testCases.get(i*2).get(0),
                        testCases.get(i*2).get(1));
            }
            //System.out.printf("%d %s \n",i,officialResults.get(i));
        }

        //Tools.fileToArray("C:\\Users\\rgoncalves\\Desktop\\java1d.txt");
        //Tools.arrayStringfy("0 1 1 0 1 1 1 1 1 1 1 0 1 1 0 1 1 1 1 0 0 0 0 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 0 1 0 1 1 1 1 1 0 1 0 1 1 1 1 1 1 1 1 0 1 1 0 0 0 1 0 1 0 1");

       /*if(g.play(3,g.longTestCaseGenerator()))
            System.out.printf("YES");
        else
            System.out.printf("NO");*/
        //if(g.rPlay(0,5,g.defaltTestCaseGenerator()))
        //if(g.rPlay(0,3,g.testCase1Generator()))
        //if(g.rPlay(0,0,g.longTestCaseGenerator()))
        /*if(g.rPlay(0,4,g.testCaseNo1Generator()))
            System.out.printf("YES");
        else
            System.out.printf("NO");*/

      //Tools.arrayStringfy("0 1 1 0 0 0 1 1 0 1 1 0 0 1 1 1 1 1 1 1 1 1 0 1 1 0 0 1 1 1 0 0 0 1 0 1 1 0 1 1 1 1 1 0 1 1 1 0 1 1 0");

    }
}
