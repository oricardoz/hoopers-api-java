package br.com.ricardo.HoopersMatch.Repositories;

import br.com.ricardo.HoopersMatch.Models.Jogador;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}