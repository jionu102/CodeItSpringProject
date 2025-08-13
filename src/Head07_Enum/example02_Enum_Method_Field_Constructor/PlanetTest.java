package Head07_Enum.example02_Enum_Method_Field_Constructor;

public class PlanetTest {
    public static void main(String[] args) {

        for (Planet p : Planet.values()) {
            System.out.println(p.toString());
        }
    }
}

