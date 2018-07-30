package com.nucleus;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController 
{
@Autowired
VendorSericeI vendorSerice;
@RequestMapping(value="/go", method=RequestMethod.GET)
public String goURL(@ModelAttribute("vendor") Vendor vendor)
{
	return "saveForm";
	
}
@RequestMapping(value="/searchVendor", method=RequestMethod.GET)
public String goURL()
{
	return "search";
	
}
@RequestMapping(value="/save", method=RequestMethod.POST)
public ModelAndView saveVendor(@ModelAttribute("vendor") Vendor vendor)
{
	vendorSerice.saveVendor(vendor);
	return new ModelAndView("show","vendor",vendor);
	
}
@RequestMapping(value="/saveVendor", method=RequestMethod.POST)
public ModelAndView saveMethod(@ModelAttribute("vendor") @Valid Vendor vendor,BindingResult result)
{
	if (result.hasErrors())
	{
		
		return new ModelAndView("saveForm");
	} 
	vendorSerice.saveVendor(vendor);
	return new ModelAndView("show","vendor",vendor);
	
}
@RequestMapping(value="/search", method=RequestMethod.POST)
public ModelAndView showVendor(@RequestParam("vendorid") String vendorid)
{
	int v=Integer.parseInt(vendorid);
	Vendor vendor=vendorSerice.searchVendor(v);
	
	return new ModelAndView("record","vendor",vendor);
	
}
}
