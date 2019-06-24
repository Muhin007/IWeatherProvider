package com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherAdaptorApixu {

    public int getTempFromApixu(String cityName) {
        String uri = "http://api.apixu.com/v1/current.xml?key=d85bbc64aab34428894192757192306&q=" + cityName;

        String output = getString(uri);
        return Integer.parseInt(output.split("<temp_c>")[1].split("</temp_c>")[0]);
    }

    public String getString(String uri) {
        URL url = null;
        try {
            url = new URL(uri);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = null;
        try {
            assert db != null;
            assert url != null;
            doc = db.parse(url.openStream());
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = tf.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        assert transformer != null;
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter writer = new StringWriter();
        try {
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return writer.getBuffer().toString().replaceAll("[\n\r]", "");
    }
}
