package br.com.empresa.gdt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.empresa.gdt.model.Bloco;
import br.com.empresa.gdt.repository.BlocoRepository;

@Service
public class BlocoService {

    @Autowired
    private BlocoRepository blocoRespository;

    @Transactional
    public void save(Bloco bloco) {
        blocoRespository.save(bloco);
    }

    public List<Bloco> findAll() {
        return blocoRespository.findAll();
    }

}