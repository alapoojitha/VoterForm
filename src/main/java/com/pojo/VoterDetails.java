package com.pojo;
import java.io.Serializable;
public class VoterDetails implements Serializable{
   private static final long serialVersionUID = 1L;
   private int vid;
   private String name;
   private int age;
   public VoterDetails() {}
   public int  getVid() {
      return vid;
   } 
   public void setVid (int  vid ) {
      this.vid = vid;
   }   
   public String getName() {
      return name;
   }
   public void setName( String name ) {
      this.name = name;
   }   
   public int  getAge() {
	    return age;
   } 
	public void setAge( int age ) {
	    this.age = age;
	}
   
  }