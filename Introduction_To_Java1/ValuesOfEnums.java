
/*Write a program to display values of enums using a constructor & getPrice() method
(Example display house & their prices)
*/
public class ValuesOfEnums
{
    public static void main(String[] args) {
        System.out.println("Display values of enums using a constructor & getPrice()");
        for (House h : House.values()) {
            System.out.println(h + " costs $" + h.getPrice());
    }

}
}
enum House {
    H1(600000),H2(1255000),H3(500000),H4(1500000),H5(1250000);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
