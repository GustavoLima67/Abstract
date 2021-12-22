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
            if(ch == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpemditures = sc.nextDouble();
                list.add(new TaxPayer(name, anualIncome) {
                    @Override
                    public double tax() {
                        throw new UnsupportedOperationException("Not supported yet."); 
                    }
                });
                list.add(new Individual(name, anualIncome, healthExpemditures));
                
            }
            else{
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberEmployees));
            }
        }
    }
}
