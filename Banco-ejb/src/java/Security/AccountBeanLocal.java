/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Security;

import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface AccountBeanLocal {

    void deposit(int acno, double amount);

    void close(int acno);

    double getBalance(int acno);
    
}
