package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class UnionlottoTests {

    @Test
    public void getUnionLottoNumber(){
        Random r = new Random();
        Set<Integer> unionlottoSet = new TreeSet<>();
        List<String> unionlottoList = new ArrayList<>();
        while (unionlottoSet.size()!=6){
            unionlottoSet.add(r.nextInt(33)+1);
        }

        System.out.println(unionlottoSet);
        String number = "";
        for (Integer integer : unionlottoSet) {
            if (integer<10){
                number = ""+0+integer;
            }else {
                number = ""+integer;
            }
            unionlottoList.add(number);
        }
        int i = r.nextInt(16) + 1;
        if (i<10){
            number = ""+0+i;
        }else {
            number = ""+i;
        }
        unionlottoList.add(number);
        System.out.println(unionlottoList);
    }
}
