package com.supremepole.restful.controller;

import com.supremepole.restful.model.Website;
import com.supremepole.restful.model.BaseResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/website")
public class WebsiteController {
    // 创建线程安全的Map
    private static Map<Long, Website> websiteMap = Collections.synchronizedMap(new HashMap<Long, Website>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResponse<List<Website>> getWebsiteList() {
        // 处理"/website/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<Website> r = new ArrayList<>(websiteMap.values());
        return new BaseResponse<>(true, "查询列表成功", r);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BaseResponse<String> postWebsite(@ModelAttribute Website website) {
        // 处理"/website/"的POST请求，用来创建website
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        websiteMap.put(website.getId(), website);
        return new BaseResponse<>(true, "新增成功", "");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResponse<Website> getWebsite(@PathVariable Long id) {
        // 处理"/website/{id}"的GET请求，用来获取url中id值的website信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return new BaseResponse<>(true, "查询成功", websiteMap.get(id));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public BaseResponse<String> putWebsite(@PathVariable Long id, @ModelAttribute Website websiteParam) {
        // 处理"/website/{id}"的PUT请求，用来更新website信息
        Website website = websiteMap.get(id);
        website.setWebsitename(websiteParam.getWebsitename());
        website.setWebsiteurl(websiteParam.getWebsiteurl());
        websiteMap.put(id, website);
        return new BaseResponse<>(true, "更新成功", "");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResponse<String> deleteWebsite(@PathVariable Long id) {
        // 处理"/website/{id}"的DELETE请求，用来删除website
        websiteMap.remove(id);
        return new BaseResponse<>(true, "删除成功", "");
    }
}
