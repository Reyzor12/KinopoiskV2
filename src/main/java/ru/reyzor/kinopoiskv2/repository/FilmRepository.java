package ru.reyzor.kinopoiskv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.reyzor.kinopoiskv2.db.entity.Film;

/**
 * @author reyzor
 * @version 1.0
 * @since 13.09.2018
 */
public interface FilmRepository extends JpaRepository<Film, Long> {
}
