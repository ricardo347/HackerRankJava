package br.com.ricardo347;


import br.com.ricardo347.BirthDayCake.Cake;
import br.com.ricardo347.BreakingRecords.Records;
import br.com.ricardo347.GradingStudents.Grade;
import br.com.ricardo347.Pairs.Pairs;
import br.com.ricardo347.TimeConversion.TimeConversion;


import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        Records r = new Records();
        r.play(r.generate());
    }
}
