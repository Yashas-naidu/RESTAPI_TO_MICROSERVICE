package com.embarkx.firstjobapp.job;

import org.springframework.data.jpa.repository.JpaRepository;
// this or below is fine to extend
//import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends JpaRepository<Job,Long>{
}
