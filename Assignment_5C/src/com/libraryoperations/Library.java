package com.libraryoperations;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {
	private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
    	books.add(book);
		
	}

	@Override
	public void removeBook(Book book) {
		// TODO Auto-generated method stub
		books.remove(book);
		
	}

	@Override
	public void addMember(Member member) {
		// TODO Auto-generated method stub
		members.add(member);
		
	}

	@Override
	public void removeMember(Member member) {
		// TODO Auto-generated method stub
		members.remove(member);
		public Book findBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    public Member findMember(int memberId) {
	        for (Member member : members) {
	            if (member.getMemberId() == memberId) {
	                return member;
	            }
	        }
	        return null;
	    }
		
	}

}
