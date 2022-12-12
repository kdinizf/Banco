package tech.ada.banco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Banco Ada!");

        Pessoa pessoa1 = new Pessoa("Katina","12345678912","28/12/1992");

        pessoa1.nome = "Karina";
        pessoa1.cpf = "12345678909";
        pessoa1.dataNascimento = "28/12/1992";
        pessoa1.telefone = "11953468508";

        System.out.println("O nome da pessoa1 é: " + pessoa1.nome);
        System.out.println("O CPF da pessoa1 é: " + pessoa1.cpf);
        System.out.println("A data de nascimento da pessoa1 é: " + pessoa1.dataNascimento);
        System.out.println("O telefone da pessoa1 é: " + pessoa1.telefone);

    }

    public String getNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome:");
        return scanner.nextLine();
    }

}