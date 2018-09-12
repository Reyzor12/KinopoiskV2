package ru.reyzor.kinopoiskv2.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author reyzor
 * @version 1.0
 * @since 12.09.2018
 */
@Entity
@Table(name = "films")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String filmTitle;

    @Column(name = "year_of_release")
    private Integer yearRelease;

    @Column(name = "dvd_release")
    private LocalDate dvdRelease;

    @OneToMany
    private List<Country> country;

    @OneToMany
    private List<People> producers;

    @OneToMany
    private List<Genre> genres;

    @Column(name = "budget")
    private Integer budget;

    @Column(name = "date_of_release")
    private LocalDate release;

    @OneToMany
    private List<People> actors;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private Integer rating;
}


