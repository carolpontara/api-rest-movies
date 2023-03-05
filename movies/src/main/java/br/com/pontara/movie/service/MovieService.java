package br.com.pontara.movie.service;

import br.com.pontara.movie.entity.Movie;
import br.com.pontara.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    public MovieRepository repository;

    public Optional<Movie> findMovieById(Long id) {
        return repository.findById(id);
    }


    public void deleteMovieById(Long id) {
        repository.deleteById(id);
    }

    public Movie createMovie(Movie movie) {
        return repository.save(movie);
    }


    public List<Movie> movieList() {
        return repository.findAll();

    }

    public Movie movieUpdate(Movie movie, Long id) {
        Optional<Movie> up = repository.findById(id);
        if (up.isPresent()) {
            Movie obj = up.get();
            if (movie.getMovieName() != null) {
                obj.setMovieName(movie.getMovieName());
            }
            if (movie.getGrade() != null) {
                obj.setGrade(movie.getGrade());
            }
            repository.save(obj);

        }
        return null;
    }


}
