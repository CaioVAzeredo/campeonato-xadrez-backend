package com.example.camp_xadrez.domain.aluno;

public record DadosAtualizarAluno(
        Long id_turma,
        String nome,
        Integer pontos_total
) {
}
