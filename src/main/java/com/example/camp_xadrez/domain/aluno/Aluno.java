package com.example.camp_xadrez.domain.aluno;


import com.example.camp_xadrez.domain.turma.Turma;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "aluno")
@Entity(name = "Aluno")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aluno;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_turma")
    private Turma turma;
    private String nome;
    private Integer pontos_total;
    private Boolean ativo;
    private LocalDateTime data_criacao;
    private LocalDateTime data_atualizacao;

    public Aluno(DadosCadastrarAluno dados) {
        this.turma = dados.turma();
        this.nome = dados.nome();
        this.pontos_total = dados.pontos_total();
        this.ativo = true;
        this.data_criacao = LocalDateTime.now();
        this.data_atualizacao = LocalDateTime.now();

    }

    public Long getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Long id_aluno) {
        this.id_aluno = id_aluno;
    }

    public Long getId_turma() {
        return turma.id_turma;
    }

    public void setId_turma(Long id_turma) {
        this.turma.id_turma = id_turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos_total() {
        return pontos_total;
    }

    public void setPontos_total(Integer pontos_total) {
        this.pontos_total = pontos_total;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }

    public LocalDateTime getData_atualizacao() {
        return data_atualizacao;
    }

    public void setData_atualizacao(LocalDateTime data_atualizacao) {
        this.data_atualizacao = data_atualizacao;
    }

    void atualizarAluno(DadosAtualizarAluno dados){
                this.turma.id_turma = dados.id_turma();
                this.nome = dados.nome();
                this.pontos_total = dados.pontos_total();
                this.data_atualizacao = LocalDateTime.now();
    }
    void excluir(){
        this.ativo = false;
    }
}