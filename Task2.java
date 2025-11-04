public class Task2{
    public static void main(String[] args) {
        double originalPrice = 250;
        double discountPercent = 15.0;

        
        double discountAmount = (discountPercent / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;

       
        System.out.println("Original Price:" + originalPrice);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
    }
}