//author Amirhossein

public LinkedList sortConcat(LinkedList l1, LinkedList l2){
		LinkedList l3 = new LinkedList();
		Node p = l1.head;
		Node q = l2.head;
		while(p != null && q != null){
			if(p.data > q.data){
				l3.addLast(q.data);
				q = q.next;
			}
			else{
			l3.addLast(p.data);
			p = p.next;
			}
		}
			while(q != null || p != null){
				if(q != null){
					l3.addLast(q.data);
					q = q.next;
				}
				else{
					l3.addLast(p.data);
					p = p.next;
				}
		}
			return l3;
	}

