/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Gustavo
 */
public class Company extends TaxPlayer {

    private Integer numberOfEmployees;
    
    public Company(){
        super();
    }
    public Company(String name,Double anualIncome,Integer numberOfEmployees){
        super(name,anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public Integer getNumberOfEmployees(){
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public Double tax() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
