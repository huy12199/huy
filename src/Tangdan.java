import java.util.Comparator;

public class Tangdan implements Comparator<HocSinh> {

    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        if(o1.getDtb() > o2.getDtb()){
            return 1;
        }else if(o1.getDtb() == o2.getDtb()){
            return 0;
        }else{
            return -1;
        }
    }
}
