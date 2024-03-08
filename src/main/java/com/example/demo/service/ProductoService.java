package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> getAllProducts() {
		return productoRepository.findAll();
	}
	
	
	public Producto createProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto getProductoByID(Long id) {
		return productoRepository.findById(id).orElse(null);
	}
	
	public void deleteProduct(Long id) {
		productoRepository.deleteById(id);
	}
	
	
}
