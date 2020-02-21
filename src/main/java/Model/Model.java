package Model;

import java.util.ArrayList;

public class Model {
    private ArrayList<Publication> lib = new ArrayList<Publication>();

    public Model(){
        for (int i = 0; i < 9; i++){
            setLib(new Publication(Data.values()[i].getTitle(), Data.values()[i].getYear(), Data.values()[i].name()));
        }
    }


//    Publication pub = new Publication("7 Habits", 1977, "Becklon");
//
    public void setLib(Publication pub) {
        lib.add(pub);
    }

    public ArrayList<Publication> getLib() {
        return lib;
    }
}
