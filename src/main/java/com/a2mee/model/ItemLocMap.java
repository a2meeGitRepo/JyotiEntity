package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_loc_map")
public class ItemLocMap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_loc_map_id")
	private long itemLocMapId;
	
	@ManyToOne
	@JoinColumn(name = "storage_bin_id")
	private StorageBinMst storageBinMst;
	
	@ManyToOne
	@JoinColumn(name = "item_mst_id")
	private ItemMst itemMst;

	public ItemLocMap() {
		super();
	}

	public long getItemLocMapId() {
		return itemLocMapId;
	}

	public void setItemLocMapId(long itemLocMapId) {
		this.itemLocMapId = itemLocMapId;
	}

	public StorageBinMst getStorageBinMst() {
		return storageBinMst;
	}

	public void setStorageBinMst(StorageBinMst storageBinMst) {
		this.storageBinMst = storageBinMst;
	}

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

	@Override
	public String toString() {
		return "ItemLocMap [itemLocMapId=" + itemLocMapId + ", storageBinMst=" + storageBinMst + ", itemMst=" + itemMst
				+ "]";
	}	
}
