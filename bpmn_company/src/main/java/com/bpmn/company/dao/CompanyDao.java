package com.bpmn.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bpmn.company.entity.Company;

public interface CompanyDao extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {
}
