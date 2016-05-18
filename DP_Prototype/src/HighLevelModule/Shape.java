package HighLevelModule;

public abstract class Shape implements Cloneable{
	private String _id;
	protected String _type;
	
	public String getId() {
		return _id;
	}
	public void setId(String id) {
		_id = id;
	}
	public String getType() {
		return _type;
	}

	public Object clone(){
		Object obj  = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return obj;
	}
	//delegates the method to objects located in the next inheritance level
	public abstract void draw();
	
}
