public interface Interface {

  // Person is allowed in the USA
  public String green(Traveler t);

  // Person is not allowed due to Unknown Substance
  public String redHasUnknown(Traveler t);

  // Person is not allowed due to Prohibited Object
  public String redHasProhib(Traveler t);

  // Person is not allowed due to invalid visa
  public String redHasVisa(Traveler t);

  // Person is not allowed as they have violated the Law
  public String redIsClean(Traveler t);

  // Method to check if the citizen is allowed
  public String checkCitizen(Traveler T);

  // Method to check if the internatonal is allowed
  public String checkInternational(International T);
  
}