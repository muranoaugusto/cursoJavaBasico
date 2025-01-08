package projects.projetoParalelo.dataNascimento.entities;

import java.util.Date;

public class People {

    private String nome;
    private int idade;
    private double altura;
    private Date dataDeNascimento;

    public People(){
    }

    public People(String nome, int idade, double altura, Date dataDeNascimento){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
    }

    public People(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public void setDataDeNascimento(Date date){
        this.dataDeNascimento = date;
    }

    public Date getDataDeNascimento(){
        return dataDeNascimento;
    }

}
