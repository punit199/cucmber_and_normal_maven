package testscripts;

import java.io.FileInputStream;
import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Examp1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fil = new FileInputStream("./resource/data.xml");
		SAXReader sax = new SAXReader();
		Document doc =sax.read(fil);
		Node myName = doc.selectSingleNode("//meanu/name");
		System.out.println(myName.getText());
         
	}

}
