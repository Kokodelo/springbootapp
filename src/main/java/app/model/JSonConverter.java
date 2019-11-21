package app.model;

public class JSonConverter {
	private String convertedJson;
	
	public JSonConverter(String toConvert) {
		this.convertedJson= convert(toConvert);
	}
	
	private String convert(String toConvert) {
		return "converted";
	}
}
