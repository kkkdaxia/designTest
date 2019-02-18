package thingkings.tree;

public enum FunctionEnum {
	root("root","ord_room","room_ord_id", "根节点"),
	ordRoom("ordRoom","ord_room","room_ord_id", "房单"),
	reserve("reserve","ord_reserve","reserve_id", "预定"),
	mkt("mkt","mkt_market_act","market_act_id", "市场活动"),
	price("price","htl_price_rule","price_id", "房价"),
	rent("rent","htl_rent","rent_type", "租类"),
	source("source","htl_source","rent_type", "客源"),
	channel("channel","htl_rent","rent_type", "渠道"),
	roomType("rent","htl_rent","rent_type", "房型"),
	cmGroup("cmGroup","htl_rent","rent_type", "协议单位"),
	member("member","htl_rent","rent_type", "会员"),
	roomId("roomId","htl_room","room_id", "房号");
	
	private final String code;		//功能代码
	private final String tableName;	//功能表名
	private final String foreignKey;//外键名称
    private final String name;//功能名称
    
    FunctionEnum(String code, String tableName, String foreignKey, String name){
    	this.code=code;
    	this.tableName=tableName;
    	this.foreignKey=foreignKey;
    	this.name=name;
    }
    

	public String getCode() {
		return code;
	}

	public String getTableName() {
		return tableName;
	}

	public String getForeignKey() {
		return foreignKey;
	}

	public String getName() {
		return name;
	}
}
