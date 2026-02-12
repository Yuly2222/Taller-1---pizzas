package edu.unisabana.pizzafactory.model;

public class PizzaGruesaFactory implements PizzaFactory {

	public AmasadorPizza crearAmasador() {
		return new AmasadorPizzaGruesa();
	}

	public HorneadorPizza crearHorneador() {
		return new HorneadorPizzaGruesa();
	}

	public MoldeadorPizza crearMoldeador() {
		return new MoldeadorPizzaGruesa();
	}

}
