/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emailapp;

/**
 *
 * @author issamalzouby
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Email em1 = new Email("Issam", "Alzouby");
        em1.setAlternateEmail("sam@iRepairCLT.com");
        //System.out.println(em1.getAlternateEmail());
        
        System.out.println(em1.showInfo());
    }
    
}
