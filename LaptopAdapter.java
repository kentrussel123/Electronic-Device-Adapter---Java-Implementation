public class LaptopAdapter implements DeviceAdapter {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    public void plugIn() {
        laptop.charge();
    }
}