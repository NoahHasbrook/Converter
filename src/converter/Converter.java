package converter;//THIS PROGRAM WAS WRITTEN BY NOAH HASBROOK
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tempT[] = {" Celsius "," Fahrenheit "," Kelvin ","this be noah's"};
        String areaT[] = {" Square miles "," Acres "," Square Kilometers ","this be noah's"};
        double temp;
        double tempF;
        double area;
        double areaF;
        int tempOT;
        int tempDT;
        int areaOT;
        int areaDT;
        System.out.println("What do you wish to convert? \n 1-Temperature \n 2-Area");
        int choiceC = in.nextInt();
        switch(choiceC){
            case 1://Temperature
                System.out.println("Please input the numerical value the temperature.");
                temp = in.nextDouble();
                System.out.println("What is the original temperature type? \n 1-"+tempT[0]+"\n 2-"+tempT[1]+"\n 3-"+tempT[2]);
                tempOT = in.nextInt();
                System.out.println("What is the desired temperature type? \n 1-"+tempT[0]+"\n 2-"+tempT[1]+"\n 3-"+tempT[2]);
                tempDT = in.nextInt();
                if(tempDT==tempOT){System.exit(0);}
                switch(tempOT){
                    case 1://celcius
                        if(tempDT==2){tempF =(temp*1.8)+32; System.out.println("The converted temperature is "+(int)tempF+tempT[1]);}
                        else{tempF =temp+273.15; System.out.println("The converted temperature is "+(int)tempF+tempT[2]);}
                        break;
                    case 2://fahrenheit
                        if(tempDT==1){tempF =(temp-32)/1.8; System.out.println("The converted temperature is "+(int)tempF+tempT[0]);}
                        else{tempF =((temp-32)/1.8)+273.15; System.out.println("The converted temperature is "+(int)tempF+tempT[2]);}
                        break;
                    case 3://kelvin
                        if(tempDT==1){tempF =temp-273.15; System.out.println("The converted temperature is "+(int)tempF+tempT[0]);}
                        else{tempF =((temp-273.15)*1.8)+32; System.out.println("The converted temperature is "+(int)tempF+tempT[1]);}
                        break;
                }
                break;
            case 2://Area
                System.out.println("Please input the numerical value the area.");
                area = in.nextDouble();
                System.out.println("What is the original area type? \n 1-"+areaT[0]+"\n 2-"+areaT[1]+"\n 3-"+areaT[2]);
                areaOT = in.nextInt();
                System.out.println("What is the desired area type? \n 1-"+areaT[0]+"\n 2-"+areaT[1]+"\n 3-"+areaT[2]);
                areaDT = in.nextInt();
                if(areaDT==areaOT){System.exit(0);}
                switch(areaOT){
                    case 1://Spuare miles
                        if(areaDT==2){areaF =area*640; System.out.println("The converted area is "+(int)areaF+areaT[1]);}
                        else{areaF =area/0.38610; System.out.println("The converted area is "+(int)areaF+areaT[2]);}
                        break;
                    case 2://Acres
                        if(areaDT==1){areaF =area/640.00; System.out.println("The converted area is "+(int)areaF+areaT[0]);}
                        else{areaF =(area/640)/0.38610; System.out.println("The converted area is "+(int)areaF+areaT[2]);}
                        break;
                    case 3://Square kilometers
                        if(areaDT==1){areaF =area*0.38610; System.out.println("The converted area is "+(int)areaF+areaT[0]);}
                        else{areaF =(area*0.38610)*640; System.out.println("The converted area is "+(int)areaF+areaT[1]);}
                        break;
                }
                break;
            default:
                System.out.println("How dare you think you are so far above everyone else that you \n think you can just run around and not follow the given parameters.");
                System.exit(0);
        }
}}