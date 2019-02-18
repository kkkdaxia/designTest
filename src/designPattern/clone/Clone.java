package designPattern.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import designPattern.factory.CheckIn;

public class Clone implements Cloneable,Serializable {

	private StringBuffer cloneStr;
	private int cloneInt;
	private CheckIn checIn=new CheckIn();

	//浅拷贝
	public Clone clone() throws CloneNotSupportedException
	{
		return (Clone)super.clone();
	}
	
	public Clone()
	{
		cloneStr=new StringBuffer("X");
		cloneInt=0;
	}
	
	public Clone deepClone() throws Exception
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();  
	    ObjectOutputStream oos = new ObjectOutputStream(bos);  
	    oos.writeObject(this); 
	    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return (Clone)ois.readObject(); 
	}
	
	

	public StringBuffer getCloneStr() {
		return cloneStr;
	}

	public void setCloneStr(StringBuffer cloneStr) {
		this.cloneStr = cloneStr;
	}

	public int getCloneInt() {
		return cloneInt;
	}

	public void setCloneInt(int cloneInt) {
		this.cloneInt = cloneInt;
	}

	public CheckIn getChecIn() {
		return checIn;
	}

	public void setChecIn(CheckIn checIn) {
		this.checIn = checIn;
	}
	
	
}
