public class Main {
    public static void main(String[] args) {
        Shop shop = ShopFactory.createShop();

        ShopEmployee adelina = new ShopEmployee("Adelina");
        ShopEmployee madiyar = new ShopEmployee("Madiyar");
        ShopEmployee ramazan = new ShopEmployee("Ramazan");

        shop.addObserver(adelina);
        shop.addObserver(madiyar);
        shop.addObserver(ramazan);

        shop.openVacancy("Commercial Specialist.");

        madiyar.applyForJob(shop);
    }
}
