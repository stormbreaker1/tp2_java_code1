package abcd;

class CallByReference_tom2{
	
	 int data=100;  
	  
	 void change(CallByReference_tom2 op){
		 
		 // This type of access is possible
		 System.out.println(data+100);
		 
	 op.data=op.data+57;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		
	   // Cannot make a static reference to a non-static field.	 
	   // System.out.println(data);
		 
		 int x = 257;
		 
	   CallByReference_tom2 op=new CallByReference_tom2();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  