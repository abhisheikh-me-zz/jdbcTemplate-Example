package com.nucleus;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;



public class Vendor 
{
@NumberFormat(style=Style.NUMBER) 
private int vId;
//@Size(max=50, min=1, message="range must be between 1 to 50" )
@NotEmpty(message="must be filled")
private String vName;

public int getvId()
{
	return vId;
}
public void setvId(int vId) {
	this.vId = vId;
}

public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}


}
