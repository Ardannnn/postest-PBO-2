package menu;

public class SeblakKering extends ProdukSeblak{
    private String seblakKering;

    public SeblakKering(String idProduct, String nameProduct, int priceProduct, String cheeseType) {
        super(idProduct, nameProduct, priceProduct);
        this.seblakKering = cheeseType;
    }

    public final String getCheeseType() {
        return seblakKering;
    }

    public void setLevelCheese(String cheeseType) {
        this.seblakKering = cheeseType;
    }

    @Override
    public void printProduct() {
        System.out.println("====================================");
        System.out.println("            Seblak Kering           ");
        System.out.println("====================================");
        System.out.println("> No: " + getIdProduct());
        System.out.println("> Nama: " + getNameProduct());
        System.out.println("> Harga: " + getPriceProduct());
        System.out.println("> Level Pedas: " + getCheeseType());
        System.out.println("====================================");
    }

}
