/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rread.writefile;

/**
 *
 * @author Mohamed Ahmed
 */
public class Pyramid {

    public Pyramid(double height, String modern_name, String pharaoh, String site) {
        this.height = height;
        this.modern_name = modern_name;
        this.pharaoh = pharaoh;
        this.site = site;
    }
    
    private double height ;
    private String modern_name ;
    private String pharaoh ;
    private String site ;

    @Override
    public String toString() {
        return "Pyramid{" + "height=" + height + ", modern_name=" + modern_name + ", pharaoh=" + pharaoh + ", site=" + site + '}';
    }

    public double getHeight() {
        return height;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getSite() {
        return site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
    
    
}
