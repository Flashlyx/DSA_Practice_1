package DSA_Class_1;

public class String_Array_Op1 {
    String[] sarr = new String[5];

    public void traverse(){
        for (String s : sarr) {
            System.out.print(s + ", ");
        }
    }

    public void insertion(int index,String s){
        try{
            if( sarr[index] == null){
                sarr[index] = s;
                System.out.println("Element : '" + s +"' is inserted successfully !");
            }
            else{
                System.out.println("Block is already filled !");
            }
        }
        catch(Exception e){
            System.out.println("Invalid value !");
        }
    }

    public void deleteByIndex(int index){
        if (sarr[index] != null){
            sarr[index] = null;
            System.out.println("Value at given index is deleted successfully !");
        }
        else {
            System.out.println("the block is already empty !");
        }
    }

    public void deleteByValue(String s){
        try{
            for (int i = 0; i < sarr.length; i++){
                if (sarr[i].equals(s)){
                    sarr[i] = null;
                    System.out.println("Element : '"+s+"' is deleted successfully !");
                    break;
                }
                else {
                    System.out.println("the element is not found !");
                }
            }
        }
        catch (Exception e){
            System.out.println("Invalid element !");
        }
    }


    public static void main(String[] args) {

        String_Array_Op1 sa1 = new String_Array_Op1();

        sa1.traverse();

        //Insert
        System.out.println();System.out.println();
        sa1.insertion(0,"flash");
        System.out.println();
        sa1.insertion(1,"logan");
        System.out.println();
        sa1.insertion(2,"ryan");
        System.out.println();

        sa1.traverse();
        System.out.println();

        //Delete by Index
        sa1.deleteByIndex(2);
        System.out.println();
        sa1.deleteByIndex(4);

        sa1.traverse();

        System.out.println();

        //Delete by Value
        sa1.deleteByValue("flash");
        System.out.println();

        sa1.traverse();

    }


}
