/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetemplate;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CompareTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Chanh", 100, 2));
        list.add(new Product("Xoài", 200, 2));
        list.add(new Product("Táo", 50, 2));
        
        SortProductByName sortProductByName = new SortProductByName();
        list.add(new Product("a", 4000, 10));
        SortProductByPrice sortProductByPrice = new SortProductByPrice();
        
        sortProductByName.sort(list);
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        System.out.println("");
        
        sortProductByPrice.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        
        System.out.println("");
        sortProductByName.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        
        //a xuất hiện trước vì ascii của a lớn hơn ký tự hoa
    }
    
}
