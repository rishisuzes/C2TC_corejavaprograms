package helloword;

public class product {

	public class Product {
		private int pid;
		private String product_name;
		private float price;
		
		public Product()
		{
			//Default Constructor
			this.pid=101;
			this.product_name="keyboard";
			this.price=101.6f;
		}
		
		public Product(int pid, String product_name,float price)
		{
			//Parmeterized Constructor
			this.pid = pid;
			this.product_name = product_name;
			this.price = price;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getProduct_name() {
			return product_name;
		}

		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [pid=" + pid + ", product_name=" + product_name + ", price=" + price + "]";
		}
		
		
	}

}
