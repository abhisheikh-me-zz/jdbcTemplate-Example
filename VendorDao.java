package com.nucleus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class VendorDao implements VendorDAOI
{
@Autowired
JdbcTemplate jdbcTemplate;
public int saveVendor(Vendor vendor)
{
	int c=0;
	c=jdbcTemplate.update("insert into vendors(vId,vName)values("+vendor.getvId()+",'"+vendor.getvName()+"')");
	return c;
	
}
@Override
public Vendor searchVendor(int vendorid) 
{
   @SuppressWarnings("unchecked")
	Vendor vendor=(Vendor)jdbcTemplate.queryForObject("select * from vendors where vId=?", new Object[] { vendorid }, new VendorMapper());

   return vendor;
}
}
