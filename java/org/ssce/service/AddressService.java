package org.ssce.service;

import org.springframework.stereotype.Service;
import org.ssce.model.Address;
@Service
public interface AddressService {
	public Address addAddress(Address address);
	public Address updateAddress(Address address);
	public Address deleteAddress(Integer addressId);
	public Address viewAllAddress(Address address);
	public Address viewAddress(Integer addressId);
}
