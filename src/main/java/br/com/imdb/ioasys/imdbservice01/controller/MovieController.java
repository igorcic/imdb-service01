package br.com.imdb.ioasys.imdbservice01.controller;

import br.com.imdb.ioasys.imdbservice01.model.Movie;
import br.com.imdb.ioasys.imdbservice01.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies") // http://localhost:8080/movies
@RequiredArgsConstructor
public class MovieController {


    private final MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> post(@RequestBody Movie movie){
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.save(movie));

    }
    @GetMapping
    public ResponseEntity<List<Movie>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(movieService.getAll());

    }
    @GetMapping("/{id}")
    public ResponseEntity<Movie> get(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(movieService.get(id));
    }


    @PutMapping
    public ResponseEntity<Movie> update(@RequestBody Movie update){
        return ResponseEntity.status(HttpStatus.OK).body(movieService.update(update));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        movieService.delete(movieService.get(id));
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
    }
}
