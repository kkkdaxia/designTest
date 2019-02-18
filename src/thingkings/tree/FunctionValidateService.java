package thingkings.tree;


public class FunctionValidateService {

	static FunctionTree root = null;  
	  
    public FunctionValidateService() {  
    	if(root==null)
    	{
            root = new FunctionTree(FunctionEnum.root);  
            FunctionTree ordRoom = new FunctionTree(FunctionEnum.ordRoom);		//房单
            FunctionTree reserve = new FunctionTree(FunctionEnum.reserve);			//预定
            root.add(ordRoom);
            root.add(reserve);
            FunctionTree roomId = new FunctionTree(FunctionEnum.roomId);		//房号
            ordRoom.add(roomId);
            reserve.add(roomId);
            FunctionTree price = new FunctionTree(FunctionEnum.price);		//房价方案
            FunctionTree mkt = new FunctionTree(FunctionEnum.mkt);		//活动
            ordRoom.add(price);
            reserve.add(price);
            ordRoom.add(mkt);
            reserve.add(mkt);
            FunctionTree roomType = new FunctionTree(FunctionEnum.roomType);		//房型
            FunctionTree rent = new FunctionTree(FunctionEnum.rent);		//租类
            FunctionTree source = new FunctionTree(FunctionEnum.source);		//客源
            FunctionTree channel = new FunctionTree(FunctionEnum.channel);		//渠道
            FunctionTree member = new FunctionTree(FunctionEnum.member);		//会员
            FunctionTree cmGroup = new FunctionTree(FunctionEnum.cmGroup);		//协议单位
            price.add(roomType);
            price.add(rent);
            price.add(source);
            price.add(channel);
            price.add(cmGroup);
            price.add(member);
            mkt.add(roomType);
            mkt.add(rent);
            mkt.add(source);
            mkt.add(channel);
            mkt.add(cmGroup);
            mkt.add(member);
    	}
    }  
    
    
	public boolean validateFunction(FunctionEnum function)
	{
		FunctionTree tree=getFunctionTree(root, function);
		if(tree==null)
			return true;
		while(tree.getParent().getFunction()!=null)
		{
			validateDetail(tree.getFunction());
		}
		return true;
	}
	
	
	private void validateDetail(FunctionEnum function) {
		System.out.println("validate:"+function.getCode());
	}


	public FunctionTree getFunctionTree(FunctionTree functionTree,FunctionEnum myFunction)
	{
		System.out.println(functionTree.getFunction().getCode());
		for(FunctionTree tree:functionTree.getChildren())
		{
			if(tree.equals(myFunction))
				return tree;
			getFunctionTree(tree,myFunction);
		}
		return null;
	}
}
