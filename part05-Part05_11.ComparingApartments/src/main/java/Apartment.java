
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return compared.squares < this.squares;
    }
    
    public int priceDifference(Apartment compared) {
        int comparedPrice = compared.squares * compared.princePerSquare;
        int apartmentPrice = this.squares * this.princePerSquare;
        if (comparedPrice > apartmentPrice) {
            return comparedPrice - apartmentPrice;
        }
        return apartmentPrice - comparedPrice;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.squares * this.princePerSquare) > (compared.squares * compared.princePerSquare);
    }

}
