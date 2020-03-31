/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Arina27
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the SELECT query: ");
            String answer = in.nextLine();
            variant_choice new_var = new variant_choice(answer);
            System.out.println(new_var.handle_variant());

                    
    }
    
}
