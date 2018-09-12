package ru.reyzor.kinopoiskv2.db.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author reyzor
 * @version 1.0
 * @since 12.09.2018
 */

@Entity
@Table(name = "peoples")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "other_name")
    private String otherName;

    @Column(name = "born_date")
    private LocalDate bornDate;

    @Column(name = "place_of_born")
    private String placeOfBorn;

    @OneToMany
    private List<Genre> genres;
}
