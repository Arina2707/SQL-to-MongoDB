
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
public class variant1 extends variant {
       
    public StringBuffer transform(List<String> st){
        res.append("db.");
        res.append(st.get(3));
        res.append(".find({})");
        checking_cursors(st);
        return res;    
    }

}
