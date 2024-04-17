// Leonardo Schunck Rainha - 99902
// Julio Cesar Zampieri - 98772
package br.com.fiap;

import javax.swing.*;
import java.time.LocalDate;
public class UsaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(99902, "Leonardo Schunck Rainha", LocalDate.of(2005, 2, 28));
        Aluno aluno2 = new Aluno(98772, "Julio Cesar Zampieri", LocalDate.of(2005, 3, 17));
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();

        LocalDate dataAtual = LocalDate.now();

        try {
            String rmAluno3 = JOptionPane.showInputDialog("Digite o RM do aluno 3");
            int rmAluno3Convertido = Integer.parseInt(rmAluno3);
            if (rmAluno3Convertido >= 95001 && rmAluno3Convertido <= 552999) {
                aluno3.setRm(rmAluno3Convertido);
            } else {
                throw new Exception("RM deve ser maior ou igual a 95001e menor ou igual a 552999");
            }

            String nomeAluno3 = JOptionPane.showInputDialog("Digite o nome do aluno 3");
            aluno3.setNome(nomeAluno3);

            String anoAluno3 = JOptionPane.showInputDialog("Digite o ano de nascimento do aluno 3");
            int anoAluno3Convertido = Integer.parseInt(anoAluno3);

            if (anoAluno3Convertido < 1900 || anoAluno3Convertido > dataAtual.getYear()) {
                throw new Exception("Data de nascimento deve ser maior ou igual a 1900 e menor ou igual ao ano atual.");
            }

            String mesAluno3 = JOptionPane.showInputDialog("Digite o mês de nascimento do aluno 3");
            String diaAluno3 = JOptionPane.showInputDialog("Digite o dia de nascimento do aluno 3");
            int mesAluno3Convertido = Integer.parseInt(mesAluno3);
            int diaAluno3Convertido = Integer.parseInt(diaAluno3);

            String rmAluno4 = JOptionPane.showInputDialog("Digite o RM do aluno 4");
            int rmAluno4Convertido = Integer.parseInt(rmAluno4);
            if (rmAluno4Convertido >= 95001 && rmAluno4Convertido <= 552999) {
                aluno4.setRm(rmAluno4Convertido);
            } else {
                throw new Exception("RM deve ser maior ou igual a 95001e menor ou igual a 552999");
            }

            String nomeAluno4 = JOptionPane.showInputDialog("Digite o nome do aluno 4");
            aluno4.setNome(nomeAluno4);

            String anoAluno4 = JOptionPane.showInputDialog("Digite o ano de nascimento do aluno 4");
            int anoAluno4Convertido = Integer.parseInt(anoAluno4);

            if (anoAluno4Convertido < 1900 || anoAluno4Convertido > dataAtual.getYear()) {
                throw new Exception("Data de nascimento deve ser maior ou igual a 1900 e menor ou igual ao ano atual.");
            }

            String mesAluno4 = JOptionPane.showInputDialog("Digite o mês de nascimento do aluno 4");
            String diaAluno4 = JOptionPane.showInputDialog("Digite o dia de nascimento do aluno 4");

            int mesAluno4Convertido = Integer.parseInt(mesAluno4);
            int diaAluno4Convertido = Integer.parseInt(diaAluno4);

            aluno3.setDataDeNascimento(LocalDate.of(anoAluno3Convertido, mesAluno3Convertido, diaAluno3Convertido));

            aluno4.setDataDeNascimento(LocalDate.of(anoAluno4Convertido, mesAluno4Convertido, diaAluno4Convertido));

            System.out.println("------------- Lista de alunos -------------\n");
            System.out.println("Aluno 1:");
            System.out.println("RM: " + aluno1.getRm());
            System.out.println("Nome: " + aluno1.getNome());
            System.out.println(aluno1.calculaIdadeCompleta(dataAtual) + "\n");
            System.out.println("Aluno 2:");
            System.out.println("RM: " + aluno2.getRm());
            System.out.println("Nome: " + aluno2.getNome());
            System.out.println(aluno2.calculaIdadeCompleta(dataAtual) + "\n");
            System.out.println("Aluno 3:");
            System.out.println("RM: " + aluno3.getRm());
            System.out.println("Nome: " + aluno3.getNome());
            System.out.println(aluno3.calculaIdadeCompleta(dataAtual) + "\n");
            System.out.println("Aluno 4:");
            System.out.println("RM: " + aluno4.getRm());
            System.out.println("Nome: " + aluno4.getNome());
            System.out.println(aluno4.calculaIdadeCompleta(dataAtual) + "\n");

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
