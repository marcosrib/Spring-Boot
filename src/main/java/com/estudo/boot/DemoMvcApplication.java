package com.estudo.boot;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.estudo.boot.web.entity.Empresa;
import com.estudo.boot.web.repository.EmpresaRepository;





@SpringBootApplication
public class DemoMvcApplication {
	@Autowired
	private EmpresaRepository empresaR;
	
	
	public void salvar() {
	
		Date date = new Date();
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		formatador.format(date);
		
		Empresa  empresa = new Empresa();
		empresa.setCnpj("8978978978");
	
		empresa.setRazaoSocial("nome blaba");
		try {
			this.empresaR.save(empresa);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoMvcApplication.class, args);
		new DemoMvcApplication().salvar();
		
	}
}
