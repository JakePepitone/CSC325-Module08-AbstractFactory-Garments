// Abstract Product interfaces.
// Each interface represents one category of garment in the product
// family. Client code (the driver) only ever depends on these
// interfaces, never on the concrete classes below, which is what lets
// us add new variants without touching existing code.
interface Top {
      String describe();
}

interface Pants {
      String describe();
}

interface Shoes {
      String describe();
}

// ---- Professional variant: concrete products ----
class ProfessionalTop implements Top {
      public String describe() { return "Professional Blazer"; }
}
class ProfessionalPants implements Pants {
      public String describe() { return "Professional Slacks"; }
}
class ProfessionalShoes implements Shoes {
      public String describe() { return "Professional Oxfords"; }
}

// ---- Casual variant: concrete products ----
class CasualTop implements Top {
      public String describe() { return "Casual T-Shirt"; }
}
class CasualPants implements Pants {
      public String describe() { return "Casual Jeans"; }
}
class CasualShoes implements Shoes {
      public String describe() { return "Casual Sneakers"; }
}

// ---- Party variant: concrete products ----
class PartyTop implements Top {
      public String describe() { return "Party Sequin Shirt"; }
}
class PartyPants implements Pants {
      public String describe() { return "Party Slim-Fit Trousers"; }
}
class PartyShoes implements Shoes {
      public String describe() { return "Party Dress Shoes"; }
}
