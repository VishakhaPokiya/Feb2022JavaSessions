package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		//UC:1
		EComApp user = new EComApp();
		user.login()
			.search("Nike Shoes")
				.addtoCart("Nike shoes")
					.doPayment("32442 34324 34242 23423", "324234324434")
						.genrateOrderId()
					    	.logout();
		
		//UC:2
		System.out.println();		
		user.login()
			.search("Macbook")
				.logout();
			
		//UC:3
		System.out.println();
		user.login("admin@gmail.com", "admin")
			.search("Macnook")
				.addtoCart("Macbook")
					.doPayment("45543 45354 32432 24234", "35534533432", 63674)
						.logout();
				
		//UC:4
		System.out.println();
		user.login()
			.logout();
		
	}

}
