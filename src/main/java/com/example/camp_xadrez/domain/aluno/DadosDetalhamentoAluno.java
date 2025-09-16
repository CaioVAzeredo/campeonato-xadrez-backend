package com.example.camp_xadrez.domain.aluno;

import java.time.LocalDateTime;

public record DadosDetalhamentoAluno(
        String nome,
        Integer pontos_total,
        Boolean ativo
) {
}