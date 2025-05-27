import java.util.Scanner;

public class Objective4Lab1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your first name?");
        String fname = keyboard.nextLine();
        
        System.out.println("What is your last name?");
        String lname = keyboard.nextLine();
        
        System.out.println("What is your favorite animal?");
        String favoriteAnimal = keyboard.nextLine();
        
        System.out.println("What is your favorite food?");
        String favoriteFood = keyboard.nextLine();
        
        System.out.println("What is your favorite song?");
        String favoriteSong = keyboard.nextLine();
        
        
        String defaultFname = "Brian";
        String defaultLname = "Haptonstall";
        String defaultFavoriteAnimal = "Dog";
        String defaultFavoriteFood = "Steak";
        String defaultFavoriteSong = "Free";
        
        
        System.out.println("First Name: " + (fname.isEmpty() ? defaultFname : fname));
        System.out.println("Last Name: " + (lname.isEmpty() ? defaultLname : lname));
        System.out.println("Favorite Animal: " + (favoriteAnimal.isEmpty() ? defaultFavoriteAnimal : favoriteAnimal));
        System.out.println("Favorite Food: " + (favoriteFood.isEmpty() ? defaultFavoriteFood : favoriteFood));
        System.out.println("Favorite Song: " + (favoriteSong.isEmpty() ? defaultFavoriteSong : favoriteSong));
    }
}
    


