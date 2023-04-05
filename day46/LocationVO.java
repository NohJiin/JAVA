package com.multi.mvc200;

public class LocationVO {
	private String space;
	private double lat;
	private double lon;
	
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	@Override
	public String toString() {
		return "LocationVO [space=" + space + ", lat=" + lat + ", lon=" + lon + "]";
	}
}