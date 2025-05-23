package com.kedu.home.dto;

public class GetRegionDTO {
	
	private String regionName;
	private String regionDetail;
	private double latitude;
	private double longitude;
	private String filePath;
	
	public GetRegionDTO() {}
	
	public GetRegionDTO(String regionName, String regionDetail, double latitude, double longitude, String filePath) {
		super();
		this.regionName = regionName;
		this.regionDetail = regionDetail;
		this.latitude = latitude;
		this.longitude = longitude;
		this.filePath = filePath;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionDetail() {
		return regionDetail;
	}

	public void setRegionDetail(String regionDetail) {
		this.regionDetail = regionDetail;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	};
	
}
