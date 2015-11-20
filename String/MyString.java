class MyString 
{
	//  1.charAt().....
	public char charat(int index,String s)
	{
		char[] ch=s.toCharArray();
		return ch[index];
	}

	// 2.toupper()....
	public String toupper(String s)
	{
		int a;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>96&&ch[i]<124)
			{
				a=ch[i];
				ch[i]=(char)(a-32);
				
			}
		}
		return String.valueOf(ch);
	}
	
	// 3.tolower()....
	public String tolower(String s)
	{
		int a;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>65&&ch[i]<91)
			{
				a=ch[i];
				ch[i]=(char)(a+32);
				
			}
			//System.out.print(ch[i]);

		}
		return String.valueOf(ch);
	}

    //  4.startsWith().... 
	public boolean startswith(String s,String Chk)
	{
		char[] ch=s.toCharArray();
		char[] temp=Chk.toCharArray();
		for(int i=0;i<temp.length;i++)
		{
			if(ch[i]!=temp[i])
			{
				
				return false;		
				
			}
		}
		return true;
	}
	
	//  5.endsWith()....
	public boolean endswith(String s,String Chk)
	{
		char[] ch=s.toCharArray();
		char[] temp=Chk.toCharArray();
		for(int i=temp.length-1,a=ch.length-1;i>=0;i--)
		{
			if(ch[a--]!=temp[i])
				return false;		
				
		}
		return true;
	}
	
	// 6.length()....
	public int stringlength(String s)
	{
		int i;
		char[] ch=s.toCharArray();
		for(i=0;i<ch.length;i++);
		return i;
	}
	
	// 7.isEmpty()....
	public boolean isempty(String s)
	{
		int i;
		char[] ch=s.toCharArray();
		for( i=0;i<ch.length;i++);
		if(i==0)
			return true;
		return false;
	}

	// 8.getByte()....
	public byte[] getbyte(String s)
	{
		int i;
		char[] ch=s.toCharArray();
		byte[] bar=new byte[ch.length];
		for( i=0;i<ch.length;i++)
		{
			bar[i]=(byte)ch[i];
		}
		
		return bar;
	}
	
	// 9.trim()...
	public String trim(String s)
	{
		
		char[] ch=s.toCharArray();
		char[] temp=new char[100];
		int i=0,j=ch.length-1;
		while(true)
		{
			if(ch[i++]!=' ')
				break;
		}
		
		while(true)
		{
			if(ch[j--]!=' ')
				break;
		}
		
		j=j-1+2;
		for(int k=0;k<=j;k++,i++)
			temp[k]=ch[i-1];
		return String.valueOf(temp);
		
	}

	// 10.substring()....
	public String substring(String s,int index)
	{
		char[] ch=s.toCharArray();
		char[] temp=new char[ch.length];
		int len=ch.length-index;
		for(int i=0;i<len;index++,i++)
			temp[i]=ch[index];
		return String.valueOf(temp);
	}

	// 11.substring()...
	public String substring(String s,int startindex,int endindex)
	{
		char[] ch=s.toCharArray();
		char[] temp=new char[ch.length];
		int len=endindex-startindex;
		for(int i=0;i<len;startindex++,i++)
			temp[i]=ch[startindex];
		return String.valueOf(temp);
	}

	// 12.indexOf()...
	public int indexof(String s,char c)
	{
		int i;
		char[] ch=s.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
				break;
		}
		return i;
	}
	
	// 13.indexOf()...
	public int indexof(String s,char c,int startindex)
	{
		int i;
		char[] ch=s.toCharArray();
		for(i=startindex+1;i<ch.length;i++)
		{
			if(ch[i]==c)
				break;
		}
		return i;
	}
	
	// 14.indexOf()...
	public int indexof(String s,String chk)
	{
		
		char[] ch=s.toCharArray();
		char[] temp=chk.toCharArray();
		int flag,j,atposition;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==temp[0])
				{
					atposition=i;
					for(flag=0, j=0;j<temp.length;j++)
					{
						if(ch[i++]!=temp[j])
							break;
						else
							flag++;
					}
					if(flag==temp.length)
						return atposition;
				}
			}
			
		return -1;
	}

	// 15.indexOf()...
	public int indexof(String s,String chk,int index)
	{
		
		char[] ch=s.toCharArray();
		char[] temp=chk.toCharArray();
		int flag,j,atposition;
			for(int i=index+1;i<ch.length;i++)
			{
				if(ch[i]==temp[0])
				{
					atposition=i;
					for( j=0,flag=0;j<temp.length&&i<ch.length;j++)
					{
						if(ch[i++]!=temp[j])
							break;
						else
							flag++;
					}
					if(flag==temp.length)
						return atposition;
				}
			}
			
		return -1;
	}

	// 16.contains()...
	public boolean contains(String s,String chk)
	{
		char[] ch=s.toCharArray();
		char[] temp=chk.toCharArray();
		int flag=0,atposition;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==temp[0])
				{
					atposition=i;
					for(int j=0;j<temp.length;j++)
					{
						if(ch[i++]!=temp[j])
							break;
						else
							flag++;
					}
					if(flag==temp.length)
						return true;
				}
			}
			return false;
		
	}

	// 17.replace()...
	public String replace(String s,char oldchar, char newchar)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==oldchar)
				ch[i]=newchar;
		}
		return String.valueOf(ch);
	}

	// 18.replace()...
	public String replace(String s,String oldchar,String newchar)
	{
		
		int a,j=0;
		int[] index=new int[50];
		char[] ch=s.toCharArray();
		char[] n=newchar.toCharArray();
		char[] temp=new char[200];
		a=indexof(s,oldchar);
		index[j]=a;

		while(a!=-1)
		{
			j++;
			index[j]=a=indexof(s,oldchar,a);
		}
		index[j]=ch.length;
		
		j=0;
		for(int i=0,count=0;i<ch.length;i++)
		{
			if(i<index[j])
			{
				temp[count++]=ch[i];
			}
			if(i==(index[j]+stringlength(oldchar)-1))
			{
				for(int k=0;k<n.length;k++,count++)
				{
					temp[count]=n[k];
				}
				j++;
			}
		}
		return String.valueOf(temp);
	}

	// 19.split()...
	public String[] split(String s,char regex)
	{
		int size=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==regex)
				size++;
		}
		String[] splitstring=new String[size+1];
		int count=0,j,k=0;
		for(int i=0;i<ch.length;i++)
		{
			char[] str=new char[50];
			count++;
			if(ch[i]==regex||i==ch.length-1)
			{
				j=0;
				while(count-->1||i==ch.length-1)
				{
					str[j++]=ch[i-count];
					if(count==0)
						break;
				}
				count=0;
				
				splitstring[k++]=String.valueOf(str);
			}
		}
		return splitstring;
	}
	
	// 20.split()...
	public String[] split(String s,String chk)

	{
		int a,size=0,j=0;
		int[] index=new int[50];
		
		char[] ch=s.toCharArray();
		a=indexof(s,chk);
		index[j]=a;
		while(a!=-1)
		{
			size++;j++;
			index[j]=a=indexof(s,chk,a+1);
		}
		index[j]=ch.length;
		String[] splitstring=new String[size+1];
		j=0;int k=0;char[] str=new char[100];
		for(int i=0;i<ch.length;i++)
		{
			
			if(i<index[j])
			{
				
				str[k++]=ch[i];
			}
		    if(i==(index[j]+stringlength(chk)-1)||i==ch.length-1)
			{
				splitstring[j]=String.valueOf(str);
				j++;k=0;
				str=new char[100];

			}
		}
		return splitstring;
	}
	
	// 21.join()...
	public static String join(String s,String[] args)
	{
		String str="";
		for(int i=0;i<args.length;i++)
		{
			if(i==args.length-1)
			{
				str=str+args[i];
				break;
			}
			str=str+args[i]+s;
		}
		return str;
	}
	public static void main(String[] args) 
	{
		String s="My STRING class";
		String s3="";
		MyString m=new MyString();
		char c=m.charat(3,s);	
		//	char[] ch=s.toCharArray();
		//for(char i:ch)
		System.out.println(c);
		String s1=m.toupper(s);
		System.out.println(s1);
		String s2=m.tolower(s);
		System.out.println(s2);
		System.out.println(m.startswith(s,"My"));
		System.out.println(m.endswith(s,"Class"));
		System.out.println(m.stringlength(s));
		System.out.println(m.isempty(s3));
		byte catchbar[]=m.getbyte(s);
		for(int i=0;i<catchbar.length;i++)
			System.out.print(catchbar[i]+" ");
		System.out.println(m.trim("   i am doing   "));
		System.out.println(m.substring("prolog",2));
		System.out.println(m.substring("prolog",1,4));
		System.out.println(m.indexof(s,'a'));
		System.out.println(m.indexof("prolog",'o',2));
		System.out.println(m.contains(s,"jay"));
		System.out.println(m.indexof(s,"jay"));
		System.out.println(m.indexof("my name is khan, her name is ranjhana","name",21));
		System.out.println(m.replace("amdoneee",'e','a'));
				String[] csplitstring=m.split("i am doing right things",'i');
		for(int i=0;i<csplitstring.length;i++)
			System.out.println(csplitstring[i]);
		String[] ssplitstring=m.split("i am making amplitude","am");
		for(int i=0;i<ssplitstring.length;i++)
			System.out.println(ssplitstring[i]);
		System.out.println(m.replace("my name is khan, her name is ranjhana","name","nam"));
		System.out.println(MyString.join("<' _ '>",new String[]{"Welcome","to","prolog","still daring"}));
	}
}