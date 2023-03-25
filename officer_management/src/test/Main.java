package test;

import cac_chuc_vu.*;
import quanlycanbo.Officer_Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Officer_Management officerList = new Officer_Management();
        int choose = 0;
        do {
            System.out.println("Application Manager Officer");
            System.out.println("1: To insert officer");
            System.out.println("2. To search officer by name");
            System.out.println("3. To show information officers");
            System.out.println("0. To exit");
            choose = sc.nextInt();
            switch (choose){
                case 1: {
                    System.out.println("1. To insert Engineer");
                    System.out.println("2. To insert Worker");
                    System.out.println("3. To insert Staff");
                    sc.nextLine();
                    String type = sc.nextLine();
                    switch (type){
                        case "worker": {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter age: ");
                            int age = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter gender: ");
                            GioiTinh gender = GioiTinh.valueOf(sc.nextLine().toUpperCase());
                            System.out.println("Enter address");
                            String address = sc.nextLine();
                            System.out.println("Enter level: ");
                            int level = sc.nextInt();
                            BacCongNhan bacCongNhan = null;
                            for (BacCongNhan bac : BacCongNhan.values()) {
                                if (bac.getValue() == level) {
                                    bacCongNhan = bac;
                                    break;
                                }
                            }
                            CanBo worker = new CongNhan(name, age, gender, address, bacCongNhan);
                            officerList.addOfficer(worker);
                            break;
                        }
                        case "engineer": {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter age: ");
                            int age = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter gender: ");
                            GioiTinh gender = GioiTinh.valueOf(sc.nextLine().toUpperCase());
                            System.out.println("Enter address");
                            String address = sc.nextLine();
                            System.out.println("Enter branch: ");
                            String branch = sc.nextLine();
                            CanBo kySu = new KySu(name, age, gender, address, branch);
                            officerList.addOfficer(kySu);
                            break;
                        }
                        case "staff": {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter age: ");
                            int age = sc.nextInt();
                            sc.nextLine();
                            GioiTinh gender = null;
                            while(gender == null){
                                try{
                                    System.out.println("Enter gender: ");
                                    gender = GioiTinh.valueOf(sc.nextLine().toUpperCase());
                                }
                                catch (IllegalArgumentException e){
                                    System.out.println("INVALID");
                                }
                            }
                            System.out.println("Enter address");
                            String address = sc.nextLine();
                            System.out.println("Enter task: ");
                            String task = sc.nextLine();
                            CanBo nhanVien = new NhanVien(name, age, gender, address, task);
                            officerList.addOfficer(nhanVien);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    sc.nextLine();
                    System.out.println("Enter name to search: ");
                    String name = sc.nextLine();
                    officerList.searchOfficerByName(name);
                    break;
                }
                case 3: {
                    officerList.showInfoOfficer();
                    break;
                }
                case 0: {
                    return;
                }
            }
        } while (choose != 0);
    }
}