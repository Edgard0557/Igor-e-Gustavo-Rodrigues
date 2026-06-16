package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import br.com.etechoracio.ingresso.mapper.FilmeMapper;
import br.com.etechoracio.ingresso.repository.FilmeRepository;
<<<<<<< HEAD
import jakarta.persistence.Id;
=======
>>>>>>> 35fcc899f05db4af25e603ea916fae6846c52b15
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private FilmeMapper filmeMapper;

    public List<FilmeResponseDTO> findAll() {
        var filmes = filmeRepository.findAll();
        return filmeMapper.toResponseDTOList(filmes);
    }

    public List<FilmeResponseDTO> findEmCartaz() {
        var filmes = filmeRepository.findByEmCartaz(SimNaoEnum.S);
        return filmeMapper.toResponseDTOList(filmes);
<<<<<<< HEAD

    }

    public List<FilmeResponseDTO> findPorId() {
        var filmes = filmeRepository.findById(Integer Id);
        return filmeMapper.toResponseDTOList(filmes);
=======
>>>>>>> 35fcc899f05db4af25e603ea916fae6846c52b15
    }

}
