package com.perfectmatch.domain.predicate;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PredicateStream {

    private static void negatePredicate() {

        List<String> immutableEmptyList = Optional.ofNullable("STR")
                .stream()
                .filter(Predicate.not(String::isBlank))
                .filter(Predicate.not(String::isEmpty))
                .filter(Predicate.isEqual("str").negate())
                .filter(Predicate.not(Predicate.isEqual("str")))
                .toList();
        System.out.println(immutableEmptyList);

    }

    public static void main(String[] main) {
        negatePredicate();
    }
}
