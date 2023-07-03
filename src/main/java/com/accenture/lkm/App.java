
package com.accenture.lkm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App implements Func
{
	
    public static void main( String[] args )
    {
    	App a=new App();
        List<String> l=new ArrayList<String>();
        l.add("Python");
        l.add("Jave");
        l.add("ASP.NET");
        l.add("Salesforce");
        l.add("Generative AI");
        System.out.println("Original Strings :");
        System.out.println(l);
        System.out.println("Sorted strings :");
        l=a.sortList(l);
        System.out.println(l);
    }

	@Override
	public List<String> sortList(List<String> s) {
		Collections.sort(s);
		return s;
	}
}
