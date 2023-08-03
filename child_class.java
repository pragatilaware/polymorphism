package package1;

public class child_class extends parent_class {
	public static void main(String[] args)
	{
		child_class obj=new child_class();
		obj.swapWithThirdVariable(44, 66);
		obj.swapWithoutThirdVariable(44, 22);
	}
	@Override
    public void swapWithoutThirdVariable(int a,int b)
	{
        System.out.println("Overridden method:- Without using third variable");
        System.out.println("Before swapping: a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+",b="+b);
    }


}
