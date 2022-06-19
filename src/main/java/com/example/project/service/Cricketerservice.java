package com.example.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Cricketer;
import com.example.project.repository.Cricketerrepository;

@Service
public class Cricketerservice {
	
	@Autowired
	private Cricketerrepository cricketerrepository;

	public List<Cricketer> getcricketer() {
		
		return (List<Cricketer>)cricketerrepository.findAll();
	}

	public Cricketer createcricketer(Cricketer c) {
		return cricketerrepository.save(c);
	}

	public Cricketer getbyid(int id) {
		return cricketerrepository.findById(id).get();
	}

	public Cricketer updatecricketer(Cricketer c, int id) {
		
		Cricketer c1= cricketerrepository.findById(id).get();

    if (Objects.nonNull(c.getName())
        && !"".equalsIgnoreCase(
            c.getName())) {
        c1.setName(
            c.getName());
    }

    if (Objects.nonNull(
            c.getTeamname())
        && !"".equalsIgnoreCase(
            c.getTeamname())) {
        c1.setTeamname(
            c.getTeamname());
    }
    return cricketerrepository.save(c1);
	}
		

	public void deletebyid(int id) {
		cricketerrepository.deleteById(id);
		
	}
}
