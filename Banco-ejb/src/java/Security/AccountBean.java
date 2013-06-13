/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Security;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

/**
 *
 * @author usuario
 */
@Stateless
@DeclareRoles({"admin","users","guest"})
public class AccountBean implements AccountBeanLocal {

  // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")    
    
    private double a;
    
    @RolesAllowed("users")
    @Override
    public void deposit(int acno, double amount) {
    
        a=a+amount;
        System.out.println("Deposito de $"+ a + "en la cuenta Nro "+acno);
    }

  
    @RolesAllowed("admin")
    @Override
    public void close(int acno) {
        a=0.0;
         System.out.println("La cuenta Nro " + acno + "ha sido cerrada y "
                 + "el valor del saldo es $"+a);
    }

    @PermitAll
    @Override
    public double getBalance(int acno) {
        System.out.println("Saldo para la cuenta Nro " + acno);
        return a;
    }
    

}
