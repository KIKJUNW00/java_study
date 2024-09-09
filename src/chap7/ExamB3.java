package chap7;


//Discountable 인터페이스 정의
interface Discountable {
	double getDiscountedPrice(double price);
	double getDiscountAmount(double price);
}

//SeasonalDiscount 클래스: Discountable 인터페이스 구현
class SeasonalDiscount implements Discountable {
	private double discountRate;

	public SeasonalDiscount(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public double getDiscountedPrice(double price) {
		return price * (1 - discountRate); // 할인 후 가격 반환
	}

	@Override
	public double getDiscountAmount(double price) {
		return price * discountRate;
	}
}


//Item 클래스
abstract class Item3 {
	private String name;
	private double price;
	private int stockQuantity;

	public Item3(String name, double price, int stockQuantity) {
		super();
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	// 재고 감소 메소드
	public void reduceStock(int quantity) {
//       quantities 주문제품 수량
		if (stockQuantity < quantity) {
			System.out.println("재고가 없습니다.");
		} else {
			stockQuantity -= quantity;
		}
	}

	// 접근자 메소드
	public String getName() {
		return name;

	}

	public double getPrice() {
		return price;
	}


}

//Electronics 클래스 (Item 클래스를 상속)
class Electronics2 extends Item3 {
	int madeYear;

	// 생성자를 Item 클래스를 생성자를 사용하여 구현, this를 사용
	public Electronics2(String name, double price, int stockQuantity, int madeYear) {
		super(name, price, stockQuantity);
		this.madeYear = madeYear;
	}

	
	public int getMadeYear() {
		return madeYear;
	}

}

//Clothing 클래스 (Item 클래스를 상속)
class Clothing2 extends Item3 {
	private int size;


	public Clothing2(String name, double price, int stockQuantity, int size) {
		super(name, price, stockQuantity);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}

//Customer 추상 클래스 정의
abstract class Customer3 {
	private String cname;


	public Customer3(String cname) {
		this.cname = cname;

	}

	abstract double applyDiscount(double totalAmount);

	@Override
	public String toString() {
		return "고객: " + cname;
	}

}

//RegularCustomer 클래스: Customer 클래스를 상속받음
class RegularCustomer2 extends Customer3 {
	static final double REGULARDISCOUNT_RATE = 0.03;

	public RegularCustomer2(String cname) {
		super(cname);
	}

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount * (1 - REGULARDISCOUNT_RATE);
	}

}

//PremiumCustomer 클래스: Customer 클래스를 상속받음
class PremiumCustomer2 extends Customer3 {

	static final double PREMIUMDISCOUNT_RATE = 0.1;

	public PremiumCustomer2(String cname) {
		super(cname);
	}

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount * (1 - PREMIUMDISCOUNT_RATE);
	}

}

//Order 클래스
class Order3 extends SeasonalDiscount {
	private final int N = 20;
	private Customer3 customer; // 고객명
	private Item3[] items;      // 주문 제품들
	private int[] quantities;  // 주문 제품 수량들
	private String[] orderDates; // 주문일자들 
	private int count;
	private Discountable discount;
	
	public Order3(Customer3 customer, Discountable discount, int capacity) {
		super(0.05);
		this.customer = customer;
		this.items = new Item3[capacity];
		this.quantities = new int[capacity]; // 배열 초기화
		this.orderDates = new String[capacity]; // 배열 초기화
		this.count = 0; // 초기값 설정
		this.discount = discount;
	}


	// 아이템 추가 메소드
	public void addItem3(Item3 item, int orderQuantity, String date) {
		// 주문 가능한 최대 아이템 개수를 초과하지 않았는지 확인
		if (count < items.length) {
			items[count] = item;
			quantities[count] = orderQuantity;
			orderDates[count] = date;
			item.reduceStock(orderQuantity);
			count++;
		} else {
			System.out.println("더 이상 상품을 추가할 수 없습니다.");
		}
	}

	// 총액 계산 메소드
	public double calculateTotal() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			total += items[i].getPrice() * quantities[i];
		}
		return total;
	}

	// 총액 할인 계산
	public double calculateDiscountedTotal() {
		double total = calculateTotal();
		return customer.applyDiscount(total);
	}

	// 주문 요약 출력 메소드
	public void printOrderSummary() {
		System.out.println(customer + "\n주문 요약:");
		for (int i = 0; i < count; i++) {
			System.out.println("- " + items[i].getName() + " x " + quantities[i] + ": W" + items[i].getPrice());
		}
//		System.out.println("총액: W" + calculateTotal());
	}

	public void printDiscountDetails() {
		System.out.println("할인내역: ");
		for (int i = 0; i < count; i++) {
			double originalPrice = items[i].getPrice();
			double seasonalDiscountAmount = discount.getDiscountAmount(originalPrice);
			double discountedPrice = discount.getDiscountedPrice(originalPrice);
			double customerDiscountAmount = originalPrice - discountedPrice;

			System.out.println("- " + items[i].getName() + ": 원래 가격 W" + originalPrice
					+ ", 시즌 할인 금액 W" + seasonalDiscountAmount
					+ ", 고객 할인 금액 W" + customerDiscountAmount
					+ ", 할인 후 가격 W" + discountedPrice);
		}
		System.out.println("할인되어 지불해야 하는 금액: W" + calculateDiscountedTotal());
		System.out.println("=".repeat(100));
		
	}
}

	public class ExamB3 {
		public static void main(String[] args) {
			// 아이템 생성
			// 배열에 전자제품과 의류패션 객체 추가
			Item3 note = new Electronics2("노트북", 1500, 24, 23);
			Item3 clothe = new Clothing2("티셔츠", 50, 50, 95);

			// 고객 생성
			Customer3 regularCustomer = new RegularCustomer2("홍길동");
			Customer3 premiumCustomer = new PremiumCustomer2("강감찬");

			// 할인 정책 생성 (20% 계절 할인)
			Discountable seasonalDiscount = new SeasonalDiscount(0.2);
			
			// 주문 생성 및 계산 (RegularCustomer)
			Order3 regularOrder = new Order3(regularCustomer, seasonalDiscount, 10);
			regularOrder.addItem3(note, 1, "240901");
			regularOrder.addItem3(clothe, 2, "240902");

			regularOrder.printOrderSummary();
			regularOrder.printDiscountDetails(); // 할인된 내역 출력

			// 주문 생성 및 계산 (PremiumCustomer)
			Order3 premiumOrder = new Order3(premiumCustomer, seasonalDiscount, 10);
			premiumOrder.addItem3(note, 1, "240901");
			premiumOrder.addItem3(clothe, 2, "240903");

			premiumOrder.printOrderSummary();
			premiumOrder.printDiscountDetails(); // 할인된 내역 출력

		}
	}
