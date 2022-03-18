package com.user.user.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user.entity.User;

@Service
public class UserImplements  implements UserService
{
	
	
	List<User> list =new ArrayList();
	{
		list.add(new User(111L,"madhu","123456"));
		list.add(new User(112L,"madhu2","123457"));
		list.add(new User(113L,"madhu3","123458"));
	}
		
	
			
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
