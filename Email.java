/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author issamalzouby
 */
public class Email {
    
    private String firstName; 
    private String lastName; 
    private String password; 
    private String email;
    private int defaultPasswordLength = 10; 
    private String department;
    private int mailboxCapacity = 500; 
    private String alternateEmail; 
    private String companySuffix = "iRepairCLT.com";
    
    //making these private is good practice , that may no un authorized users can access/modify these values. 
    
    //Create constructor to receive firtst and last name
    
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created" + " " + this.firstName + " " + this.lastName);
        
        
        //Call method asking for depatment and return it
        this.department = setDepartment(); 
        //System.out.println("Your department is: " + " " + this.department);
        
        //call method returning a random password
        this.password = randomPassword(10); 
        System.out.println("Your password is " + this.password);
        
        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
       // System.out.println("Your email is " + email);
    }
    
    //Ask for departnment 
    private String setDepartment(){
        System.out.println("Enter the department \n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1 ){return "Sales";}
        else if (depChoice == 2 ) {return "Development";}
        else if (depChoice == 3 ) {return "Accounting";}
        else{return "";}
        
    }
    
    //generate random password 
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
        char[] password = new char[length]; 
        for(int i = 0; i < length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    //set mailbox capacity
    public void setMailbocCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    
    // set the alternate email 
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail; 
    }
    
    //Change the passsword
    public void changePassword(String password) {
        this.password = password;
    }
    
    
    public int getMailboxCapacity(){
        return mailboxCapacity; 
    }
    
    public String getAlternateEmail(){
        return alternateEmail; 
    }
    
    public String getPassword (){ 
        return password; 
    }
    
    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName +  "\nCompany Email: " + email + "\nMailbox Capacity: " + mailboxCapacity; 
    }
}
