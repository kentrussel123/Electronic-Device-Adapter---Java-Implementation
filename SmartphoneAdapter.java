public class SmartphoneAdapter implements DeviceAdapter {
    private SmartphoneCharger charger;

    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    public void plugIn() {
        charger.chargePhone();
    }
}