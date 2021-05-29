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
@Table(name = "author")
@NoArgsConstructor
public class Author {
    @Id
//    @GeneratedValue
    private Long id;
    private String fio;
}
