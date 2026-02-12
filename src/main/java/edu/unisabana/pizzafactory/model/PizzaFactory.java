package edu.unisabana.pizzafactory.model;

public interface PizzaFactory {

	public String type = "DESCONOCIDA";

	public AmasadorPizza crearAmasador();
	public HorneadorPizza crearHorneador();
	public MoldeadorPizza crearMoldeador();

}
