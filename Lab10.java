// Your name here: Taranveer Singh

package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Lab10{
	public static void main(String[] args){
		ArrayList<String> alist = new ArrayList<String>();
		Stack<Integer> st = new Stack<Integer>();			
		final int n = 10;
		for(int i = 0; i < n; i++){
			alist.add(Integer.toString(i));
			st.push(i);
		}
	
		Iterator<String> itArr = alist.iterator();
        pn("ArrayList iterator contents:");
        while (itArr.hasNext()) {
            p(itArr.next());
        }
        pn("");  

        Iterator<Integer> itStack = getStackIterator(st);
        pn("Stack iterator contents (LIFO):");
        while (itStack.hasNext()) {
            p(itStack.next());
        }
        pn(""); 
    }
	
	public static Iterator<Integer> getStackIterator(Stack<Integer> st){
		Stack<Integer> temp = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
    
        while(!st.isEmpty()){
            int value = st.pop();   
            temp.push(value);       
            list.add(value);       
        }
        
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        
        return list.iterator();
    }   	

	public static <E> void p(E item){
		System.out.print(item + " ");
	}
	
	public static <E> void pn(E item){
		System.out.println(item);
	}
}