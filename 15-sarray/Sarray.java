public class Sarray {
     int[] data;
     int   last;
    
    public Sarray(int[] stuff) {
        // set up the initial instance variables
        data = stuff;
	//int[0]=1;
	//	int[1]=52;
	for (int x=0;x<data.length;x++){
	    if (data[x]==0){
		last=x-1;
		break;
	    }
	}
    }
    public void lastcheck(){
      	for (int x=0;x<data.length;x++){
	    if (data[x]==0){
		last=x-1;
		break;
	    }}
    }
    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true
	lastcheck();
	if (last==(data.length-1)){
	    int[] result = new int[data.length+1];
	    for (int x=0;x<data.length;x++){
		result[x]=data[x];
	    }
	    result[data.length]=i;
	    data=result;
	}
	else data[last+1]=i;
	return true;
	
    }
    
    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
	int[] result= new int[data.length+1];
        for (int x=0;x<index;x++){
	    result[x]=data[x];
	}
	result[index]=i;
	for (int x=index; x<data.length;x++){
	    result[x+1]=data[x];
	}
	data=result;
    }
    
    public int size() {
        // returns the number of items in the list (not the array size)
	int counter=0;
	for (int x=0;x<data.length;x++){
	    if(data[x]!=0){
		counter++;
	    }
	}
	return counter;
    }
    
    public int get(int index) {
        // returns the item at location index of the lsit
	return data[index];
    }
    
    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 
	int old=data[index];
	data[index]=i;
	return old;
	}
    public String toString() {
	       	String s = "";
	      	for (int i=0;i<data.length;i++)
		      	s = s  + data[i]+", ";
			return s;
		}
    public int remove(int index){
        // removes the item at index i
        // returns the old value
        
	int[] result= new int[data.length];
        for (int x=0;x<index;x++){
	    result[x]=data[x];
	}
	for (int x=index+1; x<data.length;x++){
	    result[x-1]=data[x];
	}
	data=result;
	return data[index];
    }
    
}
