package com.cg.service;

import java.util.List;

import com.cg.bean.Trainee;

public interface ITraineeService {
	
	List<Trainee> listAllTrainee();
	List<Trainee> listByName(String name);
	List<Trainee> listById(int id);
	void deleteTraineeById(int id);
	void updateTrainee(Trainee e);
	void insertTrainee(Trainee e);
	
}
