package com.mycompany.q3;

/**
 *
 * @author ADMIN
 */
public class Q3 {
    public static void main(String[] args) {
        
       Rifle r1 = new Rifle ("m4",3,4);
       Rifle r2 = new Rifle ("AK",5,5);
       suppressed_rifle r3 = new suppressed_rifle ("Scar",3,4,"Gemtech");
       suppressed_rifle r4 = new suppressed_rifle ("M16",3,4,"Barrett");
       
       r1.hit();
       r3.hit();
       System.out.print("\r\n");
       
       Rifle r5 = new Rifle ("AK",100,5);       
       r5.print_data();
       System.out.print("\r\n");       
       
       System.out.print("\r\n");       
       r1.print_data();
       System.out.print("\r\n");
       r2.print_data();
       System.out.print("\r\n");
       r3.print_data();
       System.out.print("\r\n");
       r4.print_data();
       System.out.print("\r\n");
       System.out.print("\r\n");
       
       r1.set_damage(100);
       r1.set_speed(5);
       r1.print_data();
       System.out.print("\r\n");      
       System.out.print("\r\n");

       r3.increase_damage();
       r3.print_data();

       
    }
}
