package com.example.camp_xadrez.domain.turma;

public record DadosAtualizarTurma(
        Long id_turma,
        Long id_professor,
        String nome,
        String descricao,
        Integer ano_letivo
) {
}
