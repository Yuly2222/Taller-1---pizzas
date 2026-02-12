
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.AmasadorPizza;
import edu.unisabana.pizzafactory.model.HorneadorPizza;
import edu.unisabana.pizzafactory.model.MoldeadorPizza;
import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaDelgadaFactory;
import edu.unisabana.pizzafactory.model.PizzaFactory;
import edu.unisabana.pizzafactory.model.PizzaGruesaFactory;
import edu.unisabana.pizzafactory.model.PizzaIntegralFactory;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();            
            
            PizzaDelgadaFactory pdf = new PizzaDelgadaFactory();
            PizzaGruesaFactory pgf = new PizzaGruesaFactory();
            PizzaIntegralFactory pif = new PizzaIntegralFactory();
            
            pp.prepararPizza(ingredientes, Tamano.MEDIANO, pdf);
            pp.prepararPizza(ingredientes, Tamano.MEDIANO, pgf);
            pp.prepararPizza(ingredientes, Tamano.MEDIANO, pif);

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, PizzaFactory factory)
            throws ExcepcionParametrosInvalidos {
        AmasadorPizza am = factory.crearAmasador();
        HorneadorPizza hpd = factory.crearHorneador();
        MoldeadorPizza mp = factory.crearMoldeador();

        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
