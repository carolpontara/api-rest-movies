package br.com.pontara.movie.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "MOVIES")
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @Column(name = "GRADE")
    private Double grade;
}
