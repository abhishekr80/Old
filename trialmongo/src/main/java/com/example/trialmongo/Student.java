package com.example.trialmongo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="StudentsData")
public class Student {
	public int _id;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String sname;

}
