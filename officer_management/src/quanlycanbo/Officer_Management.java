package quanlycanbo;

import cac_chuc_vu.CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Officer_Management {
    private List<CanBo> officers;

    public Officer_Management() {
        this.officers = new ArrayList<>();
    }
    public void addOfficer(CanBo canBo){
        this.officers.add(canBo);
    }
    public void searchOfficerByName(String name){
        List<CanBo> results =  this.officers.stream().filter(officer -> officer.getName().contains(name)).collect(Collectors.toList());
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
}
