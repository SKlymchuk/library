package Controller;

import Model.*;
import View.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        choose(sc);

    }

        public void choose(Scanner sc) {

            outer:
            while (true) {
                view.printMessage(view.MAIN);
                if (sc.hasNextInt()) {
                    int scanValue = sc.nextInt();
                    switch (scanValue) {
                        case 1:
                            viewList();
                            view.printMessage(view.LINE);
                            break;
                        case 2:
                            while (true) {
                                view.printMessage(view.FINDMENU);
                                if (sc.hasNextInt()) {
                                    int scan = sc.nextInt();
                                    switch (scan) {
                                        case 1:
                                            boolean find = false;
                                            List<Integer> years1 = getYearsList();
                                            if (sc.hasNextInt()) {
                                                int scYear = sc.nextInt();
                                                for (Publication year : model.getLib()) {
                                                    if (scYear == (int) year.getYear()) {
                                                        view.printMessage(year);
                                                        find = true;
                                                        break;
                                                    }
                                                }
                                                if (!find) {
                                                    view.printMessage(view.WRONGINPUT);
                                                    getYearsList();
                                                }
                                            } else {
                                                view.printMessage(view.WRONGINPUT);
                                                sc.nextLine();
                                            }
                                            break ;

                                        case 2:
                                            boolean findAuthor = false;
                                            List<String> authors = getAuthorList();
                                            if (sc.hasNext()) {
                                                String scAuthor = sc.next();
                                                for (Publication pub : model.getLib()) {
                                                    if (scAuthor.toLowerCase().equals(pub.getAuthor().toLowerCase())) {
                                                        view.printMessage(pub);
                                                        findAuthor = true;
                                                        break;
                                                    }
                                                }
                                                if (!findAuthor) {
                                                    view.printMessage(view.WRONGINPUT);
                                                    getAuthorList();
                                                }
                                            } else {
                                                view.printMessage(view.WRONGINPUT);
                                                sc.nextLine();
                                            }
                                            break ;
                                        case 3:
                                            break outer;

                                        default: {
                                            view.printMessage(view.WRONGINPUT);
                                            break;
                                        }
                                    }
                                }
                                else {
                                    view.printMessage(view.WRONGINPUT);
                                    sc.nextLine();
                                }
                            }
                                case 3:
                                    break outer;

                                default: {
                                    view.printMessage(view.WRONGINPUT);
                                    break;
                                }
                            }
                    }
                else{
                        view.printMessage(view.WRONGINPUT);
                        sc.nextLine();
                    }
                }
            }


    public List<Integer> getYearsList() {
        List<Integer> years = new ArrayList<Integer>();
        for(Publication year : model.getLib())
            years.add(year.getYear());
        printYears(years);
        return years;
    }

    public void printYears(List<Integer> years) {
        view.printMessage(view.YEARS);
        for(Integer year : years)
            view.printMessage("" + year);
        view.printMessage(view.LINE);
    }
    public List<String> getAuthorList() {
        List<String> authors = new ArrayList<String>();
        for(Publication author : model.getLib())
            authors.add(author.getAuthor());
        printAuthors(authors);
        return authors;
    }
    public void printAuthors(List<String> authors) {
        view.printMessage(view.AUTHORS);
        for (String author : authors)
            view.printMessage("" + author);
        view.printMessage(view.LINE);
    }

    public void viewList() {
        List<Publication> ref = model.getLib();
        for (Publication pub : ref)
            view.printMessage(pub + "\n" + view.LINE);
    }


//    public String inputValueWithScanner(Scanner scanner, String message){
//        String res;
//        view.printMessage(message);
//        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
//            view.printMessage(TextConstant.INPUT_ERROR);
//        }
//        return res;
//
//    }

}
