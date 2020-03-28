package com.supply.portal.Repository;

import com.supply.portal.model.MasterReport;
import com.supply.portal.model.Report;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
public interface ReportRepository extends CrudRepository<Report, Long> {

    @Query(value = "select * from reports", nativeQuery = true)
    List<Report> getAllReport();

    @Query( value = "select new com.supply.portal.DTO.ReportDTO(s.name as state_name, h.name as hospital_name, c.name as category_name, i.name as item_name, i.unit as unit_name, r.supply_request_quantity as supply, sum(o.delivered_quantity), r.supply_request_quantity - sum(o.delivered_quantity) as Remining ) from states s, hospitals h, categories c, items i, reports r, outbounds o where s.id = o.state_id and h.id = o.hospital_id and c.id = o.category_id and i.id = o.item_id", nativeQuery = true)
    List<MasterReport> getMasterReport();
}
