package com.example.project.repository;



//import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Cricketer;

@Repository
public interface Cricketerrepository extends CrudRepository<Cricketer,Integer>{

	

}
