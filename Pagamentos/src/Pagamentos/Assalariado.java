/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

/**
 *
 * @author luiza
 */

public class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(double salarioMensal, String nome, String CPF, String endereco, String telefone, String setor) {
        super(nome, CPF, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calculaSalario() {
        var salarioParcial = salarioMensal;
        return salarioParcial + (salarioParcial* getAumento()/100);
    }
    @Override
    public void folhaSalarial(){
                  
          System.out.println("Nome do funcionario: " + getNome());
          System.out.println("CPF do funcionario: " + getCPF());
          System.out.println("Endereço do funcionario: " + getEndereco());
          System.out.println("Telefone do funcionario: " + getTelefone());
          System.out.println("O setor do funcionario: " + getSetor());
          System.out.println("O salário do funcionario: " + getSalarioMensal());
          System.out.println("porcentagem de aumento: " + getAumento() + "%");
          System.out.println("O salário final: " + calculaSalario());
          System.out.println("\n ");
          
    }
    
}
