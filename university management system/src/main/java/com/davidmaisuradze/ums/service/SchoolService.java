package com.davidmaisuradze.ums.service;

import com.davidmaisuradze.ums.entity.School;

import java.util.List;

public interface SchoolService {
    List<School> getAllSchool();
    School getSchoolById(int id);
}
