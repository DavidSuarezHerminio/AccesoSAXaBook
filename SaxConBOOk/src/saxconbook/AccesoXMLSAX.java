
package saxconbook;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class AccesoXMLSAX {
   
SAXParser parser;
public int parsearXMLconLibrosSAXhandler(File f){ // representa el archivo xml
try{
SAXParserFactory factory=SAXParserFactory.newInstance(); //se hace para crear una instancia 
parser=factory.newSAXParser(); //se crea instancia de saxparser
BookSAXhandler sh=new BookSAXhandler(); //se crea sh del manejadr personalizado
parser.parse(f, sh); //se analiza el file f, si todo va bien devolvera un 0 sino un -1
return 0;
}catch(Exception e){
e.printStackTrace();
return -1;
        }
    }
}

