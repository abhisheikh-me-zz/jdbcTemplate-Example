package com.nucleus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class vendorService implements VendorSericeI
{

	@Autowired
	VendorDAOI dao;
	@Override
	public int saveVendor(Vendor vendor) 
	{
		int r=0;
		r=dao.saveVendor(vendor);
		return r;
	}
	@Override
	public Vendor searchVendor(int vendorid)
	{
		Vendor vendor=dao.searchVendor(vendorid);
		return vendor;
	}



}
