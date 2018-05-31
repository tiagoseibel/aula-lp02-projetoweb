package br.com.empresa.gdt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empresa.gdt.model.Bloco;

@Repository
public interface BlocoRepository extends JpaRepository<Bloco, Integer> {

}