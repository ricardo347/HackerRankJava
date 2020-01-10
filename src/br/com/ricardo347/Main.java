package br.com.ricardo347;


import br.com.ricardo347.Amazon.ServersUpdate.Server;
import br.com.ricardo347.Amazon.TreasureTruckPop.Parking;
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
        Parking p = new Parking();
        p.play(p.secondTesCaseGenerator());
    }
}
