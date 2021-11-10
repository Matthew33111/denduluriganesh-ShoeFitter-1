package untitled.src.Model;

public class TestStyle {
    public TestStyle(){
        testStyleClass();
    }
    public static void testStyleClass(){
        System.out.println("Testing Style Class");
        Style s1 = new Style();
        if(s1 != null){
            System.out.println(s1.getColor());
            System.out.println(s1.getModel());
            System.out.println(s1.getBrand());
            System.out.println(s1.getMaterial());
            System.out.println(s1.getSole());
            System.out.println(s1.getSize());
        }
        else{
            System.out.println("There was an issue testing Style class");
        }
        s1.setColor("Black");
        s1.setModel("Revolution");
        s1.setBrand("Nike");
        s1.setMaterial("Canvas");
        s1.setSole("Rubber");
        s1.setSize("12");

        System.out.println(s1.toString());

    }
}
