package com.johnson.rest.Welcome;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnson.rest.models.User;
import com.johnson.rest.service.UserRepository;

@RestController
public class WelcomeController {
   
	@Autowired
	UserRepository userrepo;
	
	@GetMapping("/login")
	public List<User> wel()
	{
		return userrepo.findAll();
	}
	
	@GetMapping("/user/{id}")
	public boolean getById(@PathVariable int id) {
	 Optional<User> a=userrepo.findById(id);
	if(a==null)
	 return false;
	else
		return true;
	 
		
		
	}
	@PostMapping("/user")
	public int save(@RequestBody User user)
	{
		User s=userrepo.save(user);
		return s.getId();
		
	}
	@PostMapping("/{a}/{b}")
    public User meth(@PathVariable("a") int a,@PathVariable("b") String b)
    {   
		User a1=userrepo.findById(a).get();
		a1.setFirstname(b);
		userrepo.save(a1);
		return a1;	
}
	


}
