package menu;

abstract public class ProdukSeblak {
    private final String idProduct;
    private String nameProduct;
    private int priceProduct;

    public ProdukSeblak (String idProduct, String nameProduct, int priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public final String getIdProduct() {
        return idProduct;
    }

    public final String getNameProduct() {
        return nameProduct;
    }

    public final int getPriceProduct() {
        return priceProduct;
    }

    public final void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public final void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    abstract public void printProduct();
}
