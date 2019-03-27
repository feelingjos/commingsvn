package tech.unizone.foundation.components.matomo;

import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wuhuahao
 * @Date: 2019/2/22 14:56
 * @Description:
 */
public class MatomoApi {

    /**
     * 根据url 分装参数 请求 返回List
     * @param url
     * @param param
     * @param t
     * @param <T>
     * @return
     */
    public static  <T> List<T> getArrayReportApi(String url, Map<String,Object> param, Class t){
        try {
            String response = HttpRequest.post(url).form(param).timeout(300000).execute().body();
            JSONArray objects = JSONUtil.parseArray(response);
            List<T> date = JSONUtil.toList(objects,t);
            return response == null ? null : date;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据url 请求，返回数据对象
     * 某客户最后访问页面
     * url example https://matomo.shuangkuai.co/?module=API&method=Live.getVisitorProfile&idSite=2&period=month&date=today&format=JSON&token_auth=1f3ec313a318e484cc29535b0e363855&segment=customVariableValue4==107&limitVisits=1
     * @param url
     * @param param
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getOjbReportApi(String url, Map<String,Object> param, Class t){
        try {
            String body = HttpRequest.post(url).form(param).timeout(300000).execute().body();
            return (T) JSONUtil.parseObj(body).toBean(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * url example :http://matomo.shuangkuai.co/?module=API&method=VisitsSummary.getUniqueVisitors&idSite=2&period=month&date=today&format=JSON&token_auth=1f3ec313a318e484cc29535b0e363855&segment=customVariableValue30==4ffbd15965bb4eccace7c7528d2d6afe;actionUrl=@modules/mall/index
     * 某门店30天内商城页面访问用户数(UV)：
     * @param url
     * @param param
     * @return
     */
    public static Integer getCountReportApi(String url, Map<String,Object> param){
        try {
            String body = HttpRequest.post(url).contentType("application/json;charset=utf-8").form(param).timeout(300000).execute().body();
            JSONObject jsonObject = JSONUtil.parseObj(body);
            return (Integer)jsonObject.get("value");
        } catch (HttpException e) {
            e.printStackTrace();
        }
        return null;
    }

}
