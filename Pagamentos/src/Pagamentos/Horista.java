/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

/**
 *
 * @author luiza
 */
public class Horista extends Funcionario{
    private double valorHora;
    private int hora;

    public Horista(double valorHora, int hora, String nome, String CPF, String endereco, String telefone, String setor) {
        super(nome, CPF, endereco, telefone, setor);
        this.valorHora = valorHora;
        this.hora = hora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    @Override
    public double calculaSalario() {
        var salarioParcial = hora * valorHora;
        return salarioParcial + (salarioParcial* getAumento()/100);
    }
    @Override
     public void folhaSalarial(){
                  
          System.out.println("Nome do funcionario: " + getNome());
          System.out.println("CPF do funcionario: " + getCPF());
          System.out.println("Endereço do funcionario: " + getEndereco());
          System.out.println("Telefone do funcionario: " + getTelefone());
          System.out.println("O setor do funcionario: " + getSetor());
          System.out.println("Horas trabalhadas: " + getHora());
          System.out.println("Salario/Hora: " + getValorHora());
          System.out.println("Horas trabalhadas: " + (getHora() * getValorHora()));
          System.out.println("porcentagem de aumento: " + getAumento() + "%");
          System.out.println("O salário final: " + calculaSalario());
          System.out.println("\n ");
     }
}
