package com.company.appname.controllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;



import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.company.appname.collection.Site;
import com.company.appname.dtos.SiteTO;
import com.company.appname.services.SiteDetailsService;


@RestController
@RequestMapping("/app")
public class AppResource {

	@Autowired
	private SiteDetailsService  siteDetailsService;
  
	@PostMapping(path = "/site", produces = "application/json", consumes = "application/json")
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
  public void createNewSite(
			  @RequestBody SiteTO siteTO) {

		siteDetailsService.createSite(siteTO);
	       
	    }
	
	
}



