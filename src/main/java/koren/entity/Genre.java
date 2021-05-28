package koren.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
//@Entity
//@Table(name = "genres")
@NoArgsConstructor
public class Genre {
//    @Id
//    @GeneratedValue
    private Long id;
    private String genres;

}