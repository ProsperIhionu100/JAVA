enum Days{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
enum KitchenEquipment{
    Blender,Dehydrator,Cooker, Grater, Juicer,
    Microwave,Air_fryer,Dish_washer,Freezer
}
enum FarmEquipment{
    Hoe, Cutlass, Rake, tractor,Shovel
}

public class enumclass {
    public static void main(String[] args) { 
       KitchenEquipment cook = KitchenEquipment.Cooker;
       System.out.println(cook); 

       Days day = Days.Monday;
       System.out.println(day); 

       FarmEquipment farm =FarmEquipment.Hoe;
       System.out.println(farm);
    }
}
