package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subdomain {


    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> l1 = new ArrayList<>();
        HashMap<String,Integer> domainMap =new HashMap<String, Integer>() ;
        for(String strval:cpdomains){
            String[] valAndStr = strval.split(" ");
            Integer fitsVal = Integer.parseInt(valAndStr[0]);
            String dommianname = valAndStr[1];
            if (domainMap.containsKey(dommianname)) {
                Integer val = domainMap.get(dommianname);
                domainMap.put(dommianname, val + fitsVal);
            } else {
                domainMap.put(dommianname, fitsVal);
            }
            String[] arrstr = dommianname.split("\\.", 2);

            while (arrstr.length>1) {
                if (domainMap.containsKey(arrstr[1])) {
                    Integer val = domainMap.get(arrstr[1]);
                    domainMap.put(arrstr[1], val + fitsVal);
                } else {
                    domainMap.put(arrstr[1], fitsVal);
                }
                arrstr = arrstr[1].split("\\.", 2);
            }
        }
        for (HashMap.Entry<String,Integer> entry : domainMap.entrySet()){
            StringBuilder strb =new StringBuilder();
            strb.append(entry.getValue()+" "+entry.getKey());
            l1.add(strb.toString());
        }


        return l1;
    }
}
