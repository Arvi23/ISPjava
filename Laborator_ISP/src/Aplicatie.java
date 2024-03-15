public class Aplicatie {
    public static void main(String[] args) {
        // Create an Automobil object with example parameters
        Automobil automobil = new Automobil(
            220, // Viteza maxima
            "Dacia Logan", // Model
            TipCombustibilSursaPutere.PeBenzina, // Tip combustibil
            TipTransmisie.Manuala // Cutie de viteze
        );

        // Call the afisare method to display the Automobil information
        automobil.afisare();
    }
}

