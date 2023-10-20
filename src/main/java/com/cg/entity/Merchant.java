package com.cg.entity;

public class Merchant {
		private int id;
		private String name;
		private String business;
		
		public Merchant() {
			super();
		}

		public Merchant(int id, String name, String business) {
			super();
			this.id = id;
			this.name = name;
			this.business = business;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBusiness() {
			return business;
		}

		public void setBusiness(String business) {
			this.business = business;
		}

		@Override
		public String toString() {
			return "Merchant [id=" + id + ", name=" + name + ", business=" + business + "]";
		}
		
}
