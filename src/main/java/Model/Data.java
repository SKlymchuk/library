package Model;

public enum Data {
    Hall(1974, "Projective planes"),
    Dagotto(1997, "Translation planes"),
    Riera(1992 , "Superconductivity in ladders and coupled planes"),
    Helmcke(2004, "Color Doppler assessment of mitral regurgitation"),
    Carbon(1988, "Raman spectra of graphite edge planes"),
    Bruck(2003, "The nonexistence of certain finite projective planes"),
    Lindzen(1967, "Planetary waves on beta-planes"),
    Liebowitz(1998, "Metric rectification for perspective images of planes"),
    Knuth(1963, "Finite semifields and projective planes");


    private final int year;
    private final String title;

    Data(int year, String title) {
        this.year = year;
        this.title = title;
    }

    public int getYear(){
        return year;
    }

    public String getTitle() {
        return title;
    }
}
