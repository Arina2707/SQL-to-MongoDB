
import java.util.List;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arina27
 */
public class variant2 extends variant {
      
    public StringBuffer transform(List<String> st){
        res.append("db.");
        res.append(st.get(3));
        res.append(".find({");
        res.append(st.get(5));
        res.append(": {");
        check_and_where(st);

        checking_cursors(st);
        return res;
    }
    public void transform_where(List<String> s){
        if (s.get(6).equals(">")){
            res.append("$gt: ");
            res.append(s.get(7));
            res.append("}})");
        } else if (s.get(6).equals("<")){
            res.append("$lt: ");
            res.append(s.get(7));
            res.append("}})");   
        } else if (s.get(6).equals("=")){
            res.append("$eq: ");
            res.append(s.get(7));
            res.append("}})");   
        }else if(s.get(6).equals("<>")){
            res.append("$ne: ");
            res.append(s.get(7));
            res.append("}})");   
        }
       
    }
    
    
    public void transform_where_several(List<String> s, int p){
        
        int pos = p;
        
        if (pos!=s.indexOf("WHERE")+1){
            res.append("}, ");            
            res.append(s.get(pos));
            res.append(": {");
        }
        if (s.get(pos+1).equals(">")){
            res.append("$gt: ");
            res.append(s.get(pos+2));
        } else if (s.get(pos+1).equals("<")){
            res.append("$lt: ");
            res.append(s.get(pos+2));   
        } else if (s.get(pos+1).equals("=")){
            res.append("$eq: ");
            res.append(s.get(pos+2));  
        }else if(s.get(pos+1).equals("<>")){
            res.append("$ne: ");
            res.append(s.get(pos+2)); 
        } 
        
        if (pos+2==(s.size()-1)){
            res.append("}})");
        }
    }
    
    public void check_and_where (List<String> s){
       int occurrences = Collections.frequency(s, "AND");
       int p = s.indexOf("WHERE")+1;
       if (occurrences==0){
           transform_where(s);
       } else {
           for (int j=0; j<(occurrences+1); j++){
              transform_where_several(s, p); 
              p=p+4;
           }
       }
    }
}
