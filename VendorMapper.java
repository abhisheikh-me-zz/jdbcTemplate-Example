package com.nucleus;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VendorMapper implements RowMapper
{
	public Vendor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vendor vendor = new Vendor();
		vendor.setvId(rs.getInt("vId"));
		vendor.setvName(rs.getString("vName"));
		return vendor;
	}
	
}
