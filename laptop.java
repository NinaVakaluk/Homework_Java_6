/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

Работу сдать как обычно ссылкой на гит репозиторий*/

public class laptop
{
    private int RAM;
    private int ROM;
    private String OS;
    private String color;
    private String brand;
    private String model;
    
    public laptop(String model, String brand)
    {
        this.RAM = RAM;
        this.ROM = ROM;
        this.OS = OS;
        this.color = color;
        this.model = model;
        this.brand = brand;
        System.out.println("Ноутбук  "+ this.brand +" Модель "+this.model+"");
    
    
    }  
    public Integer getRAM(){
        return this.RAM;
    }
    public Integer getROM(){
        return this.ROM;
    }
    public String getOS(){
        return this.OS;
    }
    public String getColor(){
         return this.color;
    }   
    public void setRAM(Integer RAM){
        this.RAM = RAM;
    }
    public void setROM(Integer ROM){
        this.ROM = ROM;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
    public void setColor(String color){
        this.color =color;
    }
    public String getModel(){
        return this.model;
    }
    public String getBrand(){
        return this.brand;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.brand);
        sb.append(System.lineSeparator());
        sb.append("Color "+this.color);
        sb.append(System.lineSeparator());
        sb.append("Model "+this.model);
        sb.append(System.lineSeparator());
        sb.append("OS "+this.OS);
        sb.append(System.lineSeparator());
        sb.append("ROM "+this.ROM);
        sb.append(System.lineSeparator());
        sb.append("RAM "+this.RAM);
        sb.append(System.lineSeparator());
        
        return(sb.toString());
    }

} 
    