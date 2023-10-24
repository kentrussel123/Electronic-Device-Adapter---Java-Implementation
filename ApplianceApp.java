
public class ApplianceApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        SmartphoneAdapter chargerAdapter = new SmartphoneAdapter(charger);

        PowerOutlet powerOutlet = new PowerOutlet();

        powerOutlet.plugIn(laptopAdapter);
        powerOutlet.plugIn(refrigeratorAdapter);
        powerOutlet.plugIn(chargerAdapter);
    }
}