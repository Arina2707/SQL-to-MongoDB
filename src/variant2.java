
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
public class variant2 extends variant {
      
    public StringBuffer transform(List<String> st){
        res.append("db.");
        res.append(st.get(3));
        res.append(".find({");
        res.append(st.get(5));
        res.append(": {$");
        transform_where(st);
        checking_cursors(st);
        return res;
    }
    public void transform_where(List<String> s){
        if (s.get(6).equals(">")){
            res.append("gt: ");
            res.append(s.get(7));
            res.append("}})");
        } else if (s.get(6).equals("<")){
            res.append("lt: ");
            res.append(s.get(7));
            res.append("}})");   
        } else if (s.get(6).equals("=")){
            res.append("eq: ");
            res.append(s.get(7));
            res.append("}})");   
        }else if(s.get(6).equals("<>")){
            res.append("ne: ");
            res.append(s.get(7));
            res.append("}})");   
        }
       
    }
}
