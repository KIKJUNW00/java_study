package chap7;

import java.time.LocalDate;

class Item { // 제품
	private String name; // 제품명
	private double price; // 제품 가격
	private int stockQuantity; // 재고량

	// 생성자
	public Item(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	// 재고 감소 메소드
	public void reduceStock(int quantity) {
//		quantities 주문제품 수량
		if (stockQuantity < quantity) {
			System.out.println("재고가 없습니다.");
		}else {
			stockQuantity -= quantity;
		}
	}

	// 재고 증가 메소드
	public void increaseStock(int quantity) {
		stockQuantity += quantity;
	}

	// 정보 출력 메소드
	public void show() {
		System.out.println("name: "+name+"\t"+"price: "+price+"\t"+"stockQuantity: "+stockQuantity);
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", stockQuantity=" + stockQuantity + "]";
	}

	// 접근자 메소드
	public String getName() {
		return name;
		
	}

	public double getPrice() {
		return price;
	}
	
	public int getStockQuantity() {
        return stockQuantity;
    }
}

class Customer {
	private String cname;
	private String city;
	private int age;

	// 생성자
	public Customer(String cname, String city, int age) {
		this.cname = cname;
		this.city = city;
		this.age = age;
	}

	// 정보 출력 메소드
	public void show() {
		System.out.println("name: "+cname+"\t"+"city: "+city+"\t"+"age: "+age);
	}

	@Override
	public String toString() {
		return "name=" + cname + ", city=" + city + ", age=" + age;
	}
}

class Order {
	private Customer customer; // 고객
	private Item[] items; // 주문 제품들
	private int[] quantities; // 주문 제품 수량들
	private String[] orderDates;
	private int count; // 아이템 개수

	// 생성자
	 public Order(Customer customer, int maxItems) {
	        this.customer = customer;
	        this.items = new Item[maxItems];
	        this.quantities = new int[maxItems];
	        this.orderDates = new String[maxItems]; 
	        this.count = 0;
	    }

	// 아이템 추가 메소드
	public void addItem(Item item, int orderQuantity) {
		// 주문 가능한 최대 아이템 개수를 초과하지 않았는지 확인
		if (count < items.length) {
            items[count] = item; // items 배열의 현재 인덱스(count)에 제품을 추가
            quantities[count] = orderQuantity; // quantities 배열의 동일한 인덱스에 주문 수량을 저장
            orderDates[count] = LocalDate.now().toString();
            
            item.reduceStock(orderQuantity);  // 재고 감소
            count++;// 다음 아이템을 추가할 때 사용할 인덱스를 가리키도록 count 증가
        }else {
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

	// 주문 요약 출력 메소드
	public void printOrderSummary() {
		System.out.println(customer+"\n");
        for (int i = 0; i < count; i++) {
            System.out.println("name: "+items[i].getName() + ", " +"quantity: "+ quantities[i]+", orderDates: "+orderDates[i]
            		+", "+"stockQuantity: "+ items[i].getStockQuantity());
        }
        System.out.println("total: " + calculateTotal());
        System.out.println("=".repeat(50));
	}
}

public class ExamB1 {
	public static void main(String[] args) {
		// 아이템 생성
		Item laptop = new Item("노트북", 1200.00, 10);
		Item tshirt = new Item("티셔츠", 20.00, 50);
		Item phone = new Item("휴대폰", 800.00, 30);
		Item headphones = new Item("헤드폰", 150.00, 20);
		Item mouse = new Item("마우스", 30.00, 15);

		// 고객 생성
		Customer boy = new Customer("홍길동", "부산", 21);
		Customer girl = new Customer("계백", "양산", 22);

		// 주문 생성
		Order order1 = new Order(boy, 5); // 최대 5개 아이템
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);
		order1.addItem(phone, 1);
		order1.addItem(headphones, 1);
		order1.addItem(mouse, 1);

		order1.printOrderSummary();
		
		Order order2 = new Order(girl,5); // 최대 5개 아이템
		order2.addItem(laptop, 1);
		order2.addItem(tshirt, 1);
		order2.addItem(phone, 1);
		order2.addItem(headphones, 1);
		order2.addItem(mouse, 1);

		// 주문 요약 출력
		order2.printOrderSummary();
		
//		laptop.show();
//		boy.show();

	}
}
