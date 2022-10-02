package me.dio.sacolaapi.repository;

import me.dio.sacolaapi.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SacolaRepository extends JpaRepository<Sacola, Long> {
}
