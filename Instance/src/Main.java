class Instance
{
    public String apple; // Declared instance variable

    public Instance()
    {//Default constructor

        this.apple = "Iphone 14"; //initializing Instance variable
    }
    //Main Method
    public static void main(String[] args)
    {
        //object creation
        Instance name = new Instance();
        // Displaying O/P
        System.out.println("apple Phone name is : " + name.apple);
    }

}