package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Empresa;
import com.example.demo.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<Empresa> getAllEmpresas(){
		return empresaRepository.findAll();
	}
	
	public Empresa getEmpresaById(Long id) {
		return empresaRepository.findById(id).orElse(null);
	}
	
	
}
