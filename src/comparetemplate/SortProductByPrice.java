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
public class SortProductByPrice extends SortCollection<Product>{

    @Override
    protected int compare(Product t1, Product t2) {
        int d1 = t1.getPrice();
        int d2 = t2.getPrice();
        
        if (d1 > d2) return 1;
        else if (d1 == d2) return 0;
            else return -1;
    }
    
}
