package ru.reyzor.kinopoiskv2.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author reyzor
 * @version 1.0
 * @since 12.09.2018
 */

@Entity
@Table(name = "countries")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
