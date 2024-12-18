//Vehicle.java

package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired //field Injection
	@Qualifier("motor")
	private IEngine engg;
	
	public Vehicle() {
		System.out.println("Vehicle::0-arg constructor");
	}
	
	//b.method
	public void journery(String startPlace,String endPlace) {
		
		System.out.println("Vehicle.journey()---->Journey started from::"+startPlace);
        engg.startEngine();
		System.out.println("Vehicle.journey()---->Journey is going on...... from"+startPlace);
		
		engg.stopEngine();
		System.out.println("Vehicle.journey()---->Journey ended at::"+endPlace);
	}

}
