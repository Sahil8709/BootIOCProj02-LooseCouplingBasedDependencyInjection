package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj02LooseCouplingBasedDependencyInjectionApplication {

	public static void main(String[] args) {
		//get access to the IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj02LooseCouplingBasedDependencyInjectionApplication.class, args);
		
		//get target spring bean class obj ref
		Vehicle v1 = ctx.getBean("vehicle",Vehicle.class);
		
		//invoke the b.method
		v1.journery("hyd","del");
	}

}
