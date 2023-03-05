package br.com.pontara.movie.repository;

import br.com.pontara.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGradeIsNull();

}
