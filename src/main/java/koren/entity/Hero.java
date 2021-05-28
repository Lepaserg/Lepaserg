package koren.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
//@Entity
//@Table(name = "Hero")
@NoArgsConstructor
public class Hero {
//    @Id
//    @GeneratedValue
    private  Long id;
    private  String name;
}
