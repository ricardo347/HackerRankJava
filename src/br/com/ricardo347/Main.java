package br.com.ricardo347;


import br.com.ricardo347.AssesmentPuzzle.TreasureTruckPop.Parking;
import br.com.ricardo347.BetweenTwoSets.Set;
import br.com.ricardo347.BirthdayChocolate.Bar;
import br.com.ricardo347.DivisibleSumPairs.DivisiblePairs;
import br.com.ricardo347.Java1DGame.Game1D;
import br.com.ricardo347.PickingNumbers.AbsoluteNumbers;
import br.com.ricardo347.Subarray.Subarray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbsoluteNumbers a = new AbsoluteNumbers();
       a.run(a.defaultTestCaseGenerator());
        a.run(a.testCase1Generator());
        a.run(a.testCase2Generator());
        a.run(a.testCase3Generator());


    }



}