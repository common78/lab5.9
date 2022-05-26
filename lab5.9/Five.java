package Five;

public class Five {

	public static void main(String[] args) {
		int ten, ten1, one, one1;
        int a = 1;
        int h = 1;
        for (; h <=24; h++){
            ten = h/10;
            one = h%10;
            int s = 1;
            for(; s<=60; s++){
                ten1 = s/10;
                one1 = s%10;
                if(ten == one1 && ten1 == one){
                    System.out.println(ten+""+one+":"+ten1+""+one1);
                    a++;
                }
            }
        }
        System.out.println("Number of matches:"+a);

	}

}
