package dev.jinghu.movies_review;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    // Database access methods

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovie(ObjectId id){
        return movieRepository.findById(id);
    }
}
