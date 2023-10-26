
public class Anagram {
	
	public static void main(String[] args) {
		
		String[] a= {"no","on","is"};
		//System.out.println();
		String b="";
		String c="hello";
		//System.out.println();
		int temp=0;
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j=0;j<a.length ;j++)
		    {
				
		    	char[] c1 = a[i].toCharArray();
			    char[] c2 = a[j].toCharArray();
		    	
			    int count=0;
			    for(int k=0; k<c1.length; k++)
		    	{
		    		for(int n=0;n<c2.length;n++)
		    		{
		    			if(c1[k]==c2[n])
			    		{
			    			count++;
			    		}
		    		}
		    		if(b.split(" ").length <a.length)
		    		{
		    		if(a[i].length()==count)
	    			{
	    				b=b+a[j] +" ";
	    			}
		    		
		    		}
		    		
		    	}
		    
		    }
		 }
		System.out.println(b);
			//System.out.println(c);
		
	
//		int count=0;
//		
//		if(c1.length==c2.length)
//		{
//			for(int i=0;i<c1.length;i++)
//			{
//				for(int j=0;j<c2.length;j++)
//				{
//					if(c1[i]==c2[j])
//					{
//						count++;
//					}
//				}
//			}
//		}
//		
//		System.out.println(count);
//		if(count==c1.length)
//		{
//			System.out.println("anagram");
//		}
//		else
//		{
//			System.out.println("not anagram");
//		}
//		
		
	}

}
