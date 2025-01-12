package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Trainee;
import com.cg.service.ITraineeService;

@RestController
@RequestMapping("trainee")
public class TraineeController {
	
	@Autowired
	private ITraineeService serv;
	
	@PostMapping("/create")
	public void createEmp(@RequestBody Trainee e) {
		serv.insertTrainee(e);
	}
	
	
	@PutMapping("/update/{id}")
	public void updateEmp(@RequestBody Trainee e, @PathVariable int id) {
		e.setTraineeId(id);
		serv.updateTrainee(e);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmp(@PathVariable int id) {
		serv.deleteTraineeById(id);
	}
	
	@GetMapping("/listbyid/{id}")
	public List<Trainee> listById(@PathVariable int id){
		return serv.listById(id);
	}
	
	@GetMapping("/listbyname/{name}")
	public List<Trainee> listByName(@PathVariable String name){
		return serv.listByName(name);
	}
	
	@GetMapping("/listall")
	public List<Trainee> listAll(){
		return serv.listAllTrainee();
	}
	
	
}
