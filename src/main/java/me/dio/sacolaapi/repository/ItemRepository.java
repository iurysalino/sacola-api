package me.dio.sacolaapi.repository;

import me.dio.sacolaapi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
