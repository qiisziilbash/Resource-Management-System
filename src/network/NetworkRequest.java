package network;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Esi on 6/25/2016.
 */
public class NetworkRequest implements Serializable {

    private String method;
    private ArrayList<Serializable> params;

    public NetworkRequest(String method, ArrayList<Serializable> params) {
        this.method = method;
        this.params = params;
    }

    public String getMethod() {
        return method;
    }

    public ArrayList<Serializable> getParams() {
        return params;
    }
}
