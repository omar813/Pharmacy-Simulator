import java.util.ArrayList;

public class Drug {
    String name;
    int id;
    int price;
    String category;
    int ava_quan;
    boolean prescriptionRequired =true;

        public Drug(String name,int id,int price,String category,int ava_quan){
            this.name=name;
            this.id=id;
            this.price=price;
            this.category=category;
            this.ava_quan=ava_quan;
        }

    public String getName() {
        return name;
    }
    public int getId(){
            return id;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    public int getAva_quan() {
        return ava_quan;
    }
    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }
}



