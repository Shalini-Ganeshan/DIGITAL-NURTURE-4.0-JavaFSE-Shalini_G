public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStock("TCS", 3510.50);
        market.setStock("INFY", 1425.75);

        market.removeObserver(web);
        market.setStock("WIPRO", 510.30);
    }
}
