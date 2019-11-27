package businesslogic.report;

import java.io.Serializable;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.distribution.requirement.RequirementPriorityEnum;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.InformationResourceDAO;
import businesslogic.utility.Date;
import businesslogic.utility.Table;

/**
 * Created by Esi on 6/23/2016.
 */
public class ResourceRequirementReport  extends Report implements Serializable {
    private InformationResource informationResource;
    public ResourceRequirementReport(int informationResourceID) throws PersistentException{
        super();
        informationResource = InformationResourceDAO.getInformationResourceByORMID(informationResourceID);
    }

    public ResourceRequirementReport(Date date, int informationResourceID) throws PersistentException{
        super(date);
        informationResource = InformationResourceDAO.getInformationResourceByORMID(informationResourceID);
    }

    @Override
    public Table makeReport() throws PersistentException{
        PersistentSession session = OODPersistentManager.instance().getSession();


        List<Object[]> result = session
                .createSQLQuery("SELECT ResourceName, Quantity, StartDate, EndDate, RequirementPriority FROM Requirement").list();

        String[] headers = new String[]{"Resource", "Quantity", "StartDate", "EndDate", "RequirementPriority"};
        String[][] contents = new String[result.size()][headers.length];
        for(int i = 0 ; i < result.size(); i++) {
            Object[] row = result.get(i);

            String[] tableRow = new String[headers.length];

            tableRow[0] = (String)row[0];
            tableRow[1] = ""+row[1];
            tableRow[2] = (String)row[2];
            tableRow[3] = (String)row[3];
            tableRow[4] = (RequirementPriorityEnum.values()[(int)row[4]]).toString();

            contents[i] = tableRow;

        }

        Table table = new Table();
        table.setContents(contents);
        table.setHeaders(headers);
        setTable(table);
        return table;

    }
}
