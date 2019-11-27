package businesslogic.utility;

import java.io.Serializable;

/**
 * Created by Esi on 6/23/2016.
 */
public class Table implements Serializable {


    private String[] headers;
    private String[][] contents;

    public Table(){

    }


    public String[] getHeaders() {
        return headers;
    }

    public String[][] getContents() {
        return contents;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public void setContents(String[][] contents) {
        this.contents = contents;
    }

    public void print() {
        for(String h:getHeaders()) {
            System.out.print(h + ", ");
        }

        for(String[] row:getContents()) {
            System.out.println();
            for(String i:row) {
                System.out.print(i + ", ");
            }
        }
    }
}
