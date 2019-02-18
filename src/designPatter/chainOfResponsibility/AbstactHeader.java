package designPatter.chainOfResponsibility;

public abstract  class AbstactHeader implements Header {
	
	private Header handler;

	public Header getHandler() {
		return handler;
	}

	public void setHandler(Header handler) {
		this.handler = handler;
	}  
}
