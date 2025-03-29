// Karol G00436758
public class JavaVariables16 {
    public static void main(String[] args) {
        double numberOfShares = 2000, purchasePrice = numberOfShares * 40.00D, commissionBuy = purchasePrice * 0.03, totalPaid = purchasePrice + commissionBuy, sellPrice = 42.75, moneyRecieved = numberOfShares * sellPrice, commissionSell = moneyRecieved * 0.03, earn = moneyRecieved - commissionSell, totalEarn = earn - totalPaid;
        System.out.println("Joe paid $" + purchasePrice + " for the stock.\nJoe paid his broker a commission of $" + commissionBuy + " on the purchase.\nSo, Joe paid a total of $" + totalPaid + ".\n");
        System.out.println("Joe sold the stock for $" + moneyRecieved + "\nJoe paid his broker a commission of $" + commissionSell + " on the sale.\nSo, Joe recieved a total of $" + earn + ".\n");
        System.out.println("Joe's profit or loss: $" + totalEarn + ".");

    }
}
