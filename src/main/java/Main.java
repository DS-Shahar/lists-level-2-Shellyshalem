

public class List_lvl2 {

	public static int exe47(Node<int[]>l) {
		int[]a=new int[7];
		
		while(l!=null) {
			int[] x=l.getValue();
			for(int i=0;i<x.length;i++) {
				a[x[i]]++;	
			}
			l=l.getNext();
		}
		int max=0;
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}		
	}
		return max;
	}
	
	public static Node<Character> exe49_1(Node<exe49>l) {
		
		Node<Character>a=new Node<>('1');
		Node<Character>curr=a;
		while(l!=null) {
			exe49 x=l.getValue();
			int num=x.getNum();
			char tav=x.getTav();
			for (int i=0;i<num;i++) {
				Node<Character>c=new Node<>(tav);
				curr.setNext(c);
				curr=c;
			}
			l=l.getNext();
			
		}
		return a.getNext();
	}
	
	
	//list level 2
	
	public static Node<Integer>exe1(Node<Integer>l1, Node<Integer>l2){
		
		Node<Integer>curr1=l1;
		Node<Integer>curr2=l2;
		Node<Integer>first=l2;
		
		Node<Integer>newl=new Node<>(-1);
		
		while(curr1!=null) {
			
			while(curr2!=null) {
				if(curr1.getValue()<=curr2.getValue()) {
					newl.setNext(curr1);
					newl=curr1;
					curr2.setValue(null);
				}
				else {
					curr2.getNext();
				}
			}
			curr2=first;
			curr1.getNext();
		}
		return newl.getNext();
		
	}
	
	public static Node<Integer>exe1_2(Node<Integer>l1, Node<Integer>l2){
		Node<Integer>curr1=l1;
		Node<Integer>curr2=l2;
		
		Node<Integer>newl=new Node<>(-1);
		Node<Integer>h=newl;
		Node<Integer>x;
		
		while(curr1!=null&&curr2!=null) {
		
			if(curr1.getValue()<curr2.getValue()) {
				
				x=new Node<>(curr1.getValue());
				curr1=curr1.getNext();
			}
			
			else {
				x=new Node<>(curr2.getValue());
				curr2=curr2.getNext();
			}	
			h.setNext(x);
			h=x;
		}
		 if (curr1 != null) {
		        while(curr1!=null) {
		        	x=new Node<>(curr1.getValue());
		        	h.setNext(x);
		        	h=x;
		        	curr1=curr1.getNext();
		        }
		    }
		 else if (curr2 != null) {
			 while(curr2!=null) {
		        	x=new Node<>(curr1.getValue());
		        	h.setNext(x);
		        	h=x;
		        	curr2=curr2.getNext();	
			 }
		        	}
		
		return newl.getNext();
		
		
	}
	
	//exe2----------------
	
	public static Node<Integer>exe2(Node<Integer>lst){
		Node<Integer>curr=lst;
		Node<Integer>curr2=lst;
		
		Node<Integer>x;

		Node<Integer>newl=new Node<>(-1);
		Node<Integer>h=newl;
		
		int min;
		
		while(curr2!=null) {
			min=curr.getValue();
			
		while(curr!=null) {
			if(curr.getValue()<min) {
				min=curr.getValue();
			}
			curr=curr.getNext();
		}
		x=new Node<>(min);
		newl.setNext(x);
		newl=x;
		lst=del(lst,min);
		curr2=lst;
		curr=lst;
		
	}
	return h.getNext();
	}
	

	public static Node<Integer>del(Node<Integer>list, int n){
		Node<Integer>x;
		x=list;
		if(x.getValue()==n) {
			return x.getNext();
		}
		while(x.hasNext()) {
			if(x.getNext().getValue()==n) {
				x.setNext(x.getNext().getNext());
				return list;
			}
			x=x.getNext();
		}
		return list;
	}
	
	public static int q3(Node <Integer> header, int num)
	{
		Node <Integer> current = header;
		
		int firstAppearance = -1;
		int lastAppearance = -1;
		int index = 0;
		
		while (current != null)
		{
			if (current.getValue() == num)
			{
				if (firstAppearance == -1)
				{
					firstAppearance = index ;
				}
				lastAppearance = index;
			}
			current = current.getNext();
			index ++;
			
		}
		if (firstAppearance == -1)
		{
			return -1;
		}
		
		int len = index;
		int distanceFromStart = firstAppearance;
		int distanceFromEnd = len- 1 - lastAppearance;
		
		int sum = distanceFromStart + distanceFromEnd ;
		
		return sum;
	}

	public static boolean exe4(Node<Integer>lst) {
		Node<Integer>curr1=lst;
		Node<Integer>curr2=curr1.getNext();
		
		while(curr1!=null) {
			while(curr2!=null) {
				
			
			if(curr1.getValue()==curr2.getValue()) {
				return false;
			}
			curr2=curr2.getNext();
			}
			curr1=curr1.getNext();
			}
		return true;
		}
	
	
	public static Node <Integer> q5(Node <Integer> header)
	{
		Node <Integer> current = header;
		Node <Integer> check ;
		
		Node <Integer> a1 = new Node <>(null); 
		Node <Integer> a2 = a1; 
		Node <Integer> a3 ;
		
		boolean flag ;
		
		while(current != null)
		{
			check = a1.getNext();
			flag = false;
			while (check != null) 
			{
                if (current.getValue() == check.getValue()) {
                	flag = true;
                	break ;
                }
                check = check.getNext();
            }
			if (flag == false) 
			{
				a3 = new Node <> (current.getValue()); 
				a2.setNext(a3);
				a2 = a3;
	        }
            current = current.getNext();
		}
		
		return a1.getNext();
	}

	public static void main(String[] args) {
		//exe47-------------------
		int[]a1= {1,4};
		Node<int[]>l1=new Node<>(a1);
		
		int[]a2= {4,5};
		Node<int[]>l2=new Node<>(a1);
	
		int[]a3= {3,6};
		Node<int[]>l3=new Node<>(a1);
	
		int[]a4= {6,4};
		Node<int[]>l4=new Node<>(a1);
	
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		
		//System.out.println(exe47(l1));
		
		//exe49-----------------
		exe49 x1=new exe49(2,'s');
		Node<exe49>z1=new Node<>(x1);
		
		exe49 x2=new exe49(1,'h');
		Node<exe49>z2=new Node<>(x2);
		
		exe49 x3=new exe49(3,'e');
		Node<exe49>z3=new Node<>(x3);
		
		exe49 x4=new exe49(5,'l');
		Node<exe49>z4=new Node<>(x4);
		
		z1.setNext(z2);
		z2.setNext(z3);
		z3.setNext(z4);
		//System.out.println(exe49_1(z1));
		
		
	
	
	//exe1------------------------
	Node<Integer>f1=new Node<>(1);
	Node<Integer>f2=new Node<>(2);
	Node<Integer>f3=new Node<>(2);
	Node<Integer>f4=new Node<>(8);

	f1.setNext(f2);
	f2.setNext(f3);
	f3.setNext(f4);
	Node<Integer>d1=new Node<>(3);
	Node<Integer>d2=new Node<>(4);
	Node<Integer>d3=new Node<>(7);
	d1.setNext(d2);
	d2.setNext(d3);
	
	//System.out.println(exe1_2(f1,d1));
	//exe2-------------------
	Node<Integer>q1=new Node<>(3);
	Node<Integer>q2=new Node<>(1);
	Node<Integer>q3=new Node<>(2);
	Node<Integer>q4=new Node<>(4);
	q1.setNext(q2);
	q2.setNext(q3);
	q3.setNext(q4);
	//System.out.println(exe2(q1));
	
	//exe4----------------------
	System.out.println(exe4(q1));


	

	
	
	}

	}


