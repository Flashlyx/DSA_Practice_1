package Java_Concepts.Object_Class;

public class ToStringOverRiding { // By default, it " extends Object(class)

    int std_id;
    String std_name;
    char std_section;

    ToStringOverRiding(int id, String name, char section){
        this.std_id = id;
        this.std_name = name;
        this.std_section = section;
    }

    @Override
    public String toString(){
        return this.std_id +" "+ this.std_name +" "+ this.std_section;
    }

    public static void main(String[] args) {
        ToStringOverRiding std_1 = new ToStringOverRiding(1,"Logan",'A');
        System.out.println(std_1); // By default, it has toString method = "std_1.toString()"

//      System.out.println("Id : " + std_1.std_id + ", Name : " + std_1.std_name + ",  Section : " + std_1.std_section);

        ToStringOverRiding std_2 = new ToStringOverRiding(2,"Jack",'B');
        System.out.println(std_2);
    }

}
