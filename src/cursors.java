
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
public class cursors {
       
    public StringBuffer skip_limit_transform(StringBuffer st, List<String> s){
        
        int ind1 = s.indexOf("SKIP");
        int ind2 = s.indexOf("LIMIT");
        st.append(".skip(");
        st.append(s.get(ind1+1));
        st.append(").limit(");
        st.append(s.get(ind2+1));
        st.append(")");
        return st;
    }
    public StringBuffer skip_transform(StringBuffer st, List<String> s){
        
        int ind1 = s.indexOf("SKIP");
        st.append(".skip(");
        st.append(s.get(ind1+1)); 
        st.append(")");        
        return st;
    }    
    
    public StringBuffer limit_transform(StringBuffer st, List<String> s){

        int ind2 = s.indexOf("LIMIT");
        st.append(".limit(");
        st.append(s.get(ind2+1)); 
        st.append(")");        
        return st;        
    }    
    
    
}
