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
    }
	
	static hasMany = [items:Item]
}