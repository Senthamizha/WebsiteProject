package com.amazon.Controller;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.Model.UserDetails;
import com.amazon.Service.UserService;

@RestController

public class LoginPage {
	
	@Autowired
	UserDetails userDetails;
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)   
	public HashMap checkUser(@RequestParam Map<String,String> requestParams) throws Exception{
	   String userName=requestParams.get("userName");
	   String password=requestParams.get("password");

	  HashMap<String,Object> map = new HashMap();
	  
	  
	  if(userName.equals("admin")&&password.equals("admin")){
		  map.put("userName",userName);
		  map.put("statusCode", 401);
		  map.put("statusMessage", "Incorrect Username and Password");
		  return map;
	  }else{
		  
		  JSONObject obj=new JSONObject();
		  
		  userDetails =  userService.getUser(userName);
		  
		  obj.put("doorNo", userDetails.getDoorNo());
		  obj.put("street", userDetails.getStreet());
		  obj.put("city", userDetails.getCity());
		  obj.put("state", userDetails.getState());
		  obj.put("pinCode", userDetails.getPinCode());
		  obj.put("phoneNumber", userDetails.getPhoneNumber());
		  
		  
		  map.put("userName",userName);
		  map.put("statusCode", 200);
		  map.put("statusMessage", "Success");
		  map.put("billAddress", obj);
		  return map;
	  }
	  
	}
	
}
