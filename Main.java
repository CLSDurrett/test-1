class Main {
  public static void main(String[] args) {
    int x = 0;
		int y = 0;
		
		for(int i=0; i<20; i++){
			x++;

			if((x==4)||(x==6)||(x==8)){
				System.out.println("goteem");
			}
			if(x<12 && x>3){
				y+=5;
				System.out.println(y);
			}
		}
  }
}