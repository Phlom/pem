/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;


/**
 *
 * @author stasi
 */
public class Manager extends Employee{
    
    
   
    private double bonus;
    
    public Manager(String name, String last_name, int birthdate, double salary) {
        super(name, last_name, birthdate , salary);
        
    }

    
    public double managerBonus(double bonusPercentage) {
      bonus=getSalary()*bonusPercentage;
      return bonus;
    }
  
    }

    
