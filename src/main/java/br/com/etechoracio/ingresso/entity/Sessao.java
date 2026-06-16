package br.com.etechoracio.ingresso.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "sessao")
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sessao")
    private int id;

    @Column(name = "data_sessao")
    private LocalDate data;

    @Column(name = "horario_sessao")
    private LocalTime horario;

    @Column(name = "preco_sessao")
    private Double preco;

    @Column(name = "sala_sessao")
    private String sala;

    @ManyToOne
    @JoinColumn(name = "filme")
    private Filme filme;



    public Sessao() {

    }

    public Integer getId() {
        return id;
    }

    public void stId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return data;
    }

    public void stDate(LocalDate data) {
        this.data = data;
    }
    public LocalTime getTime() {
        return horario;
    }

    public void stTime(LocalTime horario) {
        this.horario = horario;
    }

    public Double getpreco() {
        return preco;
    }

    public void stpreco(Double preco) {
        this.preco = preco;
    }
    public String getsala() {
        return sala;
    }

    public void stsala(String sala) {
        this.sala = sala;
    }
    public Filme getfilme() {
        return filme;
    }

    public void stfilme(Filme filme) {
        this.filme = filme;
    }


}

