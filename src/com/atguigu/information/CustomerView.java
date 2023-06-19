package com.atguigu.information;

import java.util.Arrays;

public class CustomerView {


    public static void main(String[] args) {
        boolean loopflag = true;
        CustomerView customerView = new CustomerView();
        CustomerList customerList = new CustomerList(10);
        while (loopflag){
            customerView.enterMainMenu(customerList);
        }
    }
    public void enterMainMenu(CustomerList customerList){
        System.out.println("-------------客户信息管理软件---------------");
        System.out.println("                1 添加客户");
        System.out.println("                2 修改客户");
        System.out.println("                3 删除客户");
        System.out.println("                4 客户列表");
        System.out.println("                5 退   出");
        System.out.print("请选择（1-5）：");
        char c = CMUtility.readMenuSelection();
        if(c == '1'){
            new CustomerView().addNewCustomer(customerList);
        }
        else if(c == '2'){
            new CustomerView().modifyCustomer();
        }
        else if(c == '3'){
            new CustomerView().deleteCustomer();
        }
        else if(c == '4'){
            new CustomerView().listAllCustomers();
        }
        else if(c == '5'){
           return;
        }
    }
    private void addNewCustomer(CustomerList customerList){
        Customer customer = new Customer();
        System.out.println("---------------添加客户---------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(100);
        customer.setName(name);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        customer.setGender(gender);
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        customer.setAge(age);
        System.out.println("电话：");
        String phone = CMUtility.readString(100);
        customer.setPhone(phone);
        System.out.println(" 邮箱：");
        String email = CMUtility.readString(100);
        customer.setEmail(email);
        boolean b = customerList.addCustomer(customer);
        if(b){
            System.out.println("---------------添加完成---------------");
        }
        else {
            System.out.println("---------------添加失败---------------");
        }

    }
    private void modifyCustomer(){
        System.out.println("---------------修改客户---------------");
        System.out.println("请选择待修改客户编号(-1退出)：");
        int i = CMUtility.readInt();
        if(i==-1){
            return;
        }

    }
    private void deleteCustomer(){}
    private void listAllCustomers(){}


}
