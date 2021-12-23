/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int payers = sc.nextInt();
        for(int i=1;i<=payers;i++){
            System.out.println("Tax payer #"+i+" data: ");
            System.out.print("Individual or Company(i/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpemditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpemditures));
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAIND: ");
        for(TaxPayer tp : list){
            System.out.println(tp.getName() + ": $ " + String.format("%.2f%n",tp.tax()));
        }
        double sum = 0.0;
        for(TaxPayer tp : list){
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ "+String.format("%.2f",sum));
    }
}
