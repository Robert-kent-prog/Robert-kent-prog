package com.Robert.MyApplication.contrroller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Robert.MyApplication.model.CloudVendor;


@RestController
@RequestMapping("/cloudvendor")
public class VendorApi {
	
	CloudVendor cloudVendor;


	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails( String vendorId) {
		return cloudVendor;
				
	}

	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		
		return "Cloud Vendor Created SuccessFully!";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		
		return "Cloud Vendor Updated SuccessFully!";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails( String vendorId)
	{
		this.cloudVendor=null;
		
		return "Cloud Vendor Deleted SuccessFully!";
	}
	
	
}
