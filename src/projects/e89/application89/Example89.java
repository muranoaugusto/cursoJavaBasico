package projects.e89.application89;

import java.util.Scanner;

import projects.e89.entities89.Product89;

public class Example89 {
    
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
}

