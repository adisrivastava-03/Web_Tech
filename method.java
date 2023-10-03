class method{
    void display(){
        System.out.println("Method without Parameters");;
    }
    void display(int a){
        System.out.println("Method with 1 parameter");
        System.out.println("No.= "+a);
    }
    void display(int a, int b){
        System.out.println("Method with 2 parameter");
        System.out.println("SUM= "+(a+b));
    }
}
class inher extends method{
    void t1(){
        System.out.println("Hello");
    }
}

class test{
    public static void main(String args[]){
        inher obj=new inher();
        System.out.println("\n");
        obj.display();
        obj.display(34);
        obj.display(7,8);

    }
}
