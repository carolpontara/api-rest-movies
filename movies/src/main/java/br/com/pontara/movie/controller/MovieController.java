package br.com.pontara.movie.controller;

import br.com.pontara.movie.entity.Movie;
import br.com.pontara.movie.repository.MovieRepository;
import br.com.pontara.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    public MovieService service;

    @Autowired
    public MovieRepository repository;


    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return service.createMovie(movie);
    }

    @GetMapping("/{id}")
    public Optional<Movie> findMovieById(@PathVariable("id") Long id) {
        return service.findMovieById(id);
    }

    @PutMapping("/{id}")
    public Movie movieUpdate(@RequestBody Movie movie, @PathVariable("id") Long id) {
        return service.movieUpdate(movie, id);

    }

    @GetMapping
    public List<Movie> movieList() {
        return service.movieList();
    }

    @DeleteMapping("/{id}")
    public void deleteMovieById(@PathVariable("id") Long id) {
        service.deleteMovieById(id);
    }

    @PostMapping("/{id}/grade")
    public ResponseEntity<Void> gradeMovie(@PathVariable Long id, @RequestParam Double grade) {
        Optional<Movie> movieExisting = service.findMovieById(id);
        if (movieExisting.isPresent()) {
            Movie movie = movieExisting.get();
            if (movie.getGrade() == null) {
                movie.setGrade(grade);
            } else {
                movie.setGrade((movie.getGrade() + grade) / 2);
            }
            repository.save(movie);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/not-grade")
    public ResponseEntity<List<Movie>> findMoviesNotGrade() {
        List<Movie> movies = repository.findByGradeIsNull();
        if (!movies.isEmpty()) {
            return ResponseEntity.ok(movies);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    }



