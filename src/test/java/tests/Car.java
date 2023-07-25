package test.java.tests;

import lombok.*;

import java.util.Objects;
//@Getter
//@Setter
//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
//Вместо 4 аннотаций можно DATA
@Data
@AllArgsConstructor
//@RequiredArgsConstructor(можно выбрать 1 параметр)

public class Car {
   // @NonNull
    String model;
    String make;


}
