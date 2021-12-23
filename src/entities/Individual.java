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
public class Individual extends TaxPayer {

    private Double healthExpreditures;
    
    public Individual(){
        super();
    }
    public Individual(String name,Double anualIncome,Double healthExpreditures){
        super(name, anualIncome);
        this.healthExpreditures = healthExpreditures;
    }   
    public Double getHealthExpreditures(){
        return healthExpreditures;
    }
    @Override
    public double tax() {
        double basicTax = 0.0;
        if(getAnualIncome() < 20000.00){
            basicTax -= getAnualIncome() * 0.15;
        }else{
            basicTax -= getAnualIncome() * 0.25;
        }
        basicTax -= getHealthExpreditures() * 0.5;
        if(basicTax < 0.0){
            return 0.0;
        }else{
            return basicTax;
        }
    }
}
