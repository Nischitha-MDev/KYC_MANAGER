package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="SD_KYC_FIELD_MASTER")
	public class SD_KYC_FIELD_MASTER {
		private static final long serialVersionUID = 1L;
		
		@Id//primary key
		@GeneratedValue(strategy=GenerationType.IDENTITY)//auto increment
		@Column(name="FIELD_ID",unique = true,nullable = false)
		private Integer id;
		
		@Column(name="FIELD_NAME",nullable = false)
		private String name;
		
		public SD_KYC_FIELD_MASTER() {
			super();
			// TODO Auto-generated constructor stub
		}

		public SD_KYC_FIELD_MASTER(Integer id, String name, int type, int tagtype, String dropdown) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.tagtype = tagtype;
			this.dropdown = dropdown;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public int getTagtype() {
			return tagtype;
		}

		public void setTagtype(int tagtype) {
			this.tagtype = tagtype;
		}

		public String getDropdown() {
			return dropdown;
		}

		public void setDropdown(String dropdown) {
			this.dropdown = dropdown;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Column(name="FIELD_TYPE",nullable = false)
		private int type;
		
		@Column(name="TAG_TYPE",nullable = false)
		private int tagtype;
		
		@Column(name="DROPDOWN",nullable = false)
		private String dropdown;
		
		
		

}
