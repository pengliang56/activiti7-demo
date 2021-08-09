package com.bpmn.company.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpmn.company.dao.CompanyDao;
import com.bpmn.company.entity.Company;
import com.ihrm.common.entity.IdWorker;

@Service
public class CompanyService {
  @Autowired
  private CompanyDao companyDao;

  @Autowired
  private IdWorker idWorker;

  /**
   * 添加企业
   *
   * @param company 企业信息
   */
  public Company add(Company company) {
    company.setId(idWorker.nextId() + "");
    company.setCreateTime(new Date());
    company.setState(1);    //启用
    company.setAuditState("0"); //待审核
    company.setBalance(0d);
    return companyDao.save(company);
  }

  public Company update(Company company) {
    return companyDao.save(company);
  }

  public Company findById(String id) {
    return companyDao.findById(id).get();
  }

  public void deleteById(String id) {
    companyDao.deleteById(id);
  }

  public List<Company> findAll() {
    return companyDao.findAll();
  }
}
