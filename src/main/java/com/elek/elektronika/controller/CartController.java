package com.elek.elektronika.controller;

import com.elek.elektronika.dao.entity.Cart;
import com.elek.elektronika.dao.entity.TabletsEntity;
import com.elek.elektronika.model.CartDto;
import com.elek.elektronika.service.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("cart")
public class CartController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap, HttpSession session) {
        modelMap.put("total", total(session));
        return "/cart";
    }

    @Autowired
    private ProductsService productsService;

    private double total(HttpSession session) {
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        double sum = 0.0;
        if (carts != null) {
            for (Cart cart : carts) {
                sum += cart.getQuantity() * cart.getTabletsEntity().getPrice().doubleValue();
                sum += cart.getQuantity() * cart.getMobilEntity().getPrice().doubleValue();
                sum += cart.getQuantity() * cart.getAccessoriesEntity().getPrice().doubleValue();
            }
        }
        return sum;
    }
//.getCartDto(productType).getName().== id

    private int isExits(int id, List<Cart> carts) {
        for (int i = 0; i < carts.size(); i++) {
            if (carts.get(i).getTabletsEntity().getId() == id) {
                return i;
            } else if (carts.get(i).getMobilEntity().getId() == id) {
                return i;
            } else if (carts.get(i).getAccessoriesEntity().getId() == id) {
                return i;
            }
        }
        return -1;
    }

//    @GetMapping("/cart") .get(i).getClothesEntity().getId() == id)
//    public String cart(Model model) {
//        var productEntities = clothesService.getClothesMen();
//        return "cart";
//    }
    @RequestMapping(value = "buy/{id}/{productType}", method = RequestMethod.GET)
    public String buy(@PathVariable("id") int id, @PathVariable("productType") String productType, ModelMap modelMap, HttpServletRequest request) {
        HttpSession session = request.getSession();

        if (session.getAttribute("cart") == null) {

            List<Cart> carts = new ArrayList<Cart>();

            if (productType.equals("tablets")) {
                productsService.getTabletById(id);
                carts.add(new Cart(productsService.getTabletById(id), 1));
                session.setAttribute("cart", carts);
            } else if (productType.equals("mobils")) {
                productsService.getMobilById(id);
                carts.add(new Cart(productsService.getMobilById(id), 1));
                session.setAttribute("cart", carts);
            } else if (productType.equals("accessories")) {
                productsService.getAccessoriesById(id);
                carts.add(new Cart(productsService.getAccessoriesById(id), 1));
                session.setAttribute("cart", carts);
            }

        } else {
            List<Cart> carts = (List<Cart>) session.getAttribute("cart");
            int index = isExits(id, carts);
            if (index == -1) {
                carts.add(new Cart(productsService.getTabletById(id), 1));
            } else if (index == -1) {
                carts.add(new Cart(productsService.getMobilById(id), 1));
            } else if (index == -1) {
                carts.add(new Cart(productsService.getAccessoriesById(id), 1));
            } else {
                int quantity = carts.get(index).getQuantity() + 1;
                carts.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", carts);

        }
        return "redirect:/cart";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String[] quantities = request.getParameterValues("quantity");
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        for (int i = 0; i < carts.size(); i++) {
            carts.get(i).setQuantity(Integer.parseInt(quantities[i]));
        }
        session.setAttribute("cart", carts);
        return "redirect:/cart";

    }

    @RequestMapping(value = "clear", method = RequestMethod.GET)
    public String clear(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        carts.clear();
        session.setAttribute("cart", carts);
        return "redirect:/cart";

    }

    @RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable("id") int id, HttpServletRequest request) {

        HttpSession session = request.getSession();
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        int index = isExits(id, carts);
        carts.remove(index);
        session.setAttribute("cart", carts);
        return "redirect:/cart";

    }

    @RequestMapping(value = "checkout", method = RequestMethod.GET)
    public String checkout(HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        } else {
            return "redirect:/cart";
        }
    }

}
