public class Automobil extends Vehicul {
    private TipCombustibilSursaPutere tip;
    private TipTransmisie cutieViteze;

    public Automobil(int vitezaMaxima, String model, TipCombustibilSursaPutere tip, TipTransmisie cutieViteze) {
        super(vitezaMaxima, model);
        this.tip = tip;
        this.cutieViteze = cutieViteze;
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Tip combustibil/sursa putere: " + tip);
        System.out.println("Cutie de viteze: " + cutieViteze);
    }

    public void salvare(String numeFisier) {
        // Implement file saving logic here
    }

    // Getters and setters for tip and cutieViteze
    public TipCombustibilSursaPutere getTip() {
        return tip;
    }

    public void setTip(TipCombustibilSursaPutere tip) {
        this.tip = tip;
    }

    public TipTransmisie getCutieViteze() {
        return cutieViteze;
    }

    public void setCutieViteze(TipTransmisie cutieViteze) {
        this.cutieViteze = cutieViteze;
    }
}