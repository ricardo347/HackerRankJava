package br.com.ricardo347.GradingStudents;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    public Grade(){

    }
    public List<Integer> generator(){
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        return grades;
    }

    public List<Integer> play(List<Integer> grades){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < grades.size(); i++){
            int rest = (grades.get(i) % 5);
            if(rest >= 3 && grades.get(i) + (5-rest) >= 40)
                grades.set(i, grades.get(i) + (5-rest));
            //System.out.println(grades.get(i));
        }

        return result;
    }
}
