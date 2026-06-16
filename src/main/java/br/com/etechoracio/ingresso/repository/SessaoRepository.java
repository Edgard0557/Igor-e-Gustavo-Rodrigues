package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessaoRepository extends JpaRepository<Sessao, Integer> {
}
