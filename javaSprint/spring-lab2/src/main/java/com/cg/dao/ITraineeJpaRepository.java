package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.Trainee;


@Repository
public interface ITraineeJpaRepository extends JpaRepository<Trainee, Integer> {
	List<Trainee> findByName(String name);
	List<Trainee> findByTraineeId(int traineeId);
}
