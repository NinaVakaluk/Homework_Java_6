import java.util.*;
import java.util.Map.Entry;

public class task1 {
    public static void main(String[] args)  {
        laptop lap1= new laptop("BDR-WDH","Honor");
        lap1.setRAM(8);
        lap1.setROM(512);
        lap1.setOS("Windows");
        lap1.setColor("Grey");
        
        laptop lap2= new laptop("RLEF-X ","Huawei");
        lap2.setRAM(16);
        lap2.setROM(512);
        lap2.setOS("Windows");
        lap2.setColor("Grey");
        
        laptop lap3= new laptop("15ITL05","Lenovo");
        lap3.setRAM(8);
        lap3.setROM(256);
        lap3.setOS("Windows");
        lap3.setColor("Black");
        
        laptop lap4= new laptop("M6500QH","Asus");
        lap4.setRAM(16);
        lap4.setROM(512);
        lap4.setOS("Linux");
        lap4.setColor("White");

        HashSet <laptop> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4));
        HashSet <laptop> res = new HashSet<>();


        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - Цвет \n 5 - поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
            if(n==1){
                System.out.println("Введите ОЗУ");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if(n==2){
                System.out.println("Введите объем ЖД" );
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("ROM", temp);
            }
            if(n==3){
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if(n==4){
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n 5 - показать результат \n");
            n = sc.nextInt();
            sc.nextLine();
        }

            for (Entry<String, Object> entry : filters.entrySet()) {
                if(entry.getKey().equals("RAM")){
                    Iterator it = laptops.iterator();
                    while(it.hasNext()){
                        laptop lap = (laptop) it.next();
                        if(lap.getRAM()>=(Integer)entry.getValue()){
                            res.add(lap);
                        }
                    }
                    }
                 if(entry.getKey().equals("ROM")){
                    Iterator it = laptops.iterator();
                    while(it.hasNext()){
                        laptop lap = (laptop)it.next();
                        if(lap.getROM()>=(Integer)entry.getValue()){
                            res.add(lap);
                        }
                    }
                }
                if(entry.getKey().equals("OS")){
                    Iterator it = laptops.iterator();
                    while(it.hasNext()){
                        laptop lap = (laptop)it.next();
                            if(lap.getOS().equals(entry.getValue())){
                                res.add(lap);
                            }
                    }
                }
                if(entry.getKey().equals("Color")){
                    Iterator it = laptops.iterator();
                    while(it.hasNext()){
                        laptop lap = (laptop)it.next();
                            if(lap.getColor().equals(entry.getValue())){
                                res.add(lap);
                            }
                    }
                }
                }
            
                Iterator it = res.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                System.out.println(lap.toString());
                System.out.println();
                }
            
            
    }
}


    


