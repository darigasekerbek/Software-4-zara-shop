public class ShopEmployee implements Observer {
    private String name;

    public ShopEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void applyForJob(Shop shop) {
        shop.applyForJob(this);
        shop.acceptApplication(this);
        shop.announceEmployeePlacement(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": Notification - " + message);
    }
}
