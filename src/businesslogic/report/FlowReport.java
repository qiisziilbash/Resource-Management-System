package businesslogic.report;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.distribution.Allocation_DAO;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.InformationResourceDAO;
import businesslogic.distribution.resource.Resource;
import businesslogic.utility.Date;
import businesslogic.utility.Table;

/**
 * Created by Esi on 6/23/2016.
 */
public class FlowReport  extends Report implements Serializable {
    private Resource resource;
    private Date startDate;
    private Date endDate;

    public FlowReport(Resource resource, Date startDate, Date endDate) {
        super();
        this.resource = resource;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public FlowReport(Resource resource, Date startDate, Date endDate, Date date) {
        super(date);
        this.resource = resource;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public Table makeReport() throws PersistentException{
        PersistentSession session = OODPersistentManager.instance().getSession();

        //Can be done easier with join
        List<Integer> allocationIDs = session
                .createSQLQuery("SELECT [Allocation ID] FROM ResourceAllocation WHERE ResourceID2 = " + resource.getID()).list();

        String[] headers = new String[]{"Information Resource Name", "Start Date", "End Date"};

        ArrayList<String[]> contentsList = new ArrayList<>();
        for(Integer allocationID:allocationIDs) {
            Requirement requirement= Allocation_DAO.getAllocation_ByORMID(allocationID).getRequirement();

            DateFormat df = new SimpleDateFormat("dd/mm/yy");

            java.util.Date reqStartDate = null;
            java.util.Date reqEndDate = null;
            java.util.Date startDate = null;
            java.util.Date endDate = null;
            try {
                reqStartDate = df.parse(requirement.getStartDate());
                reqEndDate = df.parse(requirement.getEndDate());
                startDate = df.parse(getStartDate().toString());
                endDate = df.parse(getEndDate().toString());
            } catch (ParseException e) {
                return null;
            }

            if(reqStartDate.after(endDate) || reqEndDate.before(startDate)) {
                continue;
            }

            Integer informationResourceID = (Integer) session
                    .createSQLQuery("SELECT ResourceID2 FROM Requirement WHERE ID = "+ allocationID).uniqueResult();
            InformationResource informationResource = InformationResourceDAO.getInformationResourceByORMID(informationResourceID);

            String[] row = new String[headers.length];

            row[0] = informationResource.getName();
            row[1] = requirement.getStartDate();
            row[2] = requirement.getEndDate();

            contentsList.add(row);

        }

        String[][] contents = new String[contentsList.size()][headers.length];
        for(int i =0 ; i < contentsList.size();i++) {
            contents[i] = contentsList.get(i);
        }

        Table table = new Table();
        table.setContents(contents);
        table.setHeaders(headers);
        setTable(table);
        return table;
    }
}
