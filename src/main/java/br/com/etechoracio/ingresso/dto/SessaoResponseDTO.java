package br.com.etechoracio.ingresso.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;

public record SessaoResponseDTO(
        Integer id,
        LocalDate data,
        LocalTime horario,
        Double preco,
        String sala
        ) {

}

