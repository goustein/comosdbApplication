package com.company.appname.collection;

import org.springframework.data.annotation.Id;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Site")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Site {
	
	//id field will be used as document id in Azure Cosmos DB
	

    @Id
	@PartitionKey
	private String siteNumber;
	
	private String siteAddress;

	public String getSiteNumber() {
		return siteNumber;
	}

	public void setSiteNumber(String siteNumber) {
		this.siteNumber = siteNumber;
	}

	public String getSiteAddress() {
		return siteAddress;
	}

	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

	@Override
	public String toString() {
		return "Site [siteNumber=" + siteNumber + ", siteAddress=" + siteAddress + "]";
	}



	
	
}
