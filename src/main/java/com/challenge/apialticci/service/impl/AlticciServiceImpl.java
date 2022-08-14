package com.challenge.apialticci.service.impl;

import com.challenge.apialticci.service.AlticciService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;


@Service
public class AlticciServiceImpl implements AlticciService {

    //Map para utilizar como cache para salvar os valores de a para facilitar o calculo
    Map<Integer,Integer> history = new HashMap<>();


    //criado para que a classe controller tenha acesso somente a lista.
    @Override
    public List<BigDecimal> listAlticci(Integer index) {

        return returnList(index);
    }

    //Garantir que somente essa classe veja a implementação e a unica responsabilidade de gerar a lista
    private List<BigDecimal> returnList(Integer index){
        List<BigDecimal> response = new ArrayList<>();
        int fim = index + 10;
        for(int i = 0; i<= fim; i++){
            Integer value = calcConditional(i);
            if(i>=index)
                response.add(BigDecimal.valueOf(value));
        }
        return response;
    }

    //Garantir que a unica responsabilidade seja calculo
    private Integer calcConditional(Integer calc) {
        Integer value = 0;
        if(!history.containsKey(calc)){
            if (rule(calc) <= 1) {
                value = rule(calc);
                history.put(calc, value);
            }
            if (!isValid(calc)) {
                Integer numberOne = calcNumberOne(calc);
                Integer numberTwo = calcNumberTwo(calc);
                if (history.containsKey(numberOne)) {
                    numberOne = history.get(numberOne);
                }
                if (history.containsKey(numberTwo)) {
                    numberTwo = history.get(numberTwo);
                }
                value = numberOne + numberTwo;
                history.put(calc, value);
            }
        }else{
            value = history.get(calc);
        }
        return value;
    }

    //Criado as classes de calculo para caso a regra de calculo seja alterada não impacte as demais classes
    private Integer calcNumberTwo(Integer calc2) {
        return calc2 - 2;
    }

    //Criado as classes de calculo para caso a regra de calculo seja alterada não impacte as demais classes
    private Integer calcNumberOne(Integer i) {
        return i - 3;
    }

    //Criado para caso a regra seja alterada não impacte o codigo
    private Integer rule(Integer num){
        if(num==0)
            return 0;
        if(num==1 || num==2)
            return 1;
        return num;
    }
    //Criado para caso a regra seja alterada não impacte o codigo
    private boolean isValid(Integer num){
        return rule(num) <= 1;
    }
}
