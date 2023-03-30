public class Main {
    public static void main(String[] args) {


        BasicStructure car = new BasicStructure();
        car.model = "A3";
        car.power = "5000";
        car.color = "Black";

        Engine X = new Engine();
        X.cylinders = "8";
        X.size = "1234cc";
        X.weight = "6453k";


        color col = new color();
        col.colorLights = "true";
        col.colorType = "false";
        col.colorWindows="true";


        lights neon = new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";


    }
}