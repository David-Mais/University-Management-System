package com.davidmaisuradze.ums.service;

import com.davidmaisuradze.ums.entity.HeadOfDepartment;

import java.util.List;

public interface HeadOfDepartmentService {
    List<HeadOfDepartment> getAllHeadOfDepartment();
    HeadOfDepartment getHeadOfDepartmentById(int id);
}
