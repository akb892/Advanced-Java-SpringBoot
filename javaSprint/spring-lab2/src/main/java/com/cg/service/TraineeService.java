package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Trainee;
import com.cg.dao.ITraineeJpaRepository;


@Service
public class TraineeService implements ITraineeService{
	
	@Autowired
	private ITraineeJpaRepository repo;

	@Override
	public List<Trainee> listAllTrainee() {
		return repo.findAll();
	}

	@Override
	public List<Trainee> listByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<Trainee> listById(int id) {
		return repo.findByTraineeId(id);
	}

	@Override
	public void deleteTraineeById(int id) {
		repo.deleteById(id);
	}

	@Override
	public void updateTrainee(Trainee e) {
		Optional<Trainee> op = repo.findById(e.getTraineeId());
		if(!op.isEmpty()) {
			Trainee t = op.get();
			t.setName(e.getName());
			t.setDomain(e.getDomain());
			t.setLocation(e.getLocation());
			repo.saveAndFlush(t);
		}
	}

	@Override
	public void insertTrainee(Trainee e) {
		repo.saveAndFlush(e);
	}

}
