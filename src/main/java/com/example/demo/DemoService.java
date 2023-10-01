package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="service")
public class DemoService {
	
@Autowired
	private DemoRepo demorepo;
   
 public String insertDemoEntity(DemoEntity entity) {
	 demorepo.save(entity);
	return "values inserted";
	 
 }
public String readByEntity(DemoEntity e) {
	Optional<DemoEntity> o=demorepo.findById(e.getId());
	if (o.isPresent()) {
		DemoEntity e1=o.get();
		return e1.toString();
	}else
	return "no entity found :"+e.getId();
	
}
//public List<DemoEntity> readall(DemoEntity d){
//	DemoEntity d1=new DemoEntity();
// Iterable<DemoEntity> o1=demorepo.findAll();
//  for(DemoEntity itr:o1) {
//	  itr.
//  }
//	list.add
//	return null;
//	
//
public DemoEntity updateEntity(String name,Integer id) {
	Optional<DemoEntity> o2=demorepo.findById(id);
	if(o2.isPresent()) {
		DemoEntity dm=o2.get();
		dm.setName(name);
		demorepo.save(dm);
	return dm;
	}else 
		throw new RuntimeException("no entity found"+id) ;
}

public void deleteValues(Integer id) {
	//demorepo.deleteById(id);
	Optional<DemoEntity> dm= demorepo.findById(id);
	DemoEntity e=dm.orElseThrow(()-> new RuntimeException("no entity found"+id));
	demorepo.delete(e);
	System.out.println("deleted successfully");
	
}




}
