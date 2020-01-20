package br.com.ricardo347;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Tools {

    public static void debug(List<List<Integer>> grid, int i, int j){
        System.out.println(" ");
        System.out.printf("i:%d - j:%d",i,j);
        System.out.println(" -----------------------------");
        for(int y = 0; y < grid.size(); y++){
            System.out.println(" ");
            for(int x = 0; x < grid.get(y).size(); x++)
                System.out.printf("%d ",grid.get(y).get(x));
        }
        System.out.println(" ");
    }

    public static void debugDouble(List<List<Integer>> grid, List<List<Integer>> temp, int i, int j){
        System.out.println(" ");
        System.out.printf("i:%d - j:%d\n",i,j);
        System.out.println(" -----------------------------");
        for(int y = 0; y < grid.size(); y++){
            System.out.println(" ");
            for(int x = 0; x < grid.get(y).size(); x++)
                System.out.printf("%d ",grid.get(y).get(x));
            System.out.printf("   ");
            for(int z = 0; z < temp.get(y).size(); z++)
                System.out.printf("%d ",temp.get(y).get(z));
        }
        System.out.println(" ");
    }

    public static String arrayStringfy(String s){
        String base = s.replace(" ",",").trim();
        System.out.printf(base);
        return s;
    }

    public static List<String> resultFileToArray(String filePath){
        BufferedReader reader;
        List<String> result = new ArrayList<>();
        try{
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null){
                result.add(line.trim());
                line = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

    public static List<List<Object>> fileToArray(String filepath){
        BufferedReader reader;
        List<List<Object>> testCases = new ArrayList<>();
        try{
            reader = new BufferedReader(new
                    FileReader(filepath));
            int cont =0;
            String line = reader.readLine();
            while(line != null){
               // System.out.println(line);
                testCases.add(new ArrayList<>());

                if(cont%2 == 0){
                    //String params = line.replace(" ","").trim();
                    String[] params = line.trim().split(" ");
                    testCases.get(cont).add(Integer.valueOf(params[0]));
                    testCases.get(cont).add(Integer.valueOf(params[1]));
                }else{
                    String arr = line.replace(" ", "").trim();
                    int[] temp = new int[arr.length()];
                    for(int i = 0;i < arr.length(); i++ ){
                       temp[i] = Character.getNumericValue(arr.charAt(i));
                        //System.out.printf("%d",Character.getNumericValue(arr.charAt(i)));
                    }
                   // System.out.println(" ");
                    testCases
                            .get(cont)
                            .add(temp);
                }

                line = reader.readLine();
                cont++;
            }
            System.out.println("##########################################");
            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        return testCases;
    }

}
