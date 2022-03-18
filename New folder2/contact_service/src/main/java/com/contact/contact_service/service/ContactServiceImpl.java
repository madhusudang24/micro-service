package com.contact.contact_service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	
	List<Contact> list =new ArrayList();
	
	{
		list.add(new Contact(1L,"amith@gmail.com","amit",111L));

		list.add(new Contact(2L,"amith@gmail.com","amit",112L));
		list.add(new Contact(3L,"amith@gmail.com","amit",113L));
	}
	@Override
	public List<Contact> getContactsofUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
