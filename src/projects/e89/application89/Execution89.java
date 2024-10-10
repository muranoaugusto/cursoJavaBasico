package projects.e89.application89;

import java.util.Locale;
import java.util.Scanner;

import projects.e89.entities89.People89;
import projects.e89.entities89.Product89;

public class Execution89 {
//  Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//  e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
    
    Scanner sc = new Scanner(System.in);
    double avg;
        
        public void resultado(){
        System.out.println("Insira o tamando do array"); 
        int n = sc.nextInt();
        Product89[] vect = new Product89[n];

        System.out.println("Insira os nomes e preços de cada produto");
    
        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Nome do Produto:");
            String name = sc.nextLine();
            System.out.println("Preço do produto:");
            double price = sc.nextDouble();
            vect[i] = new Product89(name, price);
            }

        double sum = 0.0;
        
        for (int i=0; i<n; i++){
            sum += vect[i].getPrice();
        }

    avg = sum / n; 

    }

    public double getAvg(){
        return avg;
    }


    public void resultadoExe1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o tamando do array");    
       
        int n = sc.nextInt();
            if (n>10){
                System.out.println("O valor Maximo permitido: 10");
                n=10;
            }
        
        int[] aN = new int[n];
    
        System.out.println("Insira "+ n + " valores");
            for (int i=0; i<n; i++) {
       // sc.nextLine();
        int x = sc.nextInt();
        aN[i] = x;         
        }

             for (int i=0; i<n; i++) {
                if (aN[i]<0){
                System.out.println("NUMEROS NEGATIVOS: "+ aN[i]);
                }    
        }
        sc.close();
    }
//   Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
//   - Imprimir todos os elementos do vetor 
//   - Mostrar na tela a soma e a média dos elementos do vetor 
    
    public void resultadoExe2(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o tamando do array");    
       
        int n = sc.nextInt();
        
        int[] aN = new int[n];
    
        System.out.println("Insira "+ n + " valores");
            for (int i=0; i<n; i++) {
       // sc.nextLine();
        int x = sc.nextInt();
        aN[i] = x;         
        }
            System.out.print("VALORES: " ); 
             for (int i=0; i<n; i++) {
                System.out.print(aN[i] + ", "); 
        }
            System.out.println(); 
            System.out.print("SOMA: " ); 
            int x = 0; 
            for (int i=0; i<n; i++) {
                x += aN[i]; 
        }
            System.out.print(x); 
            
            System.out.println();
            System.out.print("MEDIA: " ); 
            double avg;
            double sum = 0.0;

            for (int i=0; i<n; i++){
                sum += aN[i];
            }
            avg = sum / n;
            System.out.printf("%.2f%n", avg);

            sc.close();
    }

public void resultadoExe3(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas serão digitadas");    
       
        int n = sc.nextInt();
        
        People89[] people89An = new People89[n];
    
        System.out.println("Insira "+ n + " pessoas");
            int numeral = 1;
            for (int i=0; i<n; i++) {
            // sc.nextLine();
            System.out.println("Dados da "+ (numeral+i) +"ª pessoa");
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            People89 peopleAr = new People89(nome, idade, altura);
            people89An[i] = peopleAr;         
        }

            double avg, sum = 0.0;

            for (int i=0; i<n; i++){
                sum += people89An[i].getAltura();
            }
    
            avg = sum / n;
            System.out.print("Altura media: " ); 
            System.out.printf("%.2f%n", avg);

            double ndp = 0.0;
            for (int i=0; i<n; i++){
               if (people89An[i].getIdade()<16){
                ndp++;
               }
               else{
               }
            }
            
            double qIdadeMedia = ndp / n *100;
            System.out.print("Pessoas com menos de 16 anos: " ); 
            System.out.printf("%.1f%%%n", qIdadeMedia);
                         
            for (int i=0; i<n; i++){
               if (people89An[i].getIdade()<16){
                System.out.println(people89An[i].getNome());;
               }

        }   
        sc.close();
    }

    public void resultadoExe4(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar");    
       
        int n = sc.nextInt(), restoDaDivisao, contadorDePares=0;;
       
        int[] aI = new int[n];
    
        System.out.println("Insira "+ n + " numeros inteiros");
            
            for (int i=0; i<n; i++) {
            int numerosInteiros = sc.nextInt();
            aI[i] = numerosInteiros;         
        }

            for (int i=0; i<n; i++){

                restoDaDivisao = aI[i]%2;
                if (restoDaDivisao == 0){
                contadorDePares ++;
                System.out.print(" "+aI[i]);        

                }

            }   
            System.out.println();
            System.out.println("Quantidade de numeros pares: " + contadorDePares);

        sc.close();
    }   

    public void resultadoExe5(){

    //  Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
    //  o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
    //  considerando a primeira posição como 0 (zero). 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar");    
        int limit = 0;
        int n = sc.nextInt();
        while (limit == 0){
            
            if (n > 10) {
                System.out.println("No máximo 10");    
                limit = 0;
                n = sc.nextInt();
            }
            else if (n < 1) {
                System.out.println("O Valor Nao pode ser Negativo");    
                limit = 0; 
                n = sc.nextInt();
            }
            else {limit = n;
            }
        }

        int[] aI = new int[n];
    
        System.out.println("Insira "+ n + " numeros inteiros"); 
            
            for (int i=0; i<n; i++) {
            int numerosInteiros = sc.nextInt();
            aI[i] = numerosInteiros;         
        }
        
        for (int k = 0; k < aI.length; k++) {
            int valor = aI[k];

            if (valor < 0) {
                System.out.println(valor);
            
            }
        }

    }

    public void resultadoExe6(){
    


    }

}

    