package ejercicio11;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class EscribirXML {

	public static void main(String[] args) {
		List <Persona> lista = new ArrayList<>();
		lista.add(new Persona("Juan", "Paseo Independencia", "600000000"));
		lista.add(new Persona("Pedro", "Callejon Diagon", "600000001"));
		lista.add(new Persona("Paco", "Avenida Andalucia", "600000002"));
		
		try {
//			Creamos el documento XML
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document documento = db.newDocument();
			
//			Creamos el elemento raíz <contactos>
			Element personas = documento.createElement("personas");
			documento.appendChild(personas);
			
//			Añadimos cada contacto de la lista al XML
			for (Persona persona : lista) {
				
//				Creamos la etiqueta <persona>
				Element personaElemento = documento.createElement("persona");
				
//				Creamos la subetiqueta <nombre>
				Element nombre = documento.createElement("nombre");
				nombre.appendChild(documento.createTextNode(persona.getNombre()));
				
//				Creamos la subetiqueta <dirección>
				Element direccion = documento.createElement("direccion");
				direccion.appendChild(documento.createTextNode(persona.getDireccion()));
				
//				Creamos la subetiqueta <telefono>
				Element telefono = documento.createElement("telefono");
				telefono.appendChild(documento.createTextNode(persona.getTelefono()));

//				Añadimos las 3 etiquetas hijas a la etiqueta padre
				personaElemento.appendChild(nombre);
				personaElemento.appendChild(direccion);
				personaElemento.appendChild(telefono);

//				Y la etiqueta padre a la etiqueta raíz
				personas.appendChild(personaElemento);
				
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(documento);
			StreamResult resultado = new StreamResult(new File("contactos.xml"));
			
		} catch (ParserConfigurationException | TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
