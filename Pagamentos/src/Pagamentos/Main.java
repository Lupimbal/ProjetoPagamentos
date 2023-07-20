/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author luiza
 */
public class Atividade3 {

    /**
     * Crie um projeto Java NetBeans com as classes/interfaces e implemente um código principal que
permita que o usuário informe dados para até 10 funcionários, questionando o tipo (assalariado/horista) e lendo os dados necessários. Mantenha-os em uma única lista independentemente se são assalariados ou horistas.
Mostre na tela os dados e o pagamento de cada um dos funcionários.
Aplique um aumento geral (informado pelo usuário) para todos os funcionários e mostre novamente os pagamentos de cada um deles.
Use encapsulamento nas classes.
     */
    public static void main(String[] args) {
       
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
               
        for (int i = 0 ; i < 10 ; i ++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Funcionario Assalariado (1) ou Horista (2)? ");
            int tipoFuncionario = Integer.parseInt( scanner.nextLine());
            System.out.println("Nome do funcionario: ");
            String nome = scanner.nextLine();
            System.out.println("CPF do funcionario: ");
            String CPF = scanner.nextLine();
            System.out.println("Telefone do funcionario: ");
            String telefone = scanner.nextLine();
            System.out.println("Endereço do funcionario: ");
            String endereco = scanner.nextLine();
            System.out.println("Setor em que trabalha: ");
            String setor = scanner.nextLine();
            if (tipoFuncionario == 1){
                System.out.println("O valor do salário é:  ");
                double salarioMensal = scanner.nextDouble();
                Assalariado assalariado = new Assalariado(salarioMensal, nome, CPF, telefone, endereco, setor);
                funcionarios.add(assalariado);
            }
            else {
                System.out.println("Qual o valor/hora? ");
                double valorHora = Double.parseDouble(scanner.nextLine());
                System.out.println("Quantas horas trabalhada? ");
                int hora = Integer.parseInt( scanner.nextLine());
                Horista horista = new Horista (valorHora, hora, nome, CPF, telefone, endereco, setor);
                funcionarios.add(horista);
            }
            
            
        } 
       System.out.println("\n");
       System.out.println("Exibindo a folha salarial: ");
       System.out.println("\n");
       
      for(Funcionario funcionario : funcionarios){
          funcionario.folhaSalarial();
          
      }
       Scanner scanner = new Scanner(System.in);
       System.out.println("Qual o valor do aumento? ");
       double aumento = scanner.nextDouble();
       System.out.println("\n");
       System.out.println("Exibindo a folha salarial atualizada: ");
       System.out.println("\n");
       for(Funcionario funcionario : funcionarios){
          funcionario.setAumento(aumento);
          funcionario.folhaSalarial();
          

        
      }
       
       
       
      
}
    
}
