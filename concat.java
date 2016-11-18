//author Amirhossein

public LinkedList concat(LinkedList l1, LinkedList l2){
		LinkedList l3 = new LinkedList();
		Node p = l1.head;
		Node p2 = l2.head;
		l3.addLast(p.data);
		while(p.next != null){
			p = p.next;
			l3.addLast(p.data);
		}
		l3.addLast(p2.data);
		while(p2.next != null){
			p2 = p2.next;
			l3.addLast(p2.data);
		}
		return l3;
	}

