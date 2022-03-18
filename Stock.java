public class Stock {
    String stockSymb;
    String stockName;
    double previousClosingPrice;
    double currentPrice;

    Stock(String stockSymbIn, String stockNameIn) {
        stockSymb = stockSymbIn;
        stockName = stockNameIn;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public static void main(String[] args) {
        Stock stk1 = new Stock("ORCL", "Oracle");
        stk1.currentPrice = 34.35;
        stk1.previousClosingPrice = 34.5;

        System.out.println("The price-change percentage: " + stk1.getChangePercent() + "%");
    }
}