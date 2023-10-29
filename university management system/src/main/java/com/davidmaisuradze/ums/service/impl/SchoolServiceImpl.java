package com.davidmaisuradze.ums.service.impl;

import com.davidmaisuradze.ums.entity.School;
import com.davidmaisuradze.ums.repository.SchoolRepository;
import com.davidmaisuradze.ums.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    private SchoolRepository schoolRepository;
    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolById(int id) {
        return schoolRepository.findById(id).get();
    }
}
