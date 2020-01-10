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

}
