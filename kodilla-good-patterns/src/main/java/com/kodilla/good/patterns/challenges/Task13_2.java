package com.kodilla.good.patterns.challenges;

public class Task13_2 {

    public static void main (String args[]) {

        BuyingRequestRetriever retriever = new BuyingRequestRetriever();
        BuyingRequest request = retriever.retrieve();
        ProductOrderService orderService = new ProductOrderService(new MailService(), new LaczkiBuyingService(), new LaczkiBuyingRepository());
        orderService.process(request);
    }
}
