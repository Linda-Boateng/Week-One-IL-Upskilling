package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.FactoryPattern.plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
A Factory Pattern or Factory Method Pattern says that just define an interface or
abstract class for creating an object
but let the subclasses decide which class to instantiate.
In other words, subclasses are responsible to create the instance of the class.
 */
public class PlanFactory {
    public Plan getPlan(String planType) {
        if(planType == null) {
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }


    public static void main(String[] args) throws IOException {
        PlanFactory planFactory = new PlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();

        System.out.print("Enter the number of units for bill to be calculated: ");

        int units=Integer.parseInt(br.readLine());
        Plan p = planFactory.getPlan(planName);

        System.out.print(STR."Bill amount for \{planName} of  \{units} units is: ");
        p.getRate();
        p.calculateBill(units);

    }

}

