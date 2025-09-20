
package com.ademass.movies.repositories;

import com.ademass.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Long>{ 
//El JpaRepository atravez del operador Dayamond nos va exigir que se entregue dos tipos datos, en primer lugar la entidad con
// la que va estar trabajando el repositorio en este caso Movie el segundo tipo de dato que nos va a pedir es el tipo 
// de dato del identificador es decir de su clave primaria    
    
    
    
}
