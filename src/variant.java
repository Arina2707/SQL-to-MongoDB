
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arina27
 */
public class variant {
    
    public StringBuffer res;
  
    variant(){  
        res = new StringBuffer();  
    }
  
    public void checking_cursors(List<String> s){
        
        cursors cur = new cursors();        
        
        if (s.contains("SKIP") && s.contains("LIMIT")){
            res=cur.skip_limit_transform(res, s);
        } else if (s.contains("SKIP")){
            res=cur.skip_transform(res, s);    
        } else if (s.contains("LIMIT")){
            res=cur.limit_transform(res, s);
        }   
    }

  
}
