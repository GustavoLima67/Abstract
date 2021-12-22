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
public class Individual extends TaxPlayer {

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
    public Double tax() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String toString(){
        return getName()+": $ ";
    }
    
}
