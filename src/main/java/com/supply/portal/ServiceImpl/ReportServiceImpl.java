package com.supply.portal.ServiceImpl;

import com.supply.portal.model.MasterReport;
import com.supply.portal.Repository.ReportRepository;
import com.supply.portal.Service.ReportService;
import com.supply.portal.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
public class ReportServiceImpl implements ReportService {

    @Autowired
    ReportRepository reportRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Report> getAllReports() {
        return reportRepository.getAllReport();
    }

    @Override
    public List<MasterReport> getMasterReport() {
        String query = "select state_name, hospital_name, category_name, item_name, item_unit, supply, sum(o.delivered_quantity) as total, Remining from master_report";

        return jdbcTemplate.query(query, (rs, rowNum) -> new MasterReport(
                rs.getString("state_name"),
                rs.getString("hospital_name"),
                rs.getString("category_name"),
                rs.getString("item_name"),
                rs.getString("item_unit"),
                rs.getInt("supply"),
                rs.getInt("total"),
                rs.getInt("Remining")
                )
        );
    }


}
