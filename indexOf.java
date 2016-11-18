//author Amirhossein

public int indexOf(int element){
	Node index = head;
	int count = 0;
	while(index != null){
		if(index.data == element){
			return count;
	}
		else{
			index = index.next;
			count++;
		}
	}
	return -1;
}
