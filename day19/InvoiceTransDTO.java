package day19;

import java.io.Serializable;

public class InvoiceTransDTO implements Serializable,Cloneable {

	private int invoiceid;
	private int itemid;
	private int qty;
	private InvoiceTransDTO invoicetdto;
	public InvoiceTransDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvoiceTransDTO(int invoiceid, int itemid, int qty) {
		super();
		this.invoiceid = invoiceid;
		this.itemid = itemid;
		this.qty = qty;
	}
	synchronized public InvoiceTransDTO getInvoiceTransObject()
	{
		if(invoicetdto==null) {
			invoicetdto=new InvoiceTransDTO();
		}
		return invoicetdto.createClone();
	}
	private InvoiceTransDTO createClone()
	{
		try
		{
			return (InvoiceTransDTO)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String toString() {
		return "InvoiceTransDTO [invoiceid=" + invoiceid + ", itemid=" + itemid + ", qty=" + qty + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + invoiceid;
		result = prime * result + itemid;
		result = prime * result + qty;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransDTO other = (InvoiceTransDTO) obj;
		if (invoiceid != other.invoiceid)
			return false;
		if (itemid != other.itemid)
			return false;
		if (qty != other.qty)
			return false;
		return true;
	}
	public final int getInvoiceid() {
		return invoiceid;
	}
	public final int getItemid() {
		return itemid;
	}
	public final int getQty() {
		return qty;
	}
	public final void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}
	public final void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public final void setQty(int qty) {
		this.qty = qty;
	}
}
