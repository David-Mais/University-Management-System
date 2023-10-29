package com.davidmaisuradze.ums.service.impl;

import com.davidmaisuradze.ums.entity.HeadOfDepartment;
import com.davidmaisuradze.ums.repository.HeadOfDepartmentRepository;
import com.davidmaisuradze.ums.service.HeadOfDepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadOfDepartmentServiceImpl implements HeadOfDepartmentService {
    private HeadOfDepartmentRepository headOfDepartmentRepository;

    public HeadOfDepartmentServiceImpl(HeadOfDepartmentRepository headOfDepartmentRepository) {
        this.headOfDepartmentRepository = headOfDepartmentRepository;
    }

    @Override
    public List<HeadOfDepartment> getAllHeadOfDepartment() {
        return headOfDepartmentRepository.findAll();
    }

    @Override
    public HeadOfDepartment getHeadOfDepartmentById(int id) {
        return headOfDepartmentRepository.findById(id).get();
    }
}
