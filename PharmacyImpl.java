class Pharmacy {
    private int capacity;
    private double totalSales;
    private Drug[][] drugs;

    public Pharmacy(int capacity) {
        this.capacity = capacity;
        this.totalSales = 0;
        drugs = new Drug[3][capacity];//cosmatics &&  prescription drugs && drugs
    }

    //////////////////////drug adding///////////////////////////////////////////////////
    public void addDrug(String name, int id, double price, String category, int availableQuantity, boolean prescriptionRequired) {
        for (int i = 0; i < 3; i++) {//for the 3 categories
            for (int j = 0; j < capacity; j++) {
                if (drugs[i][j] == null) {
                    drugs[i][j] = new Drug(name, id, (int) price, category, availableQuantity);
                    System.out.println("Drug is added to the stock");
                    return;
                }
            }
        }
        System.out.println("NO ROOM");
    }
////////////////////////////////////removing drugs///////////////////////////////////////////////////////////
    public void removeDrug(int id) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < capacity; j++) {
                if (drugs[i][j] != null && drugs[i][j].getId() == id) {
                    drugs[i][j] = null;
                    System.out.println("Drug with ID " + id + " is removed ");
                    return;
                }
            }
        }
        System.out.println("Drug with ID " + id + " not ava ");
    }
//////////////////////////////////////////////order///////////////////////////////////////////////////
    public void placeOrder(int id) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < capacity; j++) {
                if (drugs[i][j] != null && drugs[i][j].getId() == id) {
                    Drug drug = drugs[i][j];
                    System.out.println("Drug exists :");
                    System.out.println("Name: " + drug.getName());
                    System.out.println("Price: " + drug.getPrice());
                    if (drug.isPrescriptionRequired()) {
                        System.out.println("Prescription required");
                    } else {
                        System.out.println("No prescription needed");
                    }
                    if (drug.getCategory().equalsIgnoreCase("cosmetics")) {//what is the diff bet == && .equalsIgnoreCase
                        double price = drug.getPrice() * 1.2;
                        System.out.println("Cosmetic price: " + price);
                    }
                    return;
                }
            }
        }
        System.out.println("Drug with ID " + id + " not found.");
    }

    public void calculateTotalSales(double price, int quantity) {
        totalSales += price * quantity;
    }

    public double getTotalSales() {
        return totalSales;
    }
}