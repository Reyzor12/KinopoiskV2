package ru.reyzor.kinopoiskv2.db.entity;

import javax.persistence.*;

/**
 * @author reyzor
 * @version 1.0
 * @since 12.09.2018
 */

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "genre")
    private String genre;
}
