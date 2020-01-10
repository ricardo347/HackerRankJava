package br.com.ricardo347.AssesmentPuzzle.TreasureTruckPop;

import br.com.ricardo347.Tools;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    public List<List<Integer>> defaultTestCaseGenerator() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        result.get(0).add(1);
        result.get(0).add(1);
        result.get(0).add(0);
        result.get(0).add(0);

        result.get(1).add(0);
        result.get(1).add(0);
        result.get(1).add(1);
        result.get(1).add(0);

        result.get(2).add(0);
        result.get(2).add(0);
        result.get(2).add(0);
        result.get(2).add(0);

        result.get(3).add(1);
        result.get(3).add(0);
        result.get(3).add(1);
        result.get(3).add(1);

        result.get(4).add(1);
        result.get(4).add(1);
        result.get(4).add(1);
        result.get(4).add(1);

        return result;
    }
    public List<List<Integer>> firstTestCaseGenerator() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        result.get(0).add(1);
        result.get(0).add(0);
        result.get(0).add(0);
        result.get(0).add(0);
        result.get(0).add(0);
        result.get(0).add(0);
        result.get(0).add(0);

        result.get(1).add(0);
        result.get(1).add(1);
        result.get(1).add(0);
        result.get(1).add(0);
        result.get(1).add(0);
        result.get(1).add(0);
        result.get(1).add(0);

        result.get(2).add(0);
        result.get(2).add(0);
        result.get(2).add(1);
        result.get(2).add(0);
        result.get(2).add(0);
        result.get(2).add(0);
        result.get(2).add(0);

        result.get(3).add(0);
        result.get(3).add(0);
        result.get(3).add(0);
        result.get(3).add(1);
        result.get(3).add(0);
        result.get(3).add(0);
        result.get(3).add(0);

        result.get(4).add(0);
        result.get(4).add(0);
        result.get(4).add(0);
        result.get(4).add(0);
        result.get(4).add(1);
        result.get(4).add(0);
        result.get(4).add(0);

        result.get(5).add(0);
        result.get(5).add(0);
        result.get(5).add(0);
        result.get(5).add(0);
        result.get(5).add(0);
        result.get(5).add(1);
        result.get(5).add(0);

        result.get(6).add(0);
        result.get(6).add(0);
        result.get(6).add(0);
        result.get(6).add(0);
        result.get(6).add(0);
        result.get(6).add(0);
        result.get(6).add(1);

        return result ;
    }
    public List<List<Integer>> secondTesCaseGenerator(){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        result.get(0).add(0);
        result.get(0).add(0);
        result.get(0).add(1);
        result.get(0).add(0);
        result.get(0).add(0);

        result.get(1).add(1);
        result.get(1).add(1);
        result.get(1).add(0);
        result.get(1).add(0);
        result.get(1).add(1);

        result.get(2).add(0);
        result.get(2).add(0);
        result.get(2).add(1);
        result.get(2).add(1);
        result.get(2).add(0);

        result.get(3).add(0);
        result.get(3).add(1);
        result.get(3).add(0);
        result.get(3).add(1);
        result.get(3).add(1);

        result.get(4).add(1);
        result.get(4).add(0);
        result.get(4).add(0);
        result.get(4).add(0);
        result.get(4).add(1);

        return result;
    }

    public int play(List<List<Integer>> parking){

        int groups = 0;

        for(int i = 0; i < parking.size(); i++)
            for(int j = 0; j < parking.get(i).size(); j++){
               if(parking.get(i).get(j) == 1){
                    groups += getContigous(i,j,parking);
               }
            }
        System.out.printf("Quantity of contiguos groups: %d",groups);

        //PROTOTYPE LOOP
        /*or(int i = 0, j = 0;
            i+1 != parking.size() || j+1 != parking.get(i).size()? true: false;
            i+=(j+1 !=parking.get(i).size()?0:1), j+=(j+1<parking.get(i).size()?1:-j)){

            System.out.printf("i:%d , j:%d", i, j);
            System.out.printf("  %s - %s", i+1 != parking.size(),j+1 != parking.get(i).size() );
            System.out.printf(" %d != %d i+=%d j+=%d\n", j+1,parking.get(i).size(),(j+1 !=parking.get(i).size()?0:1),(j+1<parking.get(i).size()?1:-j) );
        }*/
        //
        return 0;
    }

    public int playV2(List<List<Integer>> parking){
        Tools.debug(parking,0, 0);
        int result = getContigousV2(0,0, parking);
        System.out.printf("Quantity of contiguos groups: %d", result);

        return 0;
    }

    /**
     * First version of getcontigous, "semi" recursive approach
     * @param i current row position
     * @param j current column position
     * @param parking Array representing the park.
     * @return the number of possible groups
     */
    public int getContigous(int i, int j, List<List<Integer>> parking){

        //set 0 to current node, it ensures that a already evaluated node, be evalute again.
        parking.get(i).set(j,0);

        //looks left
        if(j > 0 && parking.get(i).get(j-1) == 1){

            parking.get(i).set(j-1,0);
            getContigous(i, j-1, parking);
        }
        //looks right
        if(j+1 < parking.get(i).size() && parking.get(i).get(j+1) == 1){

            parking.get(i).set(j+1,0);
            getContigous(i, j+1, parking);
        }
        //looks up
        if(i > 0 && parking.get(i-1).get(j) == 1){

            parking.get(i-1).set(j,0);
            getContigous(i-1, j, parking);
        }
        //looks down
        if(i+1 < parking.size() && parking.get(i+1).get(j) == 1){

            parking.get(i+1).set(j,0);
            getContigous(i+1, j, parking);
        }

        return 1;
    }

    public int getContigousV2(int i, int j, List<List<Integer>> parking){
        boolean hasgroup = false;


        Tools.debug(parking,i, j);

        if(i+1 >= parking.size() && j+1 >= parking.size()){
            System.out.printf("retornei!");
            return 0;
        }

        int nextI = j+1 >= parking.get(i).size() ? i+1: i;
        int nextJ = j+1 >= parking.get(i).size() ? 0 : j+1;
        parking.get(i).set(j,0);
       // if(parking.get(i).get(j) == 0)
          //  getContigous(i+1, j, parking);

        //looks left
        if(j > 0 && parking.get(i).get(j-1) == 1){
            System.out.printf("left \n");
            hasgroup = true;
            getContigousV2(i, j-1, parking);
        }
        //looks right
        if(j+1 < parking.get(i).size() && parking.get(i).get(j+1) == 1){
            System.out.printf("right \n");
            hasgroup = true;
            getContigousV2(i, j+1, parking);
        }
        //looks up
        if(i > 0 && parking.get(i-1).get(j) == 1){
            System.out.printf("up \n");
            //parking.get(i-1).set(j,0);
            hasgroup = true;
            getContigousV2(i-1, j, parking);
        }
        //looks down
        if(i+1 < parking.size() && parking.get(i+1).get(j) == 1){
            //down
           // parking.get(i+1).set(j,0);
            hasgroup = true;
            getContigousV2(i+1, j, parking);
        }

        return (hasgroup?1:0) + getContigousV2(nextI, nextJ, parking);
    }
}
