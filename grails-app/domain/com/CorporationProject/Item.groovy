package com.CorporationProject


class Item{
	String upcEAN
	
	String storePosDepartment
	
	String storePosDepartmentDesc
	
	String description

	String shortDescription
	
	String taxFlags
	
	Integer bottleDeposit = 0
	
	Integer alcoholFlag
	
	Integer tobaccoFlag
	
	Double sellSize
	
	String unitOfMeasure
	
	String image
	
	String foodstampFlag
	
	String ecommerceFlag
	
	String mixMatchCode
	
	String aisleNumber
	
	String category
	
	String vendorCode
	
	String vendorItemCode
	
	static constraints = { upcEAN(unique:true)}
	
 
	static belongsTo = [orders:Order]
	static hasmany=[items:Item]
}
