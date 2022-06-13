package br.com.imdb.ioasys.imdbservice01.repository;

import br.com.imdb.ioasys.imdbservice01.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
