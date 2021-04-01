package day19;

import java.sql.Date;
import java.time.LocalDateTime;

public class InvoiceMasterDTO {
	private int invoiceid;
	private LocalDateTime invoicedate;
	private int custid;
	private int custphoneno;
	private InvoiceMasterDTO invoicedto;
	public InvoiceMasterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvoiceMasterDTO(int invoiceid, LocalDateTime invoicedate, int custid, int custphoneno) {
		super();
		this.invoiceid = invoiceid;
		this.invoicedate = invoicedate;
		this.custid = custid;
		this.custphoneno = custphoneno;
	}
	synchronized public InvoiceMasterDTO getInvoicemObject()
	{
		if(invoicedto==null) {
			invoicedto=new InvoiceMasterDTO();
		}
		return invoicedto.createClone();
	}
	private InvoiceMasterDTO createClone()
	{
		try {
			return(InvoiceMasterDTO)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String toString() {
		return "InvoiceMasterDTO [invoiceid=" + invoiceid + ", invoicedate=" + invoicedate + ", custid=" + custid
				+ ", custphoneno=" + custphoneno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custid;
		result = prime * result + custphoneno;
		result = prime * result + ((invoicedate == null) ? 0 : invoicedate.hashCode());
		result = prime * result + invoiceid;
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
		InvoiceMasterDTO other = (InvoiceMasterDTO) obj;
		if (custid != other.custid)
			return false;
		if (custphoneno != other.custphoneno)
			return false;
		if (invoicedate == null) {
			if (other.invoicedate != null)
				return false;
		} else if (!invoicedate.equals(other.invoicedate))
			return false;
		if (invoiceid != other.invoiceid)
			return false;
		return true;
	}
	public final int getInvoiceid() {
		return invoiceid;
	}
	public final Date getInvoicedate() {
		return invoicedate;
	}
	public final int getCustid() {
		return custid;
	}
	public final int getCustphoneno() {
		return custphoneno;
	}
	public final void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}
	public final void setInvoicedate(LocalDateTime invoicedate) {
		this.invoicedate = invoicedate;
	}
	public final void setCustid(int custid) {
		this.custid = custid;
	}
	public final void setCustphoneno(int custphoneno) {
		this.custphoneno = custphoneno;
	}
}
