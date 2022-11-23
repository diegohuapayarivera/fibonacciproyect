package com.dhuapaya.fibonacciproyect.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class FigonacciService {


    public List<Integer> getListFigonacci(int number){
        List<Integer> listFigonacci = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            listFigonacci.add(getNumberFigonacci(i));
        }
        return listFigonacci;
    }

    public int getNumberFigonacci(int number){
        if(number == 0 || number==1)
            return number;
        else
            return getNumberFigonacci(number-1) + getNumberFigonacci(number-2);
    }
}
