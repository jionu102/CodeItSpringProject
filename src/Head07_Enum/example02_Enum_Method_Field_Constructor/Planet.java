package Head07_Enum.example02_Enum_Method_Field_Constructor;

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6, "수성"),
    VENUS(4.869e+24, 6.0518e6, "금성"),
    EARTH(5.976e+24, 6.37814e6, "지구");

    private final double mass;
    private final double radius;
    private final String name;

    Planet(double mass, double radius, String name) {
        this.mass = mass;
        this.radius = radius;
        this.name = name;
    }

    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }

    @Override
    public String toString() {
        return name + " (gravity=" + surfaceGravity() + ")";
    }
}
