package br.com.ricardo347;

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

}
