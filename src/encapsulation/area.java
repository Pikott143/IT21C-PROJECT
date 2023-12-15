package encapsulation;

public class area {
     
    int length;
        int width;
        
        area (int length,int width){
            this.length = length;
            this.width = width;
                    
    }
    
        public void getArea(){
            int area = length+width;
            System.out.println("Area:"+area);
        }
}
