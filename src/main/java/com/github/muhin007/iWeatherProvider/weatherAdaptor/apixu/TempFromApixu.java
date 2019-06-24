package com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu;

import com.github.muhin007.iWeatherProvider.weatherAgregator.WeatherAggregator;
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

public class TempFromApixu {
    private String cityName = WeatherAggregator.cityName;
    String uri = "http://api.apixu.com/v1/current.xml?key=d85bbc64aab34428894192757192306&q=" + cityName;
    private int tempFromApixu = 0;

    public int getTempFromApixu() {
        try {
            parsingTempFromApixu();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        return getTempFromApixu();
    }

    private void parsingTempFromApixu() throws TransformerConfigurationException {

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
            doc = db.parse(url.openStream());
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter writer = new StringWriter();
        try {
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        String output = writer.getBuffer().toString().replaceAll("\n|\r", "");
        tempFromApixu = Integer.parseInt(output.split("<temp_c>")[1].split("</temp_c>")[0]);
    }
}
