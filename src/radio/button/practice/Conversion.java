/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio.button.practice;

/**
 *
 * @author alancerio18
 */
public class Conversion {
    
    public final double FahrenheitToCelcius(String input){
       double formula = (Double.parseDouble(input) - 32) * 5/9;
       return formula;

    }
    public final double CelciusToFahrenheit(String input){
      double formula = (Double.parseDouble(input) * 1.8) + 32;
      return formula;
    }
}
