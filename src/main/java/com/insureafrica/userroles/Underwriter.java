package com.insureafrica.userroles;

import com.insureafrica.model.Employee;
import com.insureafrica.service.IssuePolicy;
import com.insureafrica.service.SearchClient;

public class Underwriter extends Employee implements SearchClient, IssuePolicy{

    public Underwriter(String title) {
        super(title);
    }

    @Override
    public void searchClient() {
        System.out.println(this.getTitle() + " has retrieved client information");
    }    

    @Override
    public void issuePolicy() {
        System.out.println(this.getTitle() + " has issued a policy");
    }


    
}
