/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.ItemCatalogue.Items;
//import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ameya
 */
public class Orders {
//    Faker faker = new Faker();
    private int orderID;
    private String status;
    private String enterpriseName;
    private String customerName;
    private ArrayList<Items> orderlist;
    private int totalprice;
    private String customerAddress;
    private String enterpriseAddress;
    private String DeliveryManName;
    private String DeliveryPhone;
    

    public Orders(String enterpriseName, String customerName, ArrayList<Items> orderlist, int totalprice, String customerAddress, String enterpriseAddress) {
        this.enterpriseName = enterpriseName;
        this.customerName = customerName;
        this.orderlist = orderlist;
        this.totalprice = totalprice;
        this.customerAddress = customerAddress;
        this.enterpriseAddress = enterpriseAddress;
        this.status = "New Order";
        this.orderID = gen();//(int) faker.number().randomNumber(5, true);
        
    }
    
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public String getDeliveryPhone() {
        return DeliveryPhone;
    }

    public void setDeliveryPhone(String DeliveryPhone) {
        this.DeliveryPhone = DeliveryPhone;
    }
    
    public String getDeliveryManName() {
        return DeliveryManName;
    }

    public void setDeliveryManName(String DeliveryManName) {
        this.DeliveryManName = DeliveryManName;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Items> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Items> orderlist) {
        this.orderlist = orderlist;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }
    
    
    
}
