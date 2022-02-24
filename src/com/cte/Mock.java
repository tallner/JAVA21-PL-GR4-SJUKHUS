package com.cte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Mock {
   // public static Collection<Patient> Customers = new ArrayList<>();

    public static void loadPatientAndEmployees(){
        /*var c1 = new Customer("FirstName1", "LastName1", 19990101);
        var c2 = new Customer("FirstName2", "LastName2", 19990202);
        var c3 = new Customer("FirstName3", "LastName3", 19990303);*/


       /* c1.addAccount("credit",1.4F);
        c1.addAccount("credit",1.45F);
        c1.addAccount("credit",1.46F);

        c2.addAccount("credit",1.5F);


        c3.addAccount("credit",1.8F);

        List<Customer> customers = new ArrayList<>(Arrays.asList(c1,c2,c3));

        Customers.addAll(customers);
*/
    }

    public static Hospital initiateMymock(Hospital b1){
        //Creating a mocked datafile
        Mock.loadPatientAndEmployees();
        /*var Customer = Mock.Customers;

        for(var customer : Customer){
            b1.addCustomer(customer.getFirstName(), customer.getLastName(), customer.getSSN());
            int amount = 2;
            for (int i = 0; i < customer.getAccounts().size(); i++) {
                b1.addAccount(
                        customer.getSSN(),
                        customer.getAccounts().get(i).getType(),
                        customer.getAccounts().get(i).getInterestRate());

                b1.deposit(customer.getSSN(),
                        customer.getAccounts().get(i).getAccountNr(),
                        amount = (int) Math.pow(amount,2));
            }
        }*/
        return b1;
    }
}