package com.example.camp_xadrez.domain.turma;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastraTurma(
        @NotNull
        Long id_turma,
        @NotNull
        Long id_professor,
        @NotBlank
        String nome,
        String descricao,
        @NotNull
        Integer ano_letivo

) {
}
