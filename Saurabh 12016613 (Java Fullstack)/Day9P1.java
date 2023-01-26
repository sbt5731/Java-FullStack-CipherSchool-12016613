package com.saurabhjava;

class PhonePay{
    private float serviceCharge = 0.5f;

    public float getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(float newServiceCharge) {

        if(newServiceCharge <0.05f){
            System.out.println("Service charge cant be less than 5%");
            return;
        }
        serviceCharge = newServiceCharge;
    }
}

public class Day9P1 {
    void pay(int bill){
        PhonePay phonePay=new PhonePay();

        phonePay.setServiceCharge(0.01f);
        float phonePayCharge = bill * phonePay.getServiceCharge();
        float finalAmount = bill+phonePayCharge;
        System.out.println(String.format("BIll %s, PhonePay Service Charge is %s, final Amount is %s",bill,phonePayCharge,finalAmount));
    }
}
