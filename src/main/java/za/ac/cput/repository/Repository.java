package za.ac.cput.repository;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Delivery;
import za.ac.cput.domain.Items;
import za.ac.cput.domain.Order;
import za.ac.cput.domain.Payment;
import za.ac.cput.domain.Product;
import za.ac.cput.domain.Seller;

import java.util.HashMap;
import java.util.Map;

public class Repository {


    private final Map<String, Customer> customerDatabase = new HashMap<>();


    private final Map<Integer, Delivery> deliveryDatabase = new HashMap<>();


    private final Map<Integer, Items> itemsDatabase = new HashMap<>();


    private final Map<Integer, Order> orderDatabase = new HashMap<>();


    private final Map<Integer, Payment> paymentDatabase = new HashMap<>();


    private final Map<Integer, Product> productDatabase = new HashMap<>();


    private final Map<Integer, Seller> sellerDatabase = new HashMap<>();


    public Customer createCustomer(String address, String payment) {
        if (address == null || address.isEmpty() || payment == null || payment.isEmpty()) {
            throw new IllegalArgumentException("Address and payment method cannot be empty.");
        }
        if (customerDatabase.containsKey(address)) {
            throw new IllegalArgumentException("Customer with this address already exists.");
        }
        Customer customer = new Customer.Builder()
                .setAddress(address)
                .setPayment(payment)
                .build();
        customerDatabase.put(address, customer);
        return customer;
    }

    public Customer readCustomer(String address) {
        return customerDatabase.getOrDefault(address, null);
    }

    public Customer updateCustomer(String address, String newPayment) {
        if (!customerDatabase.containsKey(address)) {
            throw new IllegalArgumentException("Customer not found.");
        }
        Customer updatedCustomer = new Customer.Builder()
                .setAddress(address)
                .setPayment(newPayment)
                .build();
        customerDatabase.put(address, updatedCustomer);
        return updatedCustomer;
    }

    public boolean deleteCustomer(String address) {
        return customerDatabase.remove(address) != null;
    }


    public Delivery createDelivery(int orderIdentification, String name, String date) {
        Delivery delivery = new Delivery.Builder()
                .setOrderIdentification(orderIdentification)
                .setName(name)
                .setDate(date)
                .build();
        deliveryDatabase.put(orderIdentification, delivery);
        return delivery;
    }

    public Delivery readDelivery(int orderIdentification) {
        return deliveryDatabase.get(orderIdentification);
    }

    public Delivery updateDelivery(int orderIdentification, String newName, String newDate) {
        if (!deliveryDatabase.containsKey(orderIdentification)) {
            throw new IllegalArgumentException("Delivery not found.");
        }
        Delivery updatedDelivery = new Delivery.Builder()
                .setOrderIdentification(orderIdentification)
                .setName(newName)
                .setDate(newDate)
                .build();
        deliveryDatabase.put(orderIdentification, updatedDelivery);
        return updatedDelivery;
    }

    public boolean deleteDelivery(int orderIdentification) {
        return deliveryDatabase.remove(orderIdentification) != null;
    }


    public Items createItems(int orderIdentification, String itemsNames, String itemPrice) {
        Items items = new Items.Builder()
                .setOrderIdentification(orderIdentification)
                .setItemsNames(itemsNames)
                .setItemPrice(itemPrice)
                .build();
        itemsDatabase.put(orderIdentification, items);
        return items;
    }

    public Items readItems(int orderIdentification) {
        return itemsDatabase.get(orderIdentification);
    }

    public Items updateItems(int orderIdentification, String newItemsNames, String newItemPrice) {
        if (!itemsDatabase.containsKey(orderIdentification)) {
            throw new IllegalArgumentException("Items not found.");
        }
        Items updatedItems = new Items.Builder()
                .setOrderIdentification(orderIdentification)
                .setItemsNames(newItemsNames)
                .setItemPrice(newItemPrice)
                .build();
        itemsDatabase.put(orderIdentification, updatedItems);
        return updatedItems;
    }

    public boolean deleteItems(int orderIdentification) {
        return itemsDatabase.remove(orderIdentification) != null;
    }


    public Order createOrder(int orderIdentification, String productDetails, String orderType) {
        Order order = new Order.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(productDetails)
                .setOrderType(orderType)
                .build();
        orderDatabase.put(orderIdentification, order);
        return order;
    }

    public Order readOrder(int orderIdentification) {
        return orderDatabase.get(orderIdentification);
    }

    public Order updateOrder(int orderIdentification, String newProductDetails, String newOrderType) {
        if (!orderDatabase.containsKey(orderIdentification)) {
            throw new IllegalArgumentException("Order not found.");
        }
        Order updatedOrder = new Order.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(newProductDetails)
                .setOrderType(newOrderType)
                .build();
        orderDatabase.put(orderIdentification, updatedOrder);
        return updatedOrder;
    }

    public boolean deleteOrder(int orderIdentification) {
        return orderDatabase.remove(orderIdentification) != null;
    }


    public Payment createPayment(int orderIdentificationNumber, String amount, String cardNumber) {
        Payment payment = new Payment.Builder()
                .setOrderIdentificationNumber(orderIdentificationNumber)
                .setAmount(amount)
                .setCardNumber(cardNumber)
                .build();
        paymentDatabase.put(orderIdentificationNumber, payment);
        return payment;
    }

    public Payment readPayment(int orderIdentificationNumber) {
        return paymentDatabase.get(orderIdentificationNumber);
    }

    public Payment updatePayment(int orderIdentificationNumber, String newAmount, String newCardNumber) {
        if (!paymentDatabase.containsKey(orderIdentificationNumber)) {
            throw new IllegalArgumentException("Payment not found.");
        }
        Payment updatedPayment = new Payment.Builder()
                .setOrderIdentificationNumber(orderIdentificationNumber)
                .setAmount(newAmount)
                .setCardNumber(newCardNumber)
                .build();
        paymentDatabase.put(orderIdentificationNumber, updatedPayment);
        return updatedPayment;
    }

    public boolean deletePayment(int orderIdentificationNumber) {
        return paymentDatabase.remove(orderIdentificationNumber) != null;
    }


    public Product createProduct(int orderIdentification, String productDetails, String productList) {
        Product product = new Product.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(productDetails)
                .setProductList(productList)
                .build();
        productDatabase.put(orderIdentification, product);
        return product;
    }

    public Product readProduct(int orderIdentification) {
        return productDatabase.get(orderIdentification);
    }

    public Product updateProduct(int orderIdentification, String newProductDetails, String newProductList) {
        if (!productDatabase.containsKey(orderIdentification)) {
            throw new IllegalArgumentException("Product not found.");
        }
        Product updatedProduct = new Product.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(newProductDetails)
                .setProductList(newProductList)
                .build();
        productDatabase.put(orderIdentification, updatedProduct);
        return updatedProduct;
    }

    public boolean deleteProduct(int orderIdentification) {
        return productDatabase.remove(orderIdentification) != null;
    }


    public Seller createSeller(int orderIdentification, String sellerName, String contactNumber, String username, String password) {
        Seller seller = new Seller.Builder()
                .setOrderIdentification(orderIdentification)
                .setSellerName(sellerName)
                .setContactNumber(contactNumber)
                .setUsername(username)
                .setPassword(password)
                .build();
        sellerDatabase.put(orderIdentification, seller);
        return seller;
    }

    public Seller readSeller(int orderIdentification) {
        return sellerDatabase.get(orderIdentification);
    }

    public Seller updateSeller(int orderIdentification, String newSellerName, String newContactNumber, String newUsername, String newPassword) {
        if (!sellerDatabase.containsKey(orderIdentification)) {
            throw new IllegalArgumentException("Seller not found.");
        }
        Seller updatedSeller = new Seller.Builder()
                .setOrderIdentification(orderIdentification)
                .setSellerName(newSellerName)
                .setContactNumber(newContactNumber)
                .setUsername(newUsername)
                .setPassword(newPassword)
                .build();
        sellerDatabase.put(orderIdentification, updatedSeller);
        return updatedSeller;
    }

    public boolean deleteSeller(int orderIdentification) {
        return sellerDatabase.remove(orderIdentification) != null;
    }
}
