public class Main {
    public static void main(String[] args) {
        Shop zara = ShopFactory.createShop();

        ShopEmployee adelina = new ShopEmployee("Adelina");
        ShopEmployee madiyar = new ShopEmployee("Madiyar");
        ShopEmployee ramazan = new ShopEmployee("Ramazan");

        zara.addObserver(adelina);
        zara.addObserver(madiyar);
        zara.addObserver(ramazan);

        zara.openVacancy("Commercial Specialist");

        madiyar.applyForJob(zara);
    }
}
