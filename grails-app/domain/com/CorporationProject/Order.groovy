package com.CorporationProject
import java.sql.Timestamp
class Order {
	
	Timestamp processorReceived
	
	
	String processorOrderNumber
	
	
	String processorLoyaltyNumber
	
	
	Double procesorTenderAmount
	
	String processorTenderType
	
	
	Timestamp posReceived
	
	Timestamp dateAdded
	
	Timestamp lastUpdate
	
	String posOrderNumber
	
	
	String posLoyaltyNumber
	
	String posTenderAmount
	

	String posCashier
	

	String posLane
	
	String Status
	String type

    static constraints = {
		processorReceived nullable:true 
		posReceived nullable:true
		dateAdded nullable:true 
		lastUpdate nullable:true 
		
    }
	static mapping={table 'orders'}
	
	static hasmany=[items:Item]
}
