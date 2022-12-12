package tech.ada.banco;

public class Pessoa {

    String nome;
    String dataNascimento;
    String cpf;
    String telefone;

    Pessoa(String nome, String cpf, String dataNascimento) {
        System.out.println(cpf);
        System.out.println(this.cpf);

        this.cpf = cpf;

    }



}
