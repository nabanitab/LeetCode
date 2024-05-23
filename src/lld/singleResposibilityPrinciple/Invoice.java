package lld.singleResposibilityPrinciple;



public class Invoice {

    private Marker marker;
    private  int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    //This is not following single reason to change as class can change for all three methods in it.
    //ie, if gst and discount came while calculating price than our class will be changed

    //so instead of writing all the method in a class we can sift to another class
    public   int calculateTotal(){
        int price = ((marker.price)*this.quantity);
        return price;
    }

    //if we save the data into the file instead of DB than change
    //  public void saveToDB(){

    // }

    //if we change printing logic than also class change
    //  public void printInvoice(){

    // }
}

