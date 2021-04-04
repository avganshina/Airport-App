import javax.lang.model.util.ElementScanner6;

class Main {
  
  public static String green(Traveler t){
    String str = "GREEN: Legally allowed to the USA";
    return str;
  }

  public static String redHasUnknown(Traveler t){
    String str = "RED: Has an Unkknown Substance";
    return str;
  }

  public static String redHasProhib(Traveler t){
    String str = "RED: Has a Prohibited Object";
    return str;
  }

  public static String redHasVisa(Traveler t){
    String str = "RED: Has no Valid Visa";
    return str;
  }

  public static String redIsClean(Traveler t){
    String str = "RED: Failed Background Check";
    return str;
  }

  public static String checkCitizen(Traveler T){
    if (T.hasUnknown){
      return redHasUnknown(T);
    }
    else if (T.hasProhib){
      return redHasProhib(T);
    }
      return green(T);
  } 

  public static String checkInternational(International T){
    if (T.hasUnknown)
      return redHasUnknown(T);
    else if (T.hasProhib)
      return redHasProhib(T);
    else if (!(T.hasVisa))
      return redHasVisa(T);
    else if(!(T.isClean)){
      if (!(T.crimeExplained))
      return redIsClean(T);
    } 
      return green(T);
  } 

  
  public static void main(String[] args) {

    Traveler Josh = new Traveler(false, false); // GREEN
    Traveler Joe = new Traveler(false, true); // RED
    Traveler Jenna = new Traveler(true, false); // RED

    International Irina = new International (false, false, true, true, false); // GREEN
    International Alla = new International (true, false, true, false, false); // RED: HasUnknown
    International Tanya = new International (false, false, true, false,false); // RED: Background Check
    International Tamara = new International (false, false, false, true, false); // RED: No Valid Visa 
    International Vlad = new International (false, false, true, true, true); // GREEN

    System.out.println(checkCitizen(Josh));
    System.out.println(checkCitizen(Joe));
    System.out.println(checkCitizen(Jenna));

    System.out.println(checkInternational(Irina));
    System.out.println(checkInternational(Alla));
    System.out.println(checkInternational(Tanya));
    System.out.println(checkInternational(Tamara));
    System.out.println(checkInternational(Vlad));

  }
}