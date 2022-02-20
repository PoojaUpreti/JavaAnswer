import java.util.Scanner;

import java.time.format.DateTimeFormatter;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.io.IOException;

import java.time.LocalDateTime;
public class exercise2 {

    public static void main(String args[])

    {

        Bank bank = new Bank();

        SBI sbi = new SBI();

        BOI boi = new BOI();

        ICICI icici = new ICICI();

        bank.setdetails(2);

        sbi.setdetails(3);

        boi.setdetails(4);

        icici.setdetails(5);

        bank.printdetails();

        sbi.printdetails();

        boi.printdetails();

        icici.printdetails();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the option in which Bank you want to have Transaction");

        System.out.println("Press 1 for SBI");

        System.out.println("Press 2 for BOI");

        System.out.println("Press 3 for ICICI");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        int option = in.nextInt();

        switch(option)

        {

            case 1 :

                System.out.println("Current Balance :-" + sbi.balance());

                System.out.println("Enter the Amount to be withdrawn:-");

                int amount=in.nextInt();

                sbi.withdraw(amount);

                System.out.println("Current Balance :-" + sbi.balance());

                File myFile = new File("SBI.txt");

                try {

                    myFile.createNewFile();

                    System.out.println("Passbook Of SBI");

                } catch (IOException e) {

                    e.printStackTrace();

                }

                try {

                    FileWriter fileWriter = new FileWriter("SBI.txt");

                    fileWriter.write("Current Balance :-" +sbi.balance()+","+ "Amount Withdrawn :-" +amount+" "+"Date:-" +dtf.format(now));

                    fileWriter.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

                try {

                    Scanner sc = new Scanner(myFile);

                    while(sc.hasNextLine()){

                        String line = sc.nextLine();

                        System.out.println(line);

                    }

                    sc.close();

                } catch (FileNotFoundException e) {

                    e.printStackTrace();

                }

                break;

            case 2:

                System.out.println("Current Balance :-" + boi.balance());

                System.out.println("Enter the Amount to be withdrawn:-");

                int amounts=in.nextInt();

                boi.withdraw(amounts);

                System.out.println("Current Balance :-" + boi.balance());

                File myFile2 = new File("BOI.txt");

                try {

                    myFile2.createNewFile();

                    System.out.println("PassBook of BOI");

                } catch (IOException e) {

                    e.printStackTrace();

                }

                try {

                    FileWriter fileWriter = new FileWriter("BOI.txt");

                    fileWriter.write("Current Balance :-" +boi.balance()+","+ "Amount Withdrawn :-" +amounts+" "+"Date:-" +dtf.format(now));

                    fileWriter.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

                try {

                    Scanner sc = new Scanner(myFile2);

                    while(sc.hasNextLine()){

                        String line = sc.nextLine();

                        System.out.println(line);

                    }

                    sc.close();

                } catch (FileNotFoundException e) {

                    e.printStackTrace();

                }

                break;

            case 3:

                System.out.println("Current Balance :-" + icici.balance());

                System.out.println("Enter the Amount to be withdrawn:-");

                int amountz=in.nextInt();

                icici.withdraw(amountz);

                System.out.println("Current Balance :-" + icici.balance());

                File myFile3= new File("ICICI.txt");

                try {

                    myFile3.createNewFile();

                    System.out.println("Passbook Of ICICI");

                } catch (IOException e) {

                    e.printStackTrace();

                }

                try {

                    FileWriter fileWriter = new FileWriter("ICICI.txt");

                    fileWriter.write("Current Balance :-" +icici.balance()+","+ "Amount Withdrawn :-" +amountz+" "+"Date:-" +dtf.format(now));

                    fileWriter.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

                try {

                    Scanner sc = new Scanner(myFile3);

                    while(sc.hasNextLine()){

                        String line = sc.nextLine();

                        System.out.println(line);

                    }

                    sc.close();

                } catch (FileNotFoundException e) {

                    e.printStackTrace();

                }

                break;

            case 4:

                System.exit(0);

            default:

                System.out.println("Enter Valid Input");

        }



    }


}

