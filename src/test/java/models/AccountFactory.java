package test.java.models;

import com.github.javafaker.Faker;

public class AccountFactory {

    static Faker faker = new Faker();

    public static Account get(){
        return Account.builder()
                .accountName(faker.funnyName().name())
                .fax(faker.cat().name())
                .annualRevenue(faker.animal().name())
                .build();
    }


}
