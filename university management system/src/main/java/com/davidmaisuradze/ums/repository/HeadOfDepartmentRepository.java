package com.davidmaisuradze.ums.repository;

import com.davidmaisuradze.ums.entity.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadOfDepartmentRepository extends JpaRepository<HeadOfDepartment, Integer> {
}
