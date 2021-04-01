package day19;

import java.io.Serializable;

public class ItemDTO  implements Serializable,Cloneable{
		private int itemid;
		private String itemdesc;
		private int unit;
		private int price;
		private boolean flag;
		private static ItemDTO itemdto;
		synchronized public ItemDTO getItemObject()
		{
			if(itemdto==null) {
				itemdto=new ItemDTO();
			}
			return itemdto.createClone();
		}
		private ItemDTO createClone() {
			try {
			return (ItemDTO)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ItemDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ItemDTO(int itemid, String itemdesc, int unit, int price, boolean flag) {
			super();
			this.itemid = itemid;
			this.itemdesc = itemdesc;
			this.unit = unit;
			this.price = price;
			this.flag = flag;
		}
		@Override
		public String toString() {
			return "ItemDTO [itemid=" + itemid + ", itemdesc=" + itemdesc + ", unit=" + unit + ", price=" + price
					+ ", flag=" + flag + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (flag ? 1231 : 1237);
			result = prime * result + ((itemdesc == null) ? 0 : itemdesc.hashCode());
			result = prime * result + itemid;
			result = prime * result + price;
			result = prime * result + unit;
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
			ItemDTO other = (ItemDTO) obj;
			if (flag != other.flag)
				return false;
			if (itemdesc == null) {
				if (other.itemdesc != null)
					return false;
			} else if (!itemdesc.equals(other.itemdesc))
				return false;
			if (itemid != other.itemid)
				return false;
			if (price != other.price)
				return false;
			if (unit != other.unit)
				return false;
			return true;
		}
		public final int getItemid() {
			return itemid;
		}
		public final String getItemdesc() {
			return itemdesc;
		}
		public final int getUnit() {
			return unit;
		}
		public final int getPrice() {
			return price;
		}
		public final boolean isFlag() {
			return flag;
		}
		public final void setItemid(int itemid) {
			this.itemid = itemid;
		}
		public final void setItemdesc(String itemdesc) {
			this.itemdesc = itemdesc;
		}
		public final void setUnit(int unit) {
			this.unit = unit;
		}
		public final void setPrice(int price) {
			this.price = price;
		}
		public final void setFlag(boolean flag) {
			this.flag = flag;
		}
				
}
