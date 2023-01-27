package java9recipes.chapter7.map;

import java.util.*;
import java.util.stream.Collectors;

public class StockPortfolio1 {
    Map<String, Stock> portfolio = new HashMap<>();
    public void summary() {
        System.out.println("==Legacy technique for traversing Map.Entry==");
        for (Map.Entry<String, Stock> entry : portfolio.entrySet()) {
            System.out.println("Stock = " + entry.getKey() + ", Shares = " + entry.getValue().getShares());
        }

        System.out.println("==Utilization of new foreach and lambda combination==");
        portfolio.forEach((k,v)->System.out.println("Stock = " + k + ", Shares = " + v.getShares()));
    }

    /**
     * Utilize for loop to traverse Map keys and apply filter to obtain desired
     * stocks
     * @return
     */
    public List<Stock> alertListLegacy() {
        System.out.println("==Legacy technique for filtering and collecting==");
        List<Stock> alertList = new ArrayList<>();
        for (Stock stock : portfolio.values()) {
            if (!StockScreener.screen(stock.getSymbol(), StockScreener.Screen.PE, 20)) {
                alertList.add(stock);
            }
        }

        return alertList;
    }

    /**
     * Utilize stream and filters to obtain desired stocks
     * @return
     */
    public List<Stock> alertList(){
        return
                portfolio.values().stream()
                        .filter(s->!StockScreener.screen(s.getSymbol(), StockScreener.Screen.PE, 20))
                        .collect(Collectors.toList());

    }

    public void remove(List<String> sellList) {
        Iterator<String> keyIter = portfolio.keySet().iterator();
        while (keyIter.hasNext()) {
            if (sellList.contains(keyIter.next())) {
                keyIter.remove();
            }
        }
    }
}
