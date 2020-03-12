public class LinksStub {
	public static void main(String args[]) {
		int links_count = 5;
		int nodes_in_links = 4;
		Links[] link_arr = new Links[links_count];
		for (int i = 0; i < link_arr.length; i++){
			Links link = new Links();
			int pos = 0;
			for (int j=nodes_in_links*i; j < nodes_in_links*i + nodes_in_links; j++){
				link.insertNode(pos, j);
				pos++;
			}
			link_arr[i] = link;
		}
		for (int i = 0; i < link_arr.length; i++){
			link_arr[i].displayNodes();
		}
		/*
		link_arr[0].removeNode(2);
		link_arr[1].removeNode(4);
		link_arr[2].removeNode(11);
		link_arr[3].removeNode(15);
		link_arr[4].removeNode(16);
		*/
		System.out.println("-----------------------------------");
		for (int i = 0; i < link_arr.length; i++){
			link_arr[i].reverseList();
		}

		for (int i = 0; i < link_arr.length; i++){
			link_arr[i].displayNodes();
		}

		System.out.println("-----------------------------------");

		/* make another call to reverseList and displayNodes here ...
			this call will reverse the list again.
		*/
		
		

	} 

	

} //LinkedListTester
