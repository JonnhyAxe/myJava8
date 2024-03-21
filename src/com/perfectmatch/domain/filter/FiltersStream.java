package com.perfectmatch.domain.filter;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class FiltersStream {

    private static void filterObjects() {
       List<String> names  = List.of("Str","STR", "Str", "str");
       boolean allMatch = names.stream()
                .filter(Objects::nonNull)
                .filter(Predicate.isEqual("Str"))
                .filter(Predicate.not(String::isEmpty))
                .map(String::strip)
                .map(String::trim)
                .map(t -> t.toLowerCase())
                .map(s -> s.indent(2))
                .allMatch(t -> t.contains("s"));
    }

    public static void main(String[] args){
        filterObjects();
    }
}
