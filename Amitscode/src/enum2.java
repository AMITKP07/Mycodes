enum Planet {
    MERCURY(3.30e+23, 2.4397e6),
    VENUS(4.87e+24, 6.0518e6),
    EARTH(5.97e+24, 6.371e6),
    MARS(6.42e+23, 3.3895e6);

    private final double mass;
    private final double radi;

    Planet(double mass, double radi) {
        this.mass = mass;
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public double getMass() {
        return mass;
    }
    public double getgravity() {
        final double G=6.67430e-11;
        return G*mass/(radi*radi);
    }
}
public class enum2 {
    public static void main(String[] args) {
        for (Planet planet:Planet.values()) {
            System.out.println(planet+" mass:"+ planet.getMass() +" radi:"+planet.getRadi()+" gravity:"+planet.getgravity());
        }
    }

}
