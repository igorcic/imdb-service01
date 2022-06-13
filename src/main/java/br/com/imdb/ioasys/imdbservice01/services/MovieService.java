package br.com.imdb.ioasys.imdbservice01.services;


import br.com.imdb.ioasys.imdbservice01.model.Movie;
import br.com.imdb.ioasys.imdbservice01.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    public Movie save(Movie movie){
        return movieRepository.save(movie);

    }
    public Movie get(Long id){
        return movieRepository.getReferenceById(id);
    }
    public List<Movie> getAll(){
        return movieRepository.findAll();
    }
    public Movie update(Movie update){
        var movie = get(update.getId());
        BeanUtils.copyProperties(update,movie);
        return movie;
    }
    public void delete(Movie movie){
        movieRepository.delete(movie);
    }
}
