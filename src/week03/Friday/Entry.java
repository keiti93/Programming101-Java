package week03.Friday;

public class Entry {
	private String _key;
	private Integer _value;

	
	public Entry(String key, Integer value){
		setKey(key);
		setValue(value);
	}
	
	public Integer getValue() {
		return _value;
	}

	public void setValue(Integer _value) {
		this._value = _value;
	}

	public String getKey() {
		return _key;
	}

	public void setKey(String _key) {
		this._key = _key;
	}

}
