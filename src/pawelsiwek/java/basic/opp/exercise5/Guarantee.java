package pawelsiwek.java.basic.opp.exercise5;

public class Guarantee {
    Product[] product;
    int validUntil;

    public Guarantee(Product[] product, int validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public boolean isValid (){
        for (int i=0; i<product.length; i++)
        if (this.validUntil > 2018)
        return true;
        else {
            return false;
            this.product[i] = null;
        }
        return false;
}
public static void main (String[] arg){

}
}
