package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
// @Cacheable(false) - not working
public class WebScrapingLog { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date webScrapingTime = null;
	private Date lastCompletionTime = null;
	private Integer devFactor = null;
	private Integer devBFlag = 0;

	public Date getWebScrapingTime() {
		return webScrapingTime;
	}

	public void setWebScrapingTime(Date webScrapingTime) {
		this.webScrapingTime = webScrapingTime;
	}

	public Date getLastCompletionTime() {
		return lastCompletionTime;
	}

	public void setLastCompletionTime(Date lastCompletionTime) {
		this.lastCompletionTime = lastCompletionTime;
	}

	public Integer getDevFactor() {
		return devFactor;
	}

	public void setDevFactor(Integer devFactor) {
		this.devFactor = devFactor;
	}

	public Integer getDevBFlag() {
		return devBFlag;
	}

	public void setDevBFlag(Integer devBFlag) {
		this.devBFlag = devBFlag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "WebScrapingLog [id=" + id + ", webScrapingTime="
				+ webScrapingTime + ", lastCompletionTime="
				+ lastCompletionTime + ", devFactor=" + devFactor
				+ ", devBFlag=" + devBFlag + "]";
	}
}
