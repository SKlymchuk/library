package View;


import Model.Publication;

/**
 * Created by student on 26.09.2017.
 */
public class View {

    //Utilities methods
    public final String MAIN = "1 - Весь список, 2 - Поиск, 3 - Выход";
    public final String WRONGINPUT = "Неправильный ввод";
    public final String LINE = "=======================================";
    public final String FINDMENU = "1 - Поиск по году, 2 - Поиск по автору, 3 - Выход";
    public final String YEARS = "Доступные года: ";
    public final String AUTHORS = "Доступные авторы: ";





    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessage(Publication message){
        System.out.println(message);
    }
    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
