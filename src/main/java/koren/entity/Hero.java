package koren.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "Hero")
@NoArgsConstructor
public class Hero {
    @Id
    private Long id;
    private String name;

}