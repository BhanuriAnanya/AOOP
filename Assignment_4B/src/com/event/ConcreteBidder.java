package com.event;

public class ConcreteBidder  implements Bidder {
	private String name;
	 public ConcreteBidder(String name) {
	        this.name = name;
	    }



	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		 System.out.println(name + " received notification: " + message);

		
	}

}
