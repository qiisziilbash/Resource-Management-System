package businesslogic.report;

import java.io.Serializable;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.distribution.resource.Resource;
import businesslogic.distribution.resource.ResourceDAO;
import businesslogic.distribution.resource.ResourceStateEnum;
import businesslogic.utility.Date;
import businesslogic.utility.Table;

/**
 * Created by Esi on 6/23/2016.
 */
public class ResourceReport extends Report implements Serializable {
    public ResourceReport() {
        super();
    }

    public ResourceReport(Date date) {
        super(date);
    }

    @Override
    public Table makeReport() throws PersistentException {
        PersistentSession session = OODPersistentManager.instance().getSession();
        List<Object[]> result = session
                .createSQLQuery("SELECT ID2, Discriminator, UniqueIdentifier, Name2 FROM Resource").list();

        String[] headers = new String[]{"Type", "Unique Identifier", "Name", "State"};
        String[][] contents = new String[result.size()][headers.length];
        for(int i = 0 ; i < result.size(); i++) {
            Object[] row = result.get(i);

            String[] tableRow = new String[headers.length];

            tableRow[0] = (String)row[1];
            tableRow[1] = (String)row[2];
            tableRow[2] = (String)row[3];

            Resource resource = ResourceDAO.getResourceByORMID((int) row[0]);
            ResourceDAO.fetchResourceState(resource);
            tableRow[3] = (ResourceStateEnum.values()[resource.getResourceState()]).toString();

            contents[i] = tableRow;

        }

        Table table = new Table();
        table.setContents(contents);
        table.setHeaders(headers);
        setTable(table);
        return table;
    }


}
