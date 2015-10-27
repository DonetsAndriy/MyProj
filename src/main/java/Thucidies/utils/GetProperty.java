package Thucidies.utils;

import java.io.IOException;

/**
 * Created by adonets on 21.10.2015.
 */
public class GetProperty {
    public String PropValue (String f)throws IOException {
        RaedPropFile properties = new RaedPropFile();
        String PropValue=properties.getPropValues("userName");
        return PropValue;
    }
}
