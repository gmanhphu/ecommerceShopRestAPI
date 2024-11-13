package giangma.ca.nov2024.service.cart;

import giangma.ca.nov2024.model.Cart;

import java.math.BigDecimal;
public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();
}