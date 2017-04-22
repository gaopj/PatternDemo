package gpj.builder;

public class JizaiAirShipBuilder implements AirShipBuilder{  //StringBuilder

	@Override
	public Engine builderEngine() {
		System.out.println("构建鸡仔牌发动机");
		return new Engine("鸡仔牌发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建鸡仔牌轨道舱");
		return new OrbitalModule("鸡仔牌轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建鸡仔牌逃逸塔");
		return new EscapeTower("鸡仔牌逃逸塔");
	} 

}
