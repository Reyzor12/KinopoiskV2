package ru.reyzor.kinopoiskv2.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.reyzor.kinopoiskv2.db.entity.Country;

/**
 * @author reyzor
 * @version 1.0
 * @since 13.09.2018
 */
public interface CountryRepository extends JpaRepository<Country, Long> {
}
