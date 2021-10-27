package pl.camp.it.shop.sale;

import pl.camp.it.shop.sale.gui.database.DataBase;
import pl.camp.it.shop.sale.gui.Gui;
import pl.camp.it.shop.sale.model.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        DataBase dataBase=new DataBase();


        while (true){
            Gui.showMenu();
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner=new Scanner(System.in);
            String number=reader.readLine();
            switch(number) {
                case "1":
                    for (Shop shop : dataBase.getShop()) {
                        System.out.println(shop);
                        }

                    break;

                case "2":

                    System.out.println("Podaj numer produktu");
                    int numer = scanner.nextInt();
                    Shop shop = dataBase.kupProdukt(numer);
                    if (shop == null) {
                        System.out.println("Nie ma takiego produktu ");
                    } else {

                        System.out.println("Podaj ilosc sztuk");
                        int iloscSztuk = scanner.nextInt();

                        if (shop.getGuantity() == 0 || shop.getGuantity() >= iloscSztuk) {
                            int pom = shop.getGuantity() - iloscSztuk;
                            shop.setGuantity(pom);
                            shop.setKupiony(true);
                            System.out.println("Kupiles produkt");
                        } else {
                            System.out.println("Nie wystarczajaca ilosc sztuk w magazynie");
                        }
                    }
              break;

                case"3":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Zly numer menu");

            }

        }

    }
}
