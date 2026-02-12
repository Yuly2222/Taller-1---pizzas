
package edu.unisabana.pizzafactory.model;


public class ExcepcionParametrosInvalidos extends Exception implements PreparadorPizza {

    public ExcepcionParametrosInvalidos(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionParametrosInvalidos(String message) {
        super(message);
    }
    
    
    
}
