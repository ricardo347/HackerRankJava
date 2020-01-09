package br.com.ricardo347;


import br.com.ricardo347.Amazon.ServersUpdate.Server;
import br.com.ricardo347.BirthDayCake.Cake;
import br.com.ricardo347.BreakingRecords.Records;
import br.com.ricardo347.GradingStudents.Grade;
import br.com.ricardo347.Pairs.Pairs;
import br.com.ricardo347.TimeConversion.TimeConversion;

import java.sql.Array;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        /*List<List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>());
        a.add(new ArrayList<>());
        a.get(0).add(1);
        a.get(0).add(2);
        a.get(1).add(3);
        a.get(1).add(4);

        List<List<Integer>> b = new ArrayList<>();
        b.add(new ArrayList<>(a.get(0)));
        b.add(new ArrayList<>(a.get(1)));
        b.get(0).set(1,44);*/

        /*for(Integer n : a)
            System.out.println(n);
        System.out.println("---");
        for(Integer n1 : b)
            System.out.println(n1);*/


        Server s = new Server();
        //s.playLegacy(s.generatorTestCaseDefault());
        s.play();
    }
}
