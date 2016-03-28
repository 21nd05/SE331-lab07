package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.ShoppingCart;

import java.util.Date;
import java.util.List;

public interface ShoppingCartService {
    ShoppingCart findById(Long id);
    List<ShoppingCart> getShoppingCarts();
    List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate);
    ShoppingCart addShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart);
}
