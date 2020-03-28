package com.supply.portal.ServiceImpl;

import com.supply.portal.model.MasterReport;
import com.supply.portal.Repository.ReportRepository;
import com.supply.portal.Service.ReportService;
import com.supply.portal.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
public class ReportServiceImpl implements ReportService {

    @Autowired
    ReportRepository reportRepository;


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Report> getAllReports() {
        return reportRepository.getAllReport();
    }

    @Override
    public List<MasterReport> getMasterReport() {
        String query = "select s.name as state_name, h.name as hospital_name, c.name as category_name, i.name as item_name, i.unit as unit_name, r.supply_request_quantity as supply, sum(o.delivered_quantity) as total, sum(o.delivered_quantity) - r.supply_request_quantity as Remining  from states s, hospitals h, categories c, items i, reports r, outbounds o where s.id = o.state_id and h.id = o.hospital_id and c.id = o.category_id and i.id = o.item_id";
        List<MasterReport> reports = entityManager.createNativeQuery(query).getResultList();
        List<MasterReport> reportsRecords = new ArrayList<MasterReport>();
        Iterator iterator = reports.iterator();

        while (iterator.hasNext()){
            Object[] result = (Object[])iterator.next();
            reportsRecords.add(new MasterReport(result[0].toString(), result[1].toString(), result[2].toString(), result[3].toString(), result[4].toString(), result[5], result[6], result[7]));
        }

        return reports;
    }


}
