package com.xworkz.oops.enacapsulation;

public class renaulttester {
public static void main(String []args) {
		
		Renault r = new Renault();
		System.out.println("Adding all data of Renault");
		
		r.setType("public");
		r.setYearfounded(1899);
		r.setNoofsalesoutlet(415);
		r.setNoofserviceworkshop=(475);
		r.setTypesofmodel(4);
		r.setFoundername("louis renault");
		r.setOrigin("France");
		r.setNoofemployees(170000);
		r.setMarketcap(4);
		r.setNetloss(80000);

		
		String type = r.getType();
		int yearfounded = r.getYearfounded();
		int noofsalesoutlet= r.getNoofsalesoutlet();
		int noofserviceoutlet= r.getNoofserviceoutlet();
		int typesofmodel = r.getTypesofmodel();
		String foundername = r.getFoundername();
		String origin = r.getOrigin();
		int noofemployees = r.getNoofemployees();
		int marketcap = r.getMarketcap();
		int netloss= r.getNetloss();
		
		
		System.out.println("Type   \t"+ type);
		System.out.println("Yearfounded       \t"+ yearfounded);
		System.out.println("Noofsalesoutlet         \t"+ noofsalesoutlet);
		System.out.println("Noofserviceworkshop      \t"+ noofserviceworkshop);
		System.out.println("Typesofmodel     \t"+ typesofmodel);
		System.out.println("Foundername         \t"+ foundername);
		System.out.println("Origin    \t"+ origin);
		System.out.println("Netloss \t"+netloss);
		System.out.println("Noofemployees      \t"+noofemployees);
		System.out.println("Marketcap   \t"+marketcap);
		}

}
