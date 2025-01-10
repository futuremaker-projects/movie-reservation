package com.movie.moviestorage.movie.repository;

import com.movie.moviestorage.movie.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterJpaRepository extends JpaRepository<TheaterEntity, Long> {
}
