package me.dio.sacolaapi.repository;

import me.dio.sacolaapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
