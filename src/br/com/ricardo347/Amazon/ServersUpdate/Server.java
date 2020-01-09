package br.com.ricardo347.Amazon.ServersUpdate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Server {
    public Server(){

    }
    public List<List<Integer>> generatorTestCase3(){
        List<List<Integer>> result = new ArrayList<>();
        result.add(0, new ArrayList<>());
        result.add(1, new ArrayList<>());
        result.add(2, new ArrayList<>());
        result.add(3, new ArrayList<>());
        result.add(4, new ArrayList<>());

        result.get(0).add(0,1);
        result.get(0).add(1,1);
        result.get(0).add(2,0);
        result.get(0).add(3,0);

        result.get(1).add(0,0);
        result.get(1).add(1,1);
        result.get(1).add(2,0);
        result.get(1).add(3,0);

        result.get(2).add(0,0);
        result.get(2).add(1,0);
        result.get(2).add(2,0);
        result.get(2).add(3,0);

        result.get(3).add(0,1);
        result.get(3).add(1,0);
        result.get(3).add(2,1);
        result.get(3).add(3,1);

        result.get(4).add(0,1);
        result.get(4).add(1,1);
        result.get(4).add(2,1);
        result.get(4).add(3,1);

        return result;
    }
    public List<List<Integer>> generatorTestCaseDefault(){
        List<List<Integer>> result = new ArrayList<>();

        result.add(0, new ArrayList<>());
        result.add(1, new ArrayList<>());
        result.add(2, new ArrayList<>());
        result.add(3, new ArrayList<>());

        result.get(0).add(0,0);
        result.get(0).add(1,1);
        result.get(0).add(2,1);
        result.get(0).add(3,0);
        result.get(0).add(4,1);

        result.get(1).add(0,0);
        result.get(1).add(1,1);
        result.get(1).add(2,0);
        result.get(1).add(3,1);
        result.get(1).add(4,0);

        result.get(2).add(0,0);
        result.get(2).add(1,0);
        result.get(2).add(2,0);
        result.get(2).add(3,0);
        result.get(2).add(4,1);

        result.get(3).add(0,0);
        result.get(3).add(1,1);
        result.get(3).add(2,0);
        result.get(3).add(3,0);
        result.get(3).add(4,0);

        return result;
    }
    public List<List<Integer>> generatorTestCase1(){
        List<List<Integer>> result = new ArrayList<>();

        result.add(0, new ArrayList<>());
        result.add(1, new ArrayList<>());
        result.add(2, new ArrayList<>());
        result.add(3, new ArrayList<>());
        result.add(4, new ArrayList<>());

        result.get(0).add(0,1);
        result.get(0).add(1,0);
        result.get(0).add(2,0);
        result.get(0).add(3,0);
        result.get(0).add(4,0);

        result.get(1).add(0,0);
        result.get(1).add(1,1);
        result.get(1).add(2,0);
        result.get(1).add(3,0);
        result.get(1).add(4,0);

        result.get(2).add(0,0);
        result.get(2).add(1,0);
        result.get(2).add(2,1);
        result.get(2).add(3,0);
        result.get(2).add(4,0);

        result.get(3).add(0,0);
        result.get(3).add(1,0);
        result.get(3).add(2,0);
        result.get(3).add(3,1);
        result.get(3).add(4,0);

        result.get(4).add(0,0);
        result.get(4).add(1,0);
        result.get(4).add(2,0);
        result.get(4).add(3,0);
        result.get(4).add(4,1);

        return result;
    }
    public List<List<Integer>> generatorTestCase2(){
        List<List<Integer>> result = new ArrayList<>();

        result.add(0, new ArrayList<>());
        result.add(1, new ArrayList<>());
        result.add(2, new ArrayList<>());
        result.add(3, new ArrayList<>());
        result.add(4, new ArrayList<>());


        result.get(0).add(0,0);
        result.get(0).add(1,0);
        result.get(0).add(2,1);
        result.get(0).add(3,0);
        result.get(0).add(4,0);
        result.get(0).add(5,0);

        result.get(1).add(0,0);
        result.get(1).add(1,0);
        result.get(1).add(2,0);
        result.get(1).add(3,0);
        result.get(1).add(4,0);
        result.get(1).add(5,0);

        result.get(2).add(0,0);
        result.get(2).add(1,0);
        result.get(2).add(2,0);
        result.get(2).add(3,0);
        result.get(2).add(4,0);
        result.get(2).add(5,1);

        result.get(3).add(0,0);
        result.get(3).add(1,0);
        result.get(3).add(2,0);
        result.get(3).add(3,0);
        result.get(3).add(4,0);
        result.get(3).add(5,0);

        result.get(4).add(0,0);
        result.get(4).add(1,1);
        result.get(4).add(2,0);
        result.get(4).add(3,0);
        result.get(4).add(4,0);
        result.get(4).add(5,0);

        return result;
    }

    public int playLegacy(int rows, int columns, List<List<Integer>> grid){

        int i;
        int j;
        int updated;
        int outDated = 0;
        int days = 0;

        List<List<Integer>> temp = new ArrayList<>();
        for(int a = 0; a < grid.size(); a++){
            temp.add(a, new ArrayList<>(grid.get(a)));
        }

        //control if is impossible to update all servers
        boolean impossible = false;

        //iterates each day
        while (!impossible){
            //counters
            i=0;
            j=0;
            updated = 0;

            //iterates each row
            while(i < rows){
                if(grid.get(i).get(j) == 1){
                    //left
                    if(j > 0 && grid.get(i).get(j-1) == 0){
                        temp.get(i).set(j-1,1);
                        updated++;
                    }
                    //right
                    if(j+1 < columns && grid.get(i).get(j+1) == 0){
                        temp.get(i).set(j+1,1);
                        updated++;
                    }
                    //up
                    if(i > 1 && grid.get(i-1).get(j) == 0){
                        temp.get(i-1).set(j,1);
                        updated++;
                    }
                    //down
                    if(i + 1 < rows && grid.get(i+1).get(j) == 0 ){
                        temp.get(i+1).set(j,1);
                        updated++;
                    }
                //counts the number of servers remaining to update
                }else{
                    outDated++;
                }

                //debugDouble(grid, temp, i, j);
                //controls the counters i,j (rows and columns)
                if(j+1 >= columns){
                    j=0;
                    i++;
                }
                else
                    j++;
            }
            //controls if there is no more servers to update, if yes, finish the job
            if(updated == 0)
                break;
            //if no server has been updated, and there is at least one outdated, is impossible to update all servers
            else if(updated == 0 && outDated > 0)
                return -1;

            //copying temp to grid, to restart the next day
            for(int c = 0; c < temp.size(); c++)
                grid.set(c, new ArrayList<>(temp.get(c)));
            days++;
        }
        return days;
    }

    //pass a function as reference example
    public int play(){
        System.out.printf("Days to Update all Servers: %d\n",playLegacy(4,5,generatorTestCaseDefault()));
        System.out.printf("Days to Update all Servers: %d\n",playLegacy(5,5,generatorTestCase1()));
        System.out.printf("Days to Update all Servers: %d\n",playLegacy(5,6,generatorTestCase2()));
        return 0;
    }

    public void debug(List<List<Integer>> grid, int i, int j){
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
    public void debugDouble(List<List<Integer>> grid, List<List<Integer>> temp, int i, int j){
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
