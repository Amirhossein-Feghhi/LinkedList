//author Amirhossein

public boolean contains(int element){
	Node tmp = head;
	if(tmp.data != element){
	for(int i = 1 ; i < size ; i++){
		tmp = tmp.next;
		if(tmp.data == element)
			return true;
	}
	return false;
	}
	return true;
}
