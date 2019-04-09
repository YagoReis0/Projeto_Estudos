package model;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Senac
 */
public class Carros {
    
    private List<String> carros;

    public Carros() {
        carros = new ArrayList();
    } 

    public List<String> getCarros(String categoria) {
        if(categoria.equals("nacional")){
            carros.add("Volkswagem");
            carros.add("Fiat");
            carros.add("Chevrolet");
            carros.add("Ford");
        } else if (categoria.equals("importado")){
            carros.add("BMW");
            carros.add("Honda");
            carros.add("Toyota");
            carros.add("Audi");
            carros.add("Lamborghini");
        }
        return carros;
    }

    public void setCarros(List<String> carros) {
        this.carros = carros;
    }
    
    
}
