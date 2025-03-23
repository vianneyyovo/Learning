public class CosinusClass {
    public CosinusClass(double value) {
        double toRadian = Math.toRadians(value);
        double result = Math.cos(toRadian);

        System.out.println("Le cosinus de" + " " + value + " " + "est" + " " + result);
    }
}
