package br.com.imdb.ioasys.imdbservice01.repository;

import br.com.imdb.ioasys.imdbservice01.model.Genre;
import br.com.imdb.ioasys.imdbservice01.model.GenreOpcion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface GenreRepository extends JpaRepository<Genre, Long> {
    Optional<Genre> findByGenre(GenreOpcion genre);
}
