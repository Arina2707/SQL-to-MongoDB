
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arina27
 */
public class variant_choice {
    
    public String answer; 
    public String[] words;
    public List<String> my_list;
    StringBuffer result = new StringBuffer();

    variant_choice(String ans) {
        this.answer = ans.replaceAll(",", "");
        this.words = answer.split(" ");
        this.my_list = Arrays.asList(words);           
    }
    
    public String handle_variant(){
        
         if (my_list.contains("*") && (!my_list.contains("WHERE"))){

            variant1 var1 = new variant1();
            result=var1.transform(my_list);

        } else if (my_list.contains("*") && my_list.contains("WHERE")){

            variant2 var2 = new variant2();
            result=var2.transform(my_list);

        } else if (my_list.contains("WHERE")){

            variant3 var3 = new variant3();
            result=var3.transform(my_list);

        } else{
            variant4 var4 = new variant4();
            result=var4.transform(my_list);
        }       
        return result.toString();
    }
    
}
