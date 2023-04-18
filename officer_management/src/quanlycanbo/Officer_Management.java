package quanlycanbo;

import cac_chuc_vu.CanBo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Officer_Management {
    private List<CanBo> officers;

    public Officer_Management() {
        this.officers = new ArrayList<>();
    }
    public void addOfficer(CanBo canBo){
        CanBo exist = this.officers
                .stream()
                .filter(officer -> officer.getName().equals(canBo.getName()))
                .findFirst()
                .orElse(null);
        if(exist != null){
            System.out.println("Can Bo da ton tai");
        }
        else {
            System.out.println("Them thanh cong");
            this.officers.add(canBo);
        }
    }
    public void searchOfficerByName(String name){
        List<CanBo> results =  this.officers
                .stream()
                .filter(officer -> officer.getName().contains(name))
                .collect(Collectors.toList());
        if(results.size() == 0){
            System.out.println("Not found");
        }else {
            for(CanBo canBo : results){
                System.out.println(canBo);
            }
        }
    }
    public void showInfoOfficer(){
        this.officers.forEach(officer -> System.out.println(officer.toString()));
    }
    public String lastName(String name){
        String[] arrName = name.split("\\s+");
        return arrName[arrName.length-1];
    }
    public void compareName(){
        Collections.sort(this.officers, new Comparator<CanBo>(){
            @Override
            public int compare(CanBo s1, CanBo s2) {
                int result = lastName(s1.getName()).compareTo(lastName(s2.getName()));
                if(result == 0){
                    String[] arrS1 = s1.getName().split("\\s+");
                    String[] arrS2 = s2.getName().split("\\s+");
                    result = Integer.compare(arrS1.length, arrS2.length);
                }
                return result;
            }
        });
        showInfoOfficer();
    }
}
