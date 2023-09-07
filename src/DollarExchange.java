public class DollarExchange implements Price{

    Double exchange = 95.25;

    public void say_price(Double price) {
        System.out.println("Цена бумаги в долларах: " + Math.round(price/exchange * 100.0)/100.0);
    }

    public void say_course() {
        System.out.println("Курс доллара: " + exchange);
    }
}
