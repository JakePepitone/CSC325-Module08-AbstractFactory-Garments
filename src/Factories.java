// Abstract Factory interface.
// Declares one creation method per product in the family. The key
// benefit: a single factory instance always creates products from the
// SAME variant, guaranteeing the customer gets a matching outfit.
interface GarmentFactory {
      Top createTop();
      Pants createPants();
      Shoes createShoes();
}

// ---- Concrete Factories ----
// Each concrete factory corresponds to exactly one variant and knows
// which concrete product classes to instantiate. Adding a brand new
// variant later (e.g. "Athletic") only requires adding one new class
// here plus its products in Products.java -- no existing code changes.

class ProfessionalGarmentFactory implements GarmentFactory {
      public Top createTop() { return new ProfessionalTop(); }
      public Pants createPants() { return new ProfessionalPants(); }
      public Shoes createShoes() { return new ProfessionalShoes(); }
}

class CasualGarmentFactory implements GarmentFactory {
      public Top createTop() { return new CasualTop(); }
      public Pants createPants() { return new CasualPants(); }
      public Shoes createShoes() { return new CasualShoes(); }
}

class PartyGarmentFactory implements GarmentFactory {
      public Top createTop() { return new PartyTop(); }
      public Pants createPants() { return new PartyPants(); }
      public Shoes createShoes() { return new PartyShoes(); }
}
