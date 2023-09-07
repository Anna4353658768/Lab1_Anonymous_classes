public class DollarExchangeAnonymous {

    public static void main(String[] args) {

        Double prise = 1004.42;

        System.out.println("Цена ценной бумаги в рублях: " + prise);

        DollarExchangeAnonymous myEx = new DollarExchangeAnonymous();
        myEx.sayPrice(prise);
    }

    public void sayPrice(Double prise) {
        Price dl = new DollarExchange();

        Price el = new Price(){
            final Double exchange = 105.23;
            public void say_price(Double price) {
                System.out.println("Цена бумаги в евро: " + Math.round(price/exchange * 100.0)/100.0);
            }
            public void say_course() {
                System.out.println("Курс евро: " + exchange);
            }
        };

        dl.say_course();
        dl.say_price(prise);
        el.say_course();
        el.say_price(prise);
    }
}
