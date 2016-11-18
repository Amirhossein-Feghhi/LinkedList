public int lastIndexOf(int element){
		Node index = head;
		int count = 0;
		for(int i = 0 ; i < size ; i++){
			if(index.data == element)
				count = i;
			index = index.next;

	}
		return count;
}
