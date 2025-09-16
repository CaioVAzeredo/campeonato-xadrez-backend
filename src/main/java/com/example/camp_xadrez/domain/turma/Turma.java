package com.example.camp_xadrez.domain.turma;

import jakarta.validation.constraints.NotBlank;

public class Turma {
    public Long id_turma;

    public Turma(DadosCadastraTurma dados) {
        this.id_turma = dados.id_turma();
    }
}
