/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rread.writefile;
import java.io.File ;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mohamed Ahmed
 */
public class PyramidCSVDAO {

    List<Pyramid> Pyramid;

    public PyramidCSVDAO() {
    }
    
    public List<Pyramid> readPyramidFromCSV(String fileName){
        
        this.Pyramid = new ArrayList<>();
        File f = new File(fileName);
        
        List<String> lines = new ArrayList<String>();
        
        try {
            lines = Files.readAllLines(f.toPath());
        } catch (Exception e) {
            System.out.println("An Erorr Occurred !");
        }
        for(int i = 1 ; i<lines.size();i++){
            String line = lines.get(i);
            String[] cells = line.split(",");
            Pyramid.add(createPyramid(cells));
//            for(int x=0 ; x<cells.length ; x++){
//                
//            }
        }   
        return Pyramid ; 
    }
    public Pyramid createPyramid (String[] cells){
        double h =  Double.parseDouble(cells[7]);
        Pyramid pyramid = new Pyramid(h,cells[2],cells[4],cells[0]);
        return pyramid; 
    }
    
    
    
}
