   package kedaiseblak;

import java.util.Scanner;

import menu.*;

public class KedaiSeblak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuStore;

        while (true) {
            System.out.println("====================================");
            System.out.println("          MENU KEDAI SEBLAK         ");
            System.out.println("====================================");
            System.out.println("1. Tambahkan Seblak Basah");
            System.out.println("2. Tambahkan Seblak Kering");
            System.out.println("3. Remove Seblak Basah");
            System.out.println("4. Remove Seblak Kering");
            System.out.println("5. Print Semua Seblak");
            System.out.println("6. Print Seblak Basah");
            System.out.println("7. Print Seblak Kering");
            System.out.println("8. Update Seblak Basah");
            System.out.println("9. Update Seblak Kering");
            System.out.println("10. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih Menu Anda : ");
            menuStore = scanner.nextInt();
            scanner.nextLine();

            switch (menuStore) {
                case 1:
                    System.out.println("====================================");
                    System.out.println("            Seblak Basah            ");
                    System.out.println("====================================");
                    System.out.print("> No: ");
                    String idSpicy = scanner.nextLine();
                    System.out.print("> Nama: ");
                    String nameSpicy = scanner.nextLine();
                    System.out.print("> Harga: ");
                    int priceSpicy = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Level Pedas: ");
                    String levelSpicy = scanner.nextLine();
                    Menu.addSpicySeblak(new SeblakBasah(idSpicy, nameSpicy, priceSpicy, levelSpicy));
                    break;
                case 2:
                    System.out.println("====================================");
                    System.out.println("            Seblak Kering           ");
                    System.out.println("====================================");
                    System.out.print("> No: ");
                    String idCheese = scanner.nextLine();
                    System.out.print("> Nama: ");
                    String nameCheese = scanner.nextLine();
                    System.out.print("> Harga: ");
                    int priceCheese = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Level Pedas: ");
                    String cheeseType = scanner.nextLine();
                    Menu.addCheeseSeblak(new SeblakKering(idCheese, nameCheese, priceCheese, cheeseType));
                    break;
                case 3:
                    System.out.println("====================================");
                    System.out.println("            Seblak Basah            ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idRemoveSpicy = scanner.nextLine();
                    if (!Menu.checkIdSpicy(idRemoveSpicy)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    Menu.removeSpicySeblak(idRemoveSpicy);
                    System.out.println("Seblak Basah with ID " + idRemoveSpicy + " has been removed!");
                    break;
                case 4:
                    System.out.println("====================================");
                    System.out.println("            Seblak Kering          ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idRemoveCheese = scanner.nextLine();
                    if (!Menu.checkIdCheese(idRemoveCheese)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    Menu.removeCheeseSeblak(idRemoveCheese);
                    System.out.println("Seblak Kering with ID " + idRemoveCheese + " has been removed!");
                    break;
                case 5:
                    Menu.printAllMenu();
                    break;
                case 6:
                    Menu.printSpicySeblak();
                    break;
                case 7:
                    Menu.printCheeseSeblak();
                    break;
                case 8:
                    System.out.println("====================================");
                    System.out.println("            Seblak Basah            ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idUpdateSpicy = scanner.nextLine();
                    if (!Menu.checkIdSpicy(idUpdateSpicy)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    System.out.print("> Nama: ");
                    String nameUpdateSpicy = scanner.nextLine();
                    System.out.print("> Harga: ");
                    int priceUpdateSpicy = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Level Pedas: ");
                    String levelUpdateSpicy = scanner.nextLine();
                    Menu.updateSpicySeblak(idUpdateSpicy, nameUpdateSpicy, priceUpdateSpicy, levelUpdateSpicy);
                    break;
                case 9:
                    System.out.println("====================================");
                    System.out.println("            Seblak Kering          ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idUpdateCheese = scanner.nextLine();
                    if (!Menu.checkIdCheese(idUpdateCheese)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    System.out.print("> Nama: ");
                    String nameUpdateCheese = scanner.nextLine();
                    System.out.print("> Harga: ");
                    int priceUpdateCheese = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Level Pedas: ");
                    String cheeseUpdateType = scanner.nextLine();
                    Menu.updateCheeseSeblak(idUpdateCheese, nameUpdateCheese, priceUpdateCheese, cheeseUpdateType);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
