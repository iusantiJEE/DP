package strings;

public class DelimitedStringBuilder{
	private StringBuilder _sb =  new StringBuilder();
	private String _delimiter = null;
	
	public DelimitedStringBuilder( String delimiter){
		_delimiter =  delimiter;
	}
	
	public DelimitedStringBuilder append(String value){
		_sb.append(value).append(_delimiter);
		return this;
	}
	
	public  DelimitedStringBuilder reset(){
		_sb.setLength(0);
		return this;
	}
	
	public  DelimitedStringBuilder changeDelimiterAndAppendIt(String newDelimiter){
		changeDelimiter(newDelimiter).append(_delimiter);
		return this;
	}
	
	public  DelimitedStringBuilder changeDelimiter(String newDelimiter){
		_delimiter =  newDelimiter;
		return this;
	}

	
	public String  toString(){
		return _sb.toString();
	}
}
