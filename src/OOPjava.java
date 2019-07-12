import java.util.*;
class SinhVien{
    public int diem;
    public String name;
    public SinhVien(int diem, String name){
        this.diem = diem;
        this.name = name;
    }
    public int getDiem(){
        return this.diem;
    }
    public String getName(){
        return this.name;
    }
}
class DiemComparator implements Comparator <SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getDiem()-o2.getDiem();
    }
}
public class OOPjava  {
    public static void main(String[] args) {
        List<SinhVien> myList = new ArrayList<>();
        myList.add(new SinhVien(1,"Kam"));
        myList.add(new SinhVien(4,"kaka"));
        myList.add(new SinhVien(2,"laos"));
        Collections.sort(myList,new DiemComparator());
        for(SinhVien sv:myList){
            System.out.println(sv.getDiem()+" - "+sv.getName());
        }
    }

}
