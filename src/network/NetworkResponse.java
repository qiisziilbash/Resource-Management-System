package network;

import java.io.Serializable;

/**
 * Created by Esi on 6/25/2016.
 */
public class NetworkResponse implements Serializable {
    public String getMessage() {
        return message;
    }

    private String message;
    private Serializable response;

    public NetworkResponse(Serializable response, String message) {
        this.message = message;
        this.response = response;
    }

    public Serializable getResponse() {
        return response;
    }
}
