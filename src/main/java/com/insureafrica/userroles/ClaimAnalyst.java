package com.insureafrica.userroles;

import com.insureafrica.model.Employee;
import com.insureafrica.service.PayClaim;
import com.insureafrica.service.SearchClient;

public class ClaimAnalyst extends Employee implements SearchClient, PayClaim {

    public ClaimAnalyst(String title) {
        super(title);
    }

    @Override
    public void searchClient() {
        System.out.println(this.getTitle() + " has retrieved client information");
    }

    @Override
    public void processClaimPayment() {
       System.out.println(this.getTitle() + " has processed claim payment");
    }
}
