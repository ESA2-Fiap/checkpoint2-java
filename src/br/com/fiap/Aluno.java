package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    private int rm;
    private String nome;
    private LocalDate dataDeNascimento;

    public Aluno() {
    }

    public Aluno(int rm, String nome, LocalDate dataDeNascimento) {
        this.rm = rm;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        try {
            if (rm >= 95001 && rm <= 552999) {
                this.rm = rm;
            } else {
                throw new Exception("Atributo rm deve ser maior ou igual a 95001e menor ou igual a 552999");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        int anoDeNascimento = dataDeNascimento.getYear();
        try {
            if (anoDeNascimento >= 1900 && anoDeNascimento <= LocalDate.now().getYear()) {
                this.dataDeNascimento = dataDeNascimento;
            } else {
                throw new Exception("Atributo dataDeNascimento deve ser maior ou igual a 1900 e menor ou igual ao ano atual.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String calculaIdadeCompleta(LocalDate dataAtual) {
        Period dataAtualParaIdade = Period.between(this.dataDeNascimento, dataAtual);
        return "Idade Completa\n" + "Anos: " + dataAtualParaIdade.getYears() + "\nMeses: " + dataAtualParaIdade.getMonths() + "\nDias: " + dataAtualParaIdade.getDays();
    }
}
