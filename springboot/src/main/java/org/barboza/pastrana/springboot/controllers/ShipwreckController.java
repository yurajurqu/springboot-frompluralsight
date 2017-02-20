package org.barboza.pastrana.springboot.controllers;

import java.util.List;

import org.barboza.pastrana.springboot.model.Shipwreck;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

	@RequestMapping(value="shipwrecks",method=RequestMethod.GET)
	public List<Shipwreck> list()
	{
		
		return ShipwreckStub.list();
		
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.GET)
	public Shipwreck find(@PathVariable("id") long id)
	{
		
		return ShipwreckStub.get(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable("id") long id)
	{
		
		return ShipwreckStub.delete(id);
	}
	
	@RequestMapping(value="shipwrecks",method=RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck wreck )
	{
		return ShipwreckStub.create(wreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.PUT)
	public void update(@RequestBody Shipwreck wreck,@PathVariable ("id") long id)
	{
		 ShipwreckStub.update(id, wreck);
	}
	
	
	
}
