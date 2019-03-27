package tech.unizone.foundation.components.telecomcoupon.utils;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: wuhuahao
 * @Date: 2019/2/13 11:25
 * @Description: map key按字母排序
 */
public class MapUtils {

    /**
     * map排序
     * @param map
     * @return
     */
    public static Map<String,Object> beanMap(Map<String,Object> map){
        Map<String, Object> maps = new TreeMap<>((o1,o2)->{
            //升序
            return o1.compareTo(o2);
        });
        maps.putAll(map);
        return maps;
    }

    /*public static List search(String name, List list){
        List results = new ArrayList();
        Pattern pattern = Pattern.compile(name);
        for(int i=0; i < list.size(); i++){
            Matcher matcher = pattern.matcher(list.get(i).toString());
            if(matcher.find()){
                results.add(list.get(i));
            }
        }
        return results;
    }*/

}
