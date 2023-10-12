package menu;
import java.util.ArrayList;
public class Menu {
    private static ArrayList<SeblakBasah> spicySeblaks = new ArrayList<>();
    private static ArrayList<SeblakKering> cheeseSeblaks = new ArrayList<>();

    // Spicy Seblak Methods
    public static void addSpicySeblak(SeblakBasah spicySeblak) {
        spicySeblaks.add(spicySeblak);
    }

    public static void removeSpicySeblak(String idProduct) {
        for (int i = 0; i < spicySeblaks.size(); i++) {
            if (spicySeblaks.get(i).getIdProduct().equals(idProduct)) {
                spicySeblaks.remove(i);
                break;
            }
        }
    }

    public static void printSpicySeblak() {
        for (SeblakBasah spicySeblak : spicySeblaks) {
            spicySeblak.printProduct();
        }
    }

    public static void updateSpicySeblak(String idProduct, String nameProduct, int priceProduct, String levelSpicy) {
        for (int i = 0; i < spicySeblaks.size(); i++) {
            if (spicySeblaks.get(i).getIdProduct().equals(idProduct)) {
                spicySeblaks.get(i).setNameProduct(nameProduct);
                spicySeblaks.get(i).setPriceProduct(priceProduct);
                spicySeblaks.get(i).setLevelSpicy(levelSpicy);
                break;
            }
        }
    }

    // Cheese Seblak Methods
    public static void addCheeseSeblak(SeblakKering cheeseSeblak) {
        cheeseSeblaks.add(cheeseSeblak);
    }

    public static void removeCheeseSeblak(String idProduct) {
        for (int i = 0; i < cheeseSeblaks.size(); i++) {
            if (cheeseSeblaks.get(i).getIdProduct().equals(idProduct)) {
                cheeseSeblaks.remove(i);
                break;
            }
        }
    }

    public static void printCheeseSeblak() {
        for (SeblakKering cheeseSeblak : cheeseSeblaks) {
            cheeseSeblak.printProduct();
        }
    }

    public static void updateCheeseSeblak(String idProduct, String nameProduct, int priceProduct, String levelCheese) {
        for (int i = 0; i < cheeseSeblaks.size(); i++) {
            if (cheeseSeblaks.get(i).getIdProduct().equals(idProduct)) {
                cheeseSeblaks.get(i).setNameProduct(nameProduct);
                cheeseSeblaks.get(i).setPriceProduct(priceProduct);
                cheeseSeblaks.get(i).setLevelCheese(levelCheese);
                break;
            }
        }
    }

    public static void printAllMenu() {
        printSpicySeblak();
        printCheeseSeblak();
    }

    public static boolean checkIdSpicy(String idSeblakSpicy) {
        for (int i = 0; i < spicySeblaks.size(); i++) {
            if (spicySeblaks.get(i).getIdProduct().equals(idSeblakSpicy)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdCheese(String idSeblakCheese) {
        for (int i = 0; i < cheeseSeblaks.size(); i++) {
            if (cheeseSeblaks.get(i).getIdProduct().equals(idSeblakCheese)) {
                return true;
            }
        }
        return false;
    }
}
