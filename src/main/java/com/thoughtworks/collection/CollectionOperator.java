package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
//        throw new NotImplementedException();
        return Stream.iterate(left, n -> {
            if (left < right) {
                return n + 1;
            } else {
                return n - 1;
            }
        }).limit(Math.max(left, right) - Math.min(left, right) + 1).collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
//        throw new NotImplementedException();
        return Stream.iterate(left, n -> {
            if (left < right) {
                return n + 1;
            } else {
                return n - 1;
            }
        }).limit(Math.max(left, right) - Math.min(left, right) + 1)
                .filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
//        throw new NotImplementedException();
        List<Integer> resultList = new ArrayList<>();

//        return resultList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        for(Integer n : array){
            if(n % 2 == 0){
                resultList.add(n);
            }
        }
        return resultList;
    }

    public int popLastElment(int[] array) {
//        throw new NotImplementedException();
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
