
package biometria;

import interfaz.PantallaPrincipal;
import java.io.File;
import procedimiento.Util;


public class Biometria {

   
    public static void main(String[] args) {
        String grFingerNativeDirectory = new File(".").getAbsolutePath();
            Util.setFingerprintSDKNativeDirectory(grFingerNativeDirectory);

            PantallaPrincipal p = new PantallaPrincipal();
    }
}
