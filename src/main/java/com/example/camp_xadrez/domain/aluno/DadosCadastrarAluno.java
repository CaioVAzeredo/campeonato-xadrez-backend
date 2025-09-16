package com.example.camp_xadrez.domain.aluno;

import com.example.camp_xadrez.domain.turma.Turma;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastrarAluno(
        @NotBlank
        Long id_turma,

        @NotBlank
        String nome,

        @NotBlank
        Integer pontos_total,

        @NotBlank
        @Valid
        Turma turma
) {
}
