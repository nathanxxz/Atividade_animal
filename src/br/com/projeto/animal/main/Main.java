package br.com.projeto.animal.main;

import br.com.projeto.animal.model.Animal;

public class Main {
    public static void main(String[]args){
        Animal animal1=new Animal("Ave","Papagaio","verde",60);
        Animal animal2=new Animal("Mamifero","Elefante","Cinza",70);

        System.out.println("**********************************************************************");
        System.out.println("           EXIBINDO INFORMACOES DO PRIMEIRO ANIMAL");
        System.out.println("**********************************************************************");
        System.out.println();
        animal1.exibirInfor();
        System.out.println();
        animal1.calcularIdadeEmMeses();
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("           EXIBINDO INFORMACOES DO SEGUNDO ANIMAL");
        System.out.println("**********************************************************************");
        System.out.println();
        animal2.exibirInfor();
        System.out.println();
        animal2.calcularIdadeEmMeses();




    }
}
