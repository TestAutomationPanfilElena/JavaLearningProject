package org.panfil.classesandobjects.autoservicetask;

public class Tool {

   boolean needsElectricity;
   boolean isElevator;
   boolean isUsed;
   long uniquieCode;

   Tool(){
      System.out.println("A fost creat un instrument despre care nu se stie nimic");

   }
   Tool(long uniquieCode){
      uniquieCode = uniquieCode;
      System.out.println("A fost creat un nou instrument despre care se cunoaste numai codul");
   }






}
