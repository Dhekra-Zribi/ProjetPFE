package com.smpp.api.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor 
@ToString
@Builder
@Document(collection = "Sms")
public class Sms  {
	@Id
	private String id;
	private  String shortMessage;
	private String sourceAddr;
	private String destAddr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShortMessage() {
		return shortMessage;
	}
	public void setShortMessage(String shortMessage) {
		this.shortMessage = shortMessage;
	}
	public String getSourceAddr() {
		return sourceAddr;
	}
	public void setSourceAddr(String sourceAddr) {
		this.sourceAddr = sourceAddr;
	}
	public String getDestAddr() {
		return destAddr;
	}
	public void setDestAddr(String destAddr) {
		this.destAddr = destAddr;
	}
	public Sms(String id, String shortMessage, String sourceAddr, String destAddr) {
		super();
		this.id = id;
		this.shortMessage = shortMessage;
		this.sourceAddr = sourceAddr;
		this.destAddr = destAddr;
	}
	public Sms(String shortMessage, String sourceAddr, String destAddr) {
		super();
		this.shortMessage = shortMessage;
		this.sourceAddr = sourceAddr;
		this.destAddr = destAddr;
	}
	public Sms() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sms [id= " + id + ", message= " + shortMessage + ", From= " + sourceAddr + ", To= "
				+ destAddr + "]";
	}
	
	
	
}
