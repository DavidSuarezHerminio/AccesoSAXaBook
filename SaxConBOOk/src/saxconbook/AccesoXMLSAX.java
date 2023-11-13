
package saxconbook;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class AccesoXMLSAX {
   
SAXParser parser;
public int parsearXMLconLibrosSAXhandler(File f){
try{
SAXParserFactory factory=SAXParserFactory.newInstance();
parser=factory.newSAXParser();
BookSAXhandler sh=new BookSAXhandler();
parser.parse(f, sh);
return 0;
}catch(Exception e){
e.printStackTrace();
return -1;
        }
    }
}

