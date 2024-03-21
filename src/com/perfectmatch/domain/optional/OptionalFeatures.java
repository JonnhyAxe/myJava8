package com.perfectmatch.domain.optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalFeatures {

    private static void createOptional(){

        Optional.of("Dummy")
                .filter(Predicate.not(String::isBlank))
                .ifPresent(System.out::println);

    }

    private static void createOptionalWithFlatMap(){

        Optional.of("Dummy Dummy")
                .filter(Predicate.not(String::isBlank))
                .flatMap(s -> Optional.of(s.split("")))
                .ifPresent(System.out::println);

    }

    private static void createOptionalWithMap() {
        Optional.of("Dummy Dummy")
                .filter(Predicate.not(String::isBlank))
                .map(s -> s.split(" ")[0])
                .map(String::strip)
                .filter(Predicate.not(String::isBlank))
                .filter(Predicate.not(String::isEmpty))
                .ifPresent(System.out::println);
    }

    public void testImmutable(){

        List<String> strings = List.of("")
                .stream()
                .toList();

        List<String> immutableEmptyList = Optional.ofNullable((String) null)
                .stream()
                .filter(Predicate.not(String::isBlank))
                .filter(Predicate.not(String::isEmpty))
                .filter(Predicate.isEqual("str").negate())
                .toList();

        strings.set(0, "changed");

        Function<Integer, Double> halfFunction = a -> a / 2.0;
        Function<Integer, Double> doubleFunction = a -> (int) a * 2.0;

        Function<Integer, Double> compose = doubleFunction.compose(Function.identity());

        System.out.println(Optional.of("").hashCode());
        System.out.println("".hashCode());


        Optional<List<String>> strings1 = Optional.of(List.of("", ""));
        Optional<Stream<String>> first = strings1
                .flatMap(strings2 -> Optional.of(strings2.stream()))
                .stream()
                .findFirst();

        System.out.println(compose);
    }


    private static List<String>  filterAndConvertToUpper(Stream<String> stream, int length)
    {
        return stream.filter(s -> s.length() == length)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    private static void createNullableOptional() {

        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println, () -> System.out.println("IsNullable"));
    }

    public static void main(String[] args) {

        createOptionalWithFlatMap();
    }
}
