package com.insureafrica;

import java.util.ArrayList;
import java.util.List;

import com.insureafrica.model.Employee;
import com.insureafrica.service.SearchClient;
import com.insureafrica.userroles.ClaimAnalyst;
import com.insureafrica.userroles.Underwriter;

public class App {
    public static void main(String[] args) {

        // Inheritance, liskov substitution & runtime polymorphism
        Employee underwriter = new Underwriter("Underwriter");
        Employee claimAnalyst = new ClaimAnalyst("Claim Analyst");

        underwriter.earnSalary();
        claimAnalyst.earnSalary();

        System.out.println();

        // Interface segregation
        Underwriter underwriter2 = new Underwriter("Senior Underwriter");
        ClaimAnalyst claimAnalyst2 = new ClaimAnalyst("Senior Claim Analyst");

        underwriter2.searchClient();
        claimAnalyst2.searchClient();

        System.out.println();

        underwriter2.issuePolicy();
        claimAnalyst2.processClaimPayment();

        System.out.println();
        
        List<SearchClient> userroles = new ArrayList<>();
        userroles.add(new Underwriter("underwriting associate"));
        userroles.add(new ClaimAnalyst("Claims associate"));

        for (SearchClient userrole : userroles) {
            userrole.searchClient();
        }
        
    }
}
