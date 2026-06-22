package com.learn.interfaces;

public interface PayD {
    public String getCustCardNo();
    public String getCardOwnerName();

    Integer getcVVNo();

    void setcVVNo(Integer cVVNo);

    public String getCardExpMonthDate();
    public Integer getCVVNo();
    public Double getTotalAmount();

    public void setCustCardNo(String custCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonthDate(String cardExpMonthDate);
    public void setCVVNo(Integer cVVNo);
    public void setTotalAmount(Double totalAmount);
}
