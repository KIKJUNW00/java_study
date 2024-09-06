//package chap7;
//
//import java.time.LocalDate;
//
////Item 클래스
//class Item2 {
//	private String name;
//	private double price;
//	private int stockQuantity;
//
//	public Item2(String name, double price, int stockQuantity) {
//		super();
//		this.name = name;
//		this.price = price;
//		this.stockQuantity = stockQuantity;
//	}
//
//	// 재고 감소 메소드
//	public void reduceStock(int quantity) {
////			quantities 주문제품 수량
//		if (stockQuantity < quantity) {
//			System.out.println("재고가 없습니다.");
//		} else {
//			stockQuantity -= quantity;
//		}
//	}
//
//	// 재고 증가 메소드
//	public void increaseStock(int quantity) {
//		stockQuantity += quantity;
//	}
//
//	// 정보 출력 메소드
//	public void show() {
//		System.out.println("name: " + name + "\t" + "price: " + price + "\t" + "stockQuantity: " + stockQuantity);
//	}
//
//	@Override
//	public String toString() {
//		return "Item [name=" + name + ", price=" + price + ", stockQuantity=" + stockQuantity + "]";
//	}
//
//	// 접근자 메소드
//	public String getName() {
//		return name;
//
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public int getStockQuantity() {
//		return stockQuantity;
//	}
//
//}
//
//// Electronics 클래스 (Item 클래스를 상속)
//class Electronics extends Item2 {
//	private int warranty;// 제품 보증 기간
//
//	// 생성자를 Item 클래스를 생성자를 사용하여 구현, this를 사용
//	public Electronics(String name, double price, int stockQuantity, int warranty) {
//		super(name, price, stockQuantity);
//		this.warranty = warranty;
//	}
//
//	public void show() {
//		System.out.println("name: " + getName() + "\t" + "price: " + getPrice() + "\t" + "stockQuantity: "
//				+ getStockQuantity() + warranty);
//	} // name = ***, price=*** 등으로 출력
//
//	@Override
//	public String toString() {
//		return super.toString();
//	}
//
//}
//
//// Clothing 클래스 (Item 클래스를 상속)
//class Clothing extends Item2 {
//	private String size;
//	private String color;
//
//	public Clothing(String name, double price, int stockQuantity, String size, String color) {
//		super(name, price, stockQuantity);
//		this.size = size;
//		this.color = color;
//	}
//}
//
////Customer 추상 클래스 정의
//abstract class Customer2 {
//	private String cname;
//	private String city;
//	private int age;
//
//	abstract double applyDiscount(double totalAmount);
//
//	public Customer2(String cname, String city, int age) {
//		super();
//		this.cname = cname;
//		this.city = city;
//		this.age = age;
//	}
//
//}
//
//// RegularCustomer 클래스: Customer 클래스를 상속받음
//class RegularCustomer extends Customer2 {
//	static final double REGULARDISCOUNT_RATE = 0.03;
//
//}
//
//// PremiumCustomer 클래스: Customer 클래스를 상속받음
//class PremiumCustomer extends Customer2 {
//	static final double PREMIUMDISCOUNT_RATE = 0.1;
//
//}
//
//// Order 클래스
//class Order2 {
//	private Customer2 customer;
//	private Item2[] items;
//	private int[] quantities;
//	private String[] orderDates;
//	private int itemCount;
//	/*
//	 * Order2(),addItem() calculateTotal(),calculateDiscountedTotal(),
//	 * printOrderSummary()
//	 */
//	public Order2(Customer2 customer, Item2[] items, int[] quantities, int itemCount) {
//		this.customer = customer;
//		this.items = items;
//		this.quantities = quantities;
//		this.itemCount = itemCount;
//	}
//	
//	// 아이템 추가 메소드
//		public void addItem2(Item2 item, int orderQuantity) {
//			// 주문 가능한 최대 아이템 개수를 초과하지 않았는지 확인
//			if (itemCount < items.length) {
//	            items[itemCount] = item; // items 배열의 현재 인덱스(count)에 제품을 추가
//	            quantities[itemCount] = orderQuantity; // quantities 배열의 동일한 인덱스에 주문 수량을 저장
//	            orderDates[itemCount] = LocalDate.now().toString();
//	            
//	            item.reduceStock(orderQuantity);  // 재고 감소
//	            itemCount++;// 다음 아이템을 추가할 때 사용할 인덱스를 가리키도록 count 증가
//	        }else {
//	        	System.out.println("더 이상 상품을 추가할 수 없습니다.");
//	        }
//		}
//		
//		
//
//}
//
//public class ExamB2 {
//	public static void main(String[] args) {
//		// 아이템 생성
//		Item2 laptop = new Electronics("노트북", 1200.00, 10, 2);
//		Item2 tshirt = new Clothing("티셔츠", 20.00, 50, "XL", "RED");
//		Item2 phone = new Electronics("휴대폰", 800.00, 30, 3);
//		Item2 headphones = new Electronics("헤드폰", 150.00, 20, 4);
//		Item2 mouse = new Electronics("마우스", 30.00, 15, 1);
//
//		// 고객 생성
//		Customer2 boy = new PremiumCustomer("홍길동", "부산", 21, 2f);
//		Customer2 girl = new Customer("계백", "양산", 22);
//
//		// 주문 생성
//		Order order1 = new Order(boy, 5); // 최대 5개 아이템
//		order1.addItem(laptop, 1);
//		order1.addItem(tshirt, 2);
//		order1.addItem(phone, 1);
//		order1.addItem(headphones, 1);
//		order1.addItem(mouse, 1);
//
//		// 주문 요약 출력
//		order1.printOrderSummary();
//
//		Order order2 = new Order(girl, 5); // 최대 5개 아이템
//		order2.addItem(laptop, 1);
//		order2.addItem(tshirt, 1);
//		order2.addItem(phone, 1);
//		order2.addItem(headphones, 1);
//		order2.addItem(mouse, 1);
//
//		// 주문 요약 출력
//		order2.printOrderSummary();
//
////		laptop.show();
////		boy.show();
//
//	}
//}
