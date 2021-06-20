/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rread.writefile;
import java.io.File ;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Mohamed Ahmed
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            PyramidCSVDAO pDAo= new PyramidCSVDAO();
            List<Pyramid> pyramids = pDAo.readPyramidFromCSV("H:\\ITI\\Java\\Assignment\\pyramids.csv");
            pyramids.sort(Comparator.comparing(Pyramid::getHeight).reversed());
            int i=0 ;
            for(Pyramid p:pyramids){
                System.out.println("#"+(i++)+p);
            }
            
            
    }
//    public double median (List<Pyramid> p){
//        List<Integer> h= p.stream().filter(l -> l.getHeight()>0)
//                .map(p::getHeight)
//                .collect(toList());
//    }
    
}
