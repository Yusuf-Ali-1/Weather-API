package com.tts.WeatherApp;




public class Request {
    public Request() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Request [zipCode=" + zipCode + "]";
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
	private String zipCode;
}