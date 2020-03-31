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
public class variant3 extends variant {
    

    public StringBuffer transform(List<String> st){
        res.append("db.");
        int pos = st.indexOf("FROM");
        res.append(st.get(pos+1));
        res.append(".find({");
        transform_where(st);
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
    
    public void transform_where(List<String> s2){
        int pos1 = s2.indexOf("WHERE");
        
        res.append(s2.get( pos1+1));
        res.append(": {$");
        
        if (s2.get(pos1+2).equals(">")){
            res.append("gt: ");
            res.append(s2.get(pos1+3));
            res.append("}}, {");
        } else if (s2.get(pos1+2).equals("<")){
            res.append("lt: ");
            res.append(s2.get(pos1+3));
            res.append("}}, {");   
        } else if (s2.get(pos1+2).equals("=")){
            res.append("eq: ");
            res.append(s2.get(pos1+3));
            res.append("}}, {");   
        }else if(s2.get(pos1+2).equals("<>")){
            res.append("ne: ");
            res.append(s2.get(pos1+3));
            res.append("}}, {");   
        } else{
            System.out.println("Not such operand for now!");
        }        
    }
    
}
