/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.bean;

import bean.entidad.Cuenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface CuentaFacadeLocal {

    void create(Cuenta cuenta);

    void edit(Cuenta cuenta);

    void remove(Cuenta cuenta);

    Cuenta find(Object id);

    List<Cuenta> findAll();

    List<Cuenta> findRange(int[] range);

    int count();
    
}
