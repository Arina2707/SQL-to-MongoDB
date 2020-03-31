/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arina27
 */
import java.util.List;

public class variant4 extends variant {
    
    public StringBuffer transform(List<String> st){
        res.append("db.");
        int pos = st.indexOf("FROM");
        res.append(st.get(pos+1));
        res.append(".find({}, {");
        transform_projection(st);
        checking_cursors(st);        
        return res;
    } 
    public void transform_projection(List<String> s1){
       for (int j=1; j<=s1.indexOf("FROM"); j++){
              if (s1.get(j).equals("FROM")){
                  res.append("})");
                  break;
              } else if (j==1){
                 res.append(s1.get(j));
                 res.append(": 1");
              } else{
                  res.append(", ");
                  res.append(s1.get(j));
                  res.append(": 1");
              }
        }         
    }    
    
}
