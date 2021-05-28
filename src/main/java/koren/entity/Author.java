package koren.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
//@Entity
//@Table(name = "authors")
@NoArgsConstructor
public class Author {
//    @Id
//    @GeneratedValue
    private Long id;
    private String fio;
}
