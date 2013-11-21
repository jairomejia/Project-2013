*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

/**
 *
 * @author tuza
 */
public class ControladorBaseDeDatosFactory {

    private static ControladorBaseDeDatos conLIS  = null;

    protected ControladorBaseDeDatosFactory(){}


    /**
    * @return The unique instance of this class.
    */
    public static ControladorBaseDeDatos instance(){
        if(conLIS == null)
            conLIS = new ControladorBaseDeDatos();

        return conLIS;
    }

    public static void close(){
        if(conLIS != null)
            conLIS.cerrar();
    }
}