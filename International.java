class International extends Traveler {

    boolean hasVisa; // checks if an international has a valid visa
    boolean isClean; // checks if the traveller did not have any crimes
    boolean crimeExplained; // checks if there is a crime, it was explained

    public International(boolean hasUnknown, boolean hasProhib, boolean hasVisa, boolean isClean, boolean crimeExplained) {
      super(hasUnknown, hasProhib);
      this.hasVisa = hasVisa;
      this.isClean = isClean;
      this.crimeExplained = crimeExplained;
		}

}