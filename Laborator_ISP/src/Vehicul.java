// The Vehicul class
public class Vehicul {
    private int vitezaMaxima;
    private String model;

    public Vehicul(int vitezaMaxima, String model) {
        this.vitezaMaxima = vitezaMaxima;
        this.model = model;
    }

    public void afisare() {
        System.out.println("Vehicul: " + model + " Viteza maxima: " + vitezaMaxima + " km/h");
    }

    // Getters and setters for vitezaMaxima and model
    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}