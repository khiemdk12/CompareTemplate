/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetemplate;

/**
 *
 * @author DELL
 */
public class SortProductByName extends SortCollection<Product>{

    @Override
    protected int compare(Product t1, Product t2) {
        String s1 = t1.getName();
        String s2 = t2.getName();
        int lmin = Math.min(s1.length(), s2.length());
        
        for (int i = 0; i < lmin; i++){
            if (s1.charAt(i) > s2.charAt(i)) return 1;
            else if (s1.charAt(i) < s2.charAt(i)) return -1;
        }
        
        if (s1.length() > s2.length()) return 1; else 
            if (s1.length() == s2.length()) return 0; else return -1;
    }
    
}
