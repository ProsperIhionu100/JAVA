class Parent{
    int numbers [];  //Declaration
    float [] figures = new float[5]; // Declaration and Limits
    void PrintArray(){
        numbers[0] = 12;
        numbers[1] = 22;
        numbers[2] = 32;
        numbers[3] = 2;
        numbers[4] = 52;

        figures[0] = 23.3f;
        figures[1] = 67.3f;
        figures[2] = 45.3f;
        figures[3] = 12.3f;
        figures[4] = 27.3f;

    //     String names [] = new String[4];
    //     names[0] = "kelvin";
    //     names[1] = "Prosper";
    //     names[2] = "Joshua";
    //     names[3] = "Joseph";

    //     for (int i=0; i<figures.length; i++){
    // System.out.println(figures[i]);
    //         }
    }



// public class array_demo {
    public static void main(String[] args) {
        // Parent pr = new Parent();
        // pr.PrintArray();

        String names [] = new String[4];
        names[0] = "kelvin";
        names[1] = "Prosper";
        names[2] = "Joshua";
        names[3] = "Joseph";

        for (int i=0; i<names.length; i++){
        System.out.println(names[i]);
            }
    }
}
