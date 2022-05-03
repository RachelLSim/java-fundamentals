

public class Droid {
    String serialNumber;
    Model model;
    String purpose;

    //this is the constructor//
    public Droid(String serialNumber, Model model, String purpose) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.purpose = purpose;
    }

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
    public Model getModel() { return model; }
    public void setModel(Model model) { this.model = model; }
    public void speak() { System.out.println("beep beep boop! woop woop");}

    @Override
    public String toString() {
        return "Droid{" + "serialNumber='" + serialNumber + '\'' + ", model=" + model + ", purpose=" + purpose + '}';
    }

}
