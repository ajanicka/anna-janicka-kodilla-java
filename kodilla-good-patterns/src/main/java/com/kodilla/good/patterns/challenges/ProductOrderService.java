package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private ProductInformationService productInformationService;
    private BuyingService buyingService;
    private BuyingRepository buyingRepository;

    public ProductOrderService(final ProductInformationService productInformationService,
                           final BuyingService buyingService,
                           final BuyingRepository buyingRepository) {
        this.productInformationService = productInformationService;
        this.buyingService = buyingService;
        this.buyingRepository = buyingRepository;
    }

    public BuyingDto process(final BuyingRequest buyingRequest) {
        boolean isBought = buyingService.buy(buyingRequest.getBuyingUser());

        if(isBought) {
            productInformationService.inform(buyingRequest.getBuyingUser());
            buyingRepository.createOrder(buyingRequest.getBuyingUser());
            return new BuyingDto(buyingRequest.getBuyingUser(), true);
        } else {
            return new BuyingDto(buyingRequest.getBuyingUser(), false);
        }
    }
}
