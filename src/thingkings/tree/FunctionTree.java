package thingkings.tree;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * 主要功能列表
 * @author LYC
 *
 */
public class FunctionTree {

	private FunctionEnum function;
	private FunctionTree parent;
	private List<FunctionTree> children=new ArrayList<FunctionTree>();
	
	
	public FunctionTree(FunctionEnum function){  
	     this.setFunction(function);  
	}
	public FunctionTree getParent() {
		return parent;
	}
	public void setParent(FunctionTree parent) {
		this.parent = parent;
	}  
	

    public void add(FunctionTree node){  
        children.add(node);  
    }  
      
    public void remove(FunctionTree node){  
        children.remove(node);  
    }  
      
    public List<FunctionTree> getChildren(){  
        return children;  
    }
	public FunctionEnum getFunction() {
		return function;
	}
	public void setFunction(FunctionEnum function) {
		this.function = function;
	}  
	

}
