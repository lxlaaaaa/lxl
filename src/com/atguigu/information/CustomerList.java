package com.atguigu.information;

public class CustomerList {
    static Customer[] customers;
    int total;

    public CustomerList() {
    }

    public  CustomerList(int totalCustomer){
        customers =new Customer[totalCustomer];
    }
    
    public boolean addCustomer(Customer customer){
        for (int i = 0; i < customers.length; i++) {
            if(customers[i]==null){
                customers[i]=customer;
                return true;
            }
        }
        return false;
    }

    public boolean replaceCustomer(int index, Customer cust){
        if(index<customers.length){
            customers[index]=cust;
            return true;
        }
        return false;
    }
    
    public boolean deleteCustomer(int index){
        if(index<customers.length){
            customers[index]=null;
            return true;
        }
        return false;
    }
   
    public Customer[] getAllCustomers(){
        Customer[] cust = new Customer[total];
        for (int i = 0; i < total; i++) {
            cust[i]=customers[i];
        }
        return cust;
    }
  
    public Customer getCustomer(int index) {
        Customer customer = new Customer();
        customer = customers[index];
        return customer;
    }

}
