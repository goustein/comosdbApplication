package com.company.appname.services;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.appname.collection.Site;
import com.company.appname.dtos.SiteTO;
import com.company.appname.repos.SiteRepository;

import reactor.core.publisher.Mono;

@Service
public class SiteDetailsServiceImpl implements SiteDetailsService{

	@Autowired
	private SiteRepository siteRepo;
	
	@Override
	public void createSite(SiteTO siteTo) {
		System.out.println("gouse basha");
		Site site = new Site();
		site.setSiteNumber(siteTo.getSiteNum());
		site.setSiteAddress(siteTo.getSiteAddress());
		 siteRepo.save(site);
	}
}
