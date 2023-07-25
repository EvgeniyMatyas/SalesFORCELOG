package test.java.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Account {
    String accountName;
    String webSite;
    String type;
    String industry;
    String phone;
    String fax;
    String employees;
    String annualRevenue;
    String billingCity;
    String billingZip_PostalCode;
    String billingState_Province;
    String billingCountry;
    String shippingCity;
    String shippingZip_PostalCode;
    String shippingState_Province;
    String shippingCountry;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingAddress;
    String shippingAddress;


}

