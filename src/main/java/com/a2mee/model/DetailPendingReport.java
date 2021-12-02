package com.a2mee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DetailPendingReport {
	
	
	@Column(name = "assign_date")
	private Date assignDate;
	
	@Column(name = "model_code")
	private String modelCode;
	
	@Column(name = "material_group")
	private String materialGroup;
	
	
	@Column(name = "picker")
	private String picker;
	
	@Column(name = "pro_ord_no")
	private String proOrdNo;
	
	@Column(name = "comp_code")
	private String compCode;
	
	@Column(name = "comp_desc")
	private String compDesc;
	
	@Column(name = "pick_comp_qty")
	private double pickCompQty;
	
	@Column(name = "uom")
	private String uom;
	
	@Column(name = "mtl_group")
	private String mtlGroup;
	
	
	@Column(name="priority_order")
	private String priorityOrder;
	
	@Column(name = "indicator")
	private String indicator;
	
	@Column(name = "status")
	private String status;
	
	
	@Column(name = "stock_qty")
	private double stockQty;
	
	@Column(name = "report_date")
	private Date reportDate;


	
	
}
