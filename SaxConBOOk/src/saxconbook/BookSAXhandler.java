
package saxconbook;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

public class BookSAXhandler extends DefaultHandler{
    @Override
public void startElement(String uri,String localName,String qName,Attributes //el metodo es de la clase bookSAXhandler
atts) throws SAXException{
//el metodo se ejecuta cuando sax abre el xml en el analisis

if(qName.equals("book")){
System.out.print("\n"+"El id es: "+atts.getValue(atts.getQName(0)));//extrae));
}else if(qName.equals("author")){
System.out.print("\n "+"El author es: ");
}else if(qName.equals("title")){
System.out.print("\n"+"El title es: ");//aún no sabemos cúal es el título, eso lo sabremos en el evento characters
}else if(qName.equals("genre")){
System.out.print("\n "+"genre es: ");
}else if(qName.equals("price")){
System.out.print("\n "+"El price es: ");
}else if(qName.equals("publish_date")){
System.out.println("\n "+"Publicado en: ");
}else if(qName.equals("descripcion")){
System.out.print("\n "+"La descripcion es: ");
    }
}
@Override
public void endElement(String uri, String localName,String qName) throws
SAXException{

if(qName.equals("book")){
    System.out.println("\n-----------------------");
    }
}
@Override
public void characters(char[] ch, int start, int length) throws
SAXException{

String car=new String(ch,start,length);
car=car.replaceAll("\t", "");//quita todos los tabuladores
car=car.replaceAll("\n", "");
System.out.print(car); }    

}

