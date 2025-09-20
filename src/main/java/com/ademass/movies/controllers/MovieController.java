
package com.ademass.movies.controllers;

import com.ademass.movies.models.Movie;
import com.ademass.movies.repositories.MovieRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    
    @Autowired
    private MovieRepository movieRepository;
    
    @CrossOrigin
    @GetMapping
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    
    @CrossOrigin
    @GetMapping("/detail/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id){
        Optional<Movie> movie = movieRepository.findById(id);
        return movie.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }
    
    
    
}
