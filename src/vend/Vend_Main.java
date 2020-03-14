package vend;

import java.awt.GridLayout;
import javax.swing.BorderFactory;

/**
 * 
 * @author Kaish Panjwani
 * @version 23-11-2019
 *
 */

public class Vend_Main {
	
	// Declaring TextFields Object
	static TextFields screen = new TextFields("Enter the Product ID of the Item you want to purchase.");
	
	public static void main(String[] args) {
		
		// Creating a Button Panel
		Panels bpanel = new Panels("Button Panel");
		bpanel.setLayout(new GridLayout(5,5,5,5));
		bpanel.setBorder(BorderFactory.createEmptyBorder(40, 10, 40, 10));
		
		// Creating a Product Panel
		Panels ppanel = new Panels("Product Panel");
		ppanel.setLayout(new GridLayout(4, 4));
		ppanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 10));
		
		// Creating a Checkout Panel
		Panels cpanel = new Panels("Checkout Panel");
		cpanel.setLayout(new GridLayout(11,1,5,5));
		cpanel.setBorder(BorderFactory.createEmptyBorder(40, 10, 40, 40));
		
		
		// Creating Labels Instances
		Labels A0 = new Labels("A0");
		Labels A1 = new Labels("A1");
		Labels A2 = new Labels("A2");
		Labels A3 = new Labels("A3");
		Labels B0 = new Labels("B0");
		Labels B1 = new Labels("B1");
		Labels B2 = new Labels("B2");
		Labels B3 = new Labels("B3");
		Labels C0 = new Labels("C0");
		Labels C1 = new Labels("C1");
		Labels C2 = new Labels("C2");
		Labels C3 = new Labels("C3");
		Labels D0 = new Labels("D0");
		Labels D1 = new Labels("D1");
		Labels D2 = new Labels("D2");
		Labels D3 = new Labels("D3");
		Labels cash = new Labels("CASH");
		Labels checkout = new Labels("CHECKOUT");
		
		// Creating Buttons Instances
		Buttons bA = new Buttons("A");
		Buttons bB = new Buttons("B");
		Buttons bC = new Buttons("C");
		Buttons bD = new Buttons("D");
		Buttons b1 = new Buttons("1");
		Buttons b2 = new Buttons("2");
		Buttons b3 = new Buttons("3");
		Buttons b4 = new Buttons("4");
		Buttons b5 = new Buttons("5");
		Buttons b6 = new Buttons("6");
		Buttons b7 = new Buttons("7");
		Buttons b8 = new Buttons("8");
		Buttons b9 = new Buttons("9");
		Buttons b0 = new Buttons("0");
		Buttons cancel = new Buttons("CANCEL");
		
		Buttons credit = new Buttons("CREDIT");
		Buttons nickel = new Buttons("Nickel (5c)");
		Buttons dime = new Buttons("Dime (10c)");
		Buttons quarter = new Buttons("Quarter (25c)");
		Buttons one_dollar = new Buttons("One Dollar ($1)");
		Buttons five_dollar = new Buttons("Five Dollar ($5)");
		Buttons ten_dollar = new Buttons("Ten Dollar ($10)");
		Buttons finalize = new Buttons("Finalize Payment");
		
				
		// Declaring Listeners Object
		Listeners b_li = new Listeners("");
		Listeners.CancelButtonListener bcancel_li = b_li.new CancelButtonListener();
		Listeners.CreditButtonListener bcredit_li = b_li.new CreditButtonListener();
		Listeners.NickelButtonListener bnickel_li = b_li.new NickelButtonListener();
		Listeners.DimeButtonListener bdime_li = b_li.new DimeButtonListener();
		Listeners.QuarterButtonListener bquarter_li = b_li.new QuarterButtonListener();
		Listeners.OneBillButtonListener bonebill_li = b_li.new OneBillButtonListener();
		Listeners.FiveBillButtonListener bfivebill_li = b_li.new FiveBillButtonListener();
		Listeners.TenBillButtonListener btenbill_li = b_li.new TenBillButtonListener();
		Listeners.FinalizeButtonListener bfin_li = b_li.new FinalizeButtonListener();
		
		
		// Adding ActionListeners to Buttons		
		bA.addActionListener(b_li);
		bB.addActionListener(b_li);
		bC.addActionListener(b_li);
		bD.addActionListener(b_li);
		b1.addActionListener(b_li);
		b2.addActionListener(b_li);
		b3.addActionListener(b_li);
		b4.addActionListener(b_li);
		b5.addActionListener(b_li);
		b6.addActionListener(b_li);
		b7.addActionListener(b_li);
		b8.addActionListener(b_li);
		b9.addActionListener(b_li);
		b0.addActionListener(b_li);
		
		cancel.addActionListener(bcancel_li);
		credit.addActionListener(bcredit_li);
		nickel.addActionListener(bnickel_li);
		dime.addActionListener(bdime_li);
		quarter.addActionListener(bquarter_li);
		one_dollar.addActionListener(bonebill_li);
		five_dollar.addActionListener(bfivebill_li);
		ten_dollar.addActionListener(btenbill_li);
		finalize.addActionListener(bfin_li);
		
		
		// Adding Labels to Product Panel
		ppanel.add(A0);
		ppanel.add(A1);
		ppanel.add(A2);
		ppanel.add(A3);
		ppanel.add(B0);
		ppanel.add(B1);
		ppanel.add(B2);
		ppanel.add(B3);
		ppanel.add(C0);
		ppanel.add(C1);
		ppanel.add(C2);
		ppanel.add(C3);
		ppanel.add(D0);
		ppanel.add(D1);
		ppanel.add(D2);
		ppanel.add(D3);
		
		
		// Adding Buttons to Button Panel
		bpanel.add(bA);
		bpanel.add(bB);
		bpanel.add(bC);
		bpanel.add(bD);
		bpanel.add(b1);
		bpanel.add(b2);
		bpanel.add(b3);
		bpanel.add(b4);
		bpanel.add(b5);
		bpanel.add(b6);
		bpanel.add(b7);
		bpanel.add(b8);
		bpanel.add(b9);
		bpanel.add(b0);
		bpanel.add(cancel);
		
				
		// Adding Buttons to Checkout Panel
		cpanel.add(checkout);
		cpanel.add(screen);
		cpanel.add(credit);
		cpanel.add(cash);
		cpanel.add(nickel);
		cpanel.add(dime);
		cpanel.add(quarter);
		cpanel.add(one_dollar);
		cpanel.add(five_dollar);
		cpanel.add(ten_dollar);
		cpanel.add(finalize);
		
		
		// Setting up the Main Frame
		final Frames vend = new Frames("Vend-O-Matic"); // Creating a Frames Object
		vend.setSize(1200, 786); // Setting Size of Frame
		vend.setLayout(new GridLayout(1,2));
		vend.setDefaultCloseOperation(Frames.EXIT_ON_CLOSE); // Setting up default action when exit button is clicked
		vend.setVisible(true); // Frame is now Visible
	    vend.add(ppanel); // Adding Product Panel to A05Frames
	    vend.add(bpanel); // Adding Button Panel to A05Frames
	    vend.add(cpanel); // Adding Checkout Panel to A05Frames
	}
}

