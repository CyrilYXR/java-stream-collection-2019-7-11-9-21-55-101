package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
//        throw new NotImplementedException();
        Stream<Integer> stream = Stream.iterate(Math.min(leftBorder, rightBorder), i -> i+1).limit(Math.max(leftBorder,rightBorder));
        return stream.filter(number -> number % 2 == 0).mapToInt(number -> number).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().mapToInt(number -> number * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().map(n -> {
            if(n % 2 != 0){
                return n * 3 + 2;
            }
            return n;
        }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().filter(n -> n % 2 == 0).mapToDouble(n -> n).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().filter(n -> n%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
