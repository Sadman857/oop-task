

public class MidLab2 {
    public static void main(String args[]){

        String firstName = "Sadman";
        String lastName  = "Sami";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name :"+ fullName);
         
       
        String productName = "Samsung";
        String productID = " 2766";
        String productCode= productName + " " + productID;
        System.out.println("productCode : " + productCode);

        String email ="sadmansami857@gamil.com";
        String substring = email.substring(0,6);
        System.out.println("Username: "+ substring);

        
        String chatApp = "Hello!";
        System.out.println("number of characters:" + chatApp.length());


         String sentence="hello java";
         String upperCase = sentence.toUpperCase();
         String lowerCase = sentence.toLowerCase();
         System.out.println("Uppercase: " + upperCase);
         System.out.println("Lowercase: " + lowerCase);


         String word =" bikes ";
         String replacedString = word.replace("bikes","cars");
         System.out.println("replaced words :" + replacedString);
    
        }

    }
      
