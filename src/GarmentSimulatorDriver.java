// Driver / Client class.
// Notice that this class only ever references the abstract types
// (GarmentFactory, Top, Pants, Shoes). It never names a concrete
// product or a concrete factory directly, which is what allows new
// product families or variants to be plugged in later without
// modifying this class at all -- satisfying the Open/Closed Principle.
public class GarmentSimulatorDriver {

    // Produces and prints a matching outfit from whichever factory is passed in.
    private static void outfitCustomer(GarmentFactory factory, String variantName) {
              Top top = factory.createTop();
              Pants pants = factory.createPants();
              Shoes shoes = factory.createShoes();

          System.out.println("Outfit (" + variantName + "):");
              System.out.println("  Top:   " + top.describe());
              System.out.println("  Pants: " + pants.describe());
              System.out.println("  Shoes: " + shoes.describe());
              System.out.println();
    }

    public static void main(String[] args) {
              GarmentFactory professional = new ProfessionalGarmentFactory();
              GarmentFactory casual = new CasualGarmentFactory();
              GarmentFactory party = new PartyGarmentFactory();

          outfitCustomer(professional, "Professional");
              outfitCustomer(casual, "Casual");
              outfitCustomer(party, "Party");
    }
}
