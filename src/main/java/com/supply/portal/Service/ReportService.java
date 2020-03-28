package com.supply.portal.Service;

import com.supply.portal.model.MasterReport;
import com.supply.portal.model.Report;

import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
public interface ReportService {

    public List<Report> getAllReports();

    public List<MasterReport> getMasterReport();
}
