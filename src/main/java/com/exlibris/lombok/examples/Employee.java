package com.exlibris.lombok.examples;

import lombok.*;
import lombok.experimental.Wither;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@Wither
@AllArgsConstructor

public class Employee {
    private String name;
    private int bonus;
    @NonNull
    private Integer salary;
    @Singular
    private Map<String,Integer> beers;


}
