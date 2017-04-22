package gpj.builder;

public class JizaiAirshipDirector implements AirShipDirector {

	public JizaiAirshipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}
	private AirShipBuilder builder;
	@Override
	public AirShip directorAirShip() {
		Engine engine= builder.builderEngine();
		EscapeTower escapeTower= builder.builderEscapeTower();
		OrbitalModule orbitalModule= builder.builderOrbitalModule();
		
		AirShip ship = new AirShip();
		ship.setEngine(engine);
		ship.setEscapeTower(escapeTower);
		ship.setOrbitalModule(orbitalModule);
		return ship;
	}

}
