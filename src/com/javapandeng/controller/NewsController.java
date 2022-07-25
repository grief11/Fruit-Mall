package com.javapandeng.controller;

import com.javapandeng.base.BaseController;
import com.javapandeng.po.News;
import com.javapandeng.service.NewsService;
import com.javapandeng.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 公告管理
 */
@Controller
@RequestMapping("/news")
public class NewsController extends BaseController {
    @Autowired
    NewsService newsService;

    @RequestMapping("/findBySql")
    public String findBySql(News news, Model model){
        String sql = "select * from news where 1=1 ";
        if (!isEmpty(news.getId())){
            sql +=" and name like '%"+news.getId()+"%' ";
        }
        sql+=" order by id desc";
        Pager<News> pagers = newsService.findBySqlRerturnEntity(sql);
        model.addAttribute("pagers",pagers);
        model.addAttribute("obj",news);
        return "news/news";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/add")
    public String add(){
        return "news/add";
    }

    /**
     * 添加执行
     * @param news
     * @return
     */
    @RequestMapping("/exAdd")
    public String exAdd(News news) {
        news.setAddTime(new Date());
        newsService.insert(news);
        return "redirect:/news/findBySql";
    }


    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     */
     @RequestMapping("/update")
    public String update(Integer id,Model model){
         News obj = newsService.load(id);
         model.addAttribute("obj",obj);
         return "news/update";
     }

    /**
     * 执行修改
     * @param news
     * @return
     */
    @RequestMapping("/exUpdate")
    public String exUpdate(News news){
        newsService.updateById(news);
        return "news/update";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        newsService.deleteById(id);
        return "redirect:/news/findBySql";
    }

    @RequestMapping("/list")
    public String list(Model model){
        Pager<News> pager = newsService.findByEntity(new News());
        model.addAttribute("pager",pager);
        return "news/list";
    }

    @RequestMapping("/view")
    public String view(Integer id,Model model){
        News obj = newsService.load(id);
        model.addAttribute("obj",obj);
        return "news/view";
    }
}
