import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

class Multiplier{

    int multiply(int x, int y){
        return x*y;
    }

    int multiply(int x, int y, int z, int q){
        return multiply(x,y)*multiply(z,q);
    }

    double multiply(double x, double y){
        return x*y;
    }

    BigDecimal multiply(BigDecimal x, BigDecimal y){
        return x.multiply(y);
    }

}

class Adder{
    int add(int x, int y){
        return x+y;
    }

    BigDecimal add(BigDecimal x, BigDecimal y){
        return x.add(y);
    }
}

class Furniture{
    String name;
    int price;
    float vat;

    Furniture(int price, float vat, String name){
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    public int getPrice() {
        return price;
    }

    public float getPriceIncludingVat() {
        return price + vat*price;
    }
}

class Room{
    List<Furniture> furniture;
    float area;
    Room(float area, List<Furniture> furniture){
        this.area = area;
        this.furniture = furniture;
    }

    float getAllPricesWithVat(){
        int size = furniture.size();
        int i;
        float buffer = 0;
        for(i = 0; i < size; ++i){
            buffer += furniture.get(i).getPriceIncludingVat();
        }
        return buffer;
    }
}

class House{
    List<Room> rooms;
    static int roomSize = 0;

    void addRoom(Room r){
        roomSize++;
        rooms.add(r);
    }

    void addRooms(List<Room> newRooms){
        roomSize += newRooms.size();
        rooms.addAll(newRooms);
    }

    static int getRoomCount(){
        return roomSize;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}