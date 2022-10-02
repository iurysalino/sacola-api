package me.dio.sacolaapi.repository;

import me.dio.sacolaapi.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
