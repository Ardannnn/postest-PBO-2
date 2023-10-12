package menu;

public class SeblakBasah extends ProdukSeblak{
    private String seblakBasah;

    public SeblakBasah(String idProduct, String nameProduct, int priceProduct, String levelSpicy) {
        super(idProduct, nameProduct, priceProduct);
        this.seblakBasah = levelSpicy;
    }

    public final String getLevelSpicy() {
        return seblakBasah;
    }
    public void setLevelSpicy(String levelSpicy) {
        this.seblakBasah = levelSpicy;
    }

    @Override
    public void printProduct() {
        System.out.println("====================================");
        System.out.println("            Seblak Basah          ");
        System.out.println("====================================");
        System.out.println("> No: " + getIdProduct());
        System.out.println("> Nama: " + getNameProduct());
        System.out.println("> Harga: " + getPriceProduct());
        System.out.println("> Level Pedas: " + getLevelSpicy());
        System.out.println("====================================");
    }


}
