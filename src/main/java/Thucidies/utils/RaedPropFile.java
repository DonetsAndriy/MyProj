package Thucidies.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Andrew on 10/14/2015.
 */
public class RaedPropFile {
    String result = "";
    InputStream inputStream;

    public static String PropValue (String Name)throws IOException {
        RaedPropFile properties = new RaedPropFile();
        String PropValue=properties.getPropValues(Name);
        return PropValue;
    }

    public String getPropValues(String PropName) throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            Date time = new Date(System.currentTimeMillis());

            // get the property value and print it out
            String PropName1 = prop.getProperty(PropName);

            result = PropName1;
            // System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }
}