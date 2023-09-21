package org.ssce.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Address;
import org.ssce.repository.AddressRepository;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address addAddress(Address address) {
		
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		
		return addressRepository.save(address);
	}

	@Override
	public Address deleteAddress(Integer addressId) {
		Optional<Address> add = addressRepository.findById(addressId);
		if (add.isPresent()) {
			Address address = add.get();
			addressRepository.delete(address);
			return address;
		}
		return null;
	}

	@Override
	public Address viewAllAddress(Address address) {
	
		return null;
	}

	@Override
	public Address viewAddress(Integer addressId) {
		Optional<Address> add=addressRepository.findById(addressId);
		if(add.isPresent())
		{
			return add.get();
		}
		else
		return null;
	}
	
}
