package com.atria.day5;

public class City extends State{
	private String CityName;
	private String Area;
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "City [CityName=" + CityName + ", Area=" + Area + ", StateName=" + getStateName()
				+ ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
	}
	
	
	
}
