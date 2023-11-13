
package saxconbook;

import java.io.File;

public class SaxConBOOk {

    public static void main(String[] args) {
      File f=new File("books.xml");
        AccesoXMLSAX a =new AccesoXMLSAX();
        a.parsearXMLconLibrosSAXhandler(f);
}
    }
    

