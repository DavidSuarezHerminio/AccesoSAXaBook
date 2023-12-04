
package saxconbook;

import java.io.File;

public class SaxConBOOk {

    public static void main(String[] args) {
      File f=new File("books.xml");//el archivo sera books.xml
        AccesoXMLSAX a =new AccesoXMLSAX(); //esto hace ub objeto de la clase AccessoXMLSAX que es la clase que se encarga de realizar el analisis SAX
        a.parsearXMLconLibrosSAXhandler(f); //esto es para representar el file f en la clase accessoXMLSAX
}
    }
    

