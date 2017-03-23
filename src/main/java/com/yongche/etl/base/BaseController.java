package com.yongche.etl.base;

import com.yongche.etl.entity.ResponseMessage;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * Created by wenxuelin on 2017/1/5.
 */
public abstract class BaseController<T> {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    protected T model;
    protected ResponseMessage<T> responseMessage;
    protected ModelMap viewMap = new ModelMap();

    /**
     * 方法返回code
     */
    protected static final String SUCCESS = "success";
    protected static final String ERROR = "error";

    /**
     * 方法返回提示消息，如果错误，直接返回错误堆栈信息
     */
    protected static final String MESSAGE_CREATE_SUCCESS = "增加成功";
    protected static final String MESSAGE_SHOW_SUCCESS = "查看成功";
    protected static final String MESSAGE_SEARCH_SUCCESS = "查询成功";
    protected static final String MESSAGE_DELELE_SUCCESS = "删除成功";
    protected static final String MESSAGE_UPDATE_SUCCESS = "修改成功";


    /**
     * 支持框架内,界面命名定义规则，如框架只提供reset服务则保留使用
     */
    protected static final String PAGE_INDEX ="index";    //首页
    protected static final String PAGE_EDIT ="edit";      //编辑界面
    protected static final String PAGE_SHOW ="show";      //查看界面
    protected static final String PAGE_EDITNEW ="editNew";//新增界面

    @ModelAttribute
    private void prepare(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        this.request = request;
        this.response = response;
        this.session = session;
    }

    @ModelAttribute
    private void prepare(T model, ModelMap dataMap) {
        this.model = model;
        responseMessage = new ResponseMessage<T>();
        viewMap = dataMap;
    }

    /**
     * 返回首页
     * @return
     */
    @RequestMapping(value="", method= RequestMethod.GET)
    public abstract String index();

    /**
     * 查询方法
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/search", method=RequestMethod.POST, params="search=true")
    public abstract @ResponseBody String search() throws Exception;

    /**
     * 增加方法
     * @return
     */
    @RequestMapping(value="", method=RequestMethod.POST)
    public abstract @ResponseBody String create();

    /**
     * 查看方法
     * @return
     */
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public abstract @ResponseBody String show();

    /**
     * 跳转编辑界面
     * @return
     */
    @RequestMapping(value="/{id}/edit", method=RequestMethod.GET)
    public abstract String edit();

    /**
     * 跳转新增界面
     * @return
     */
    @RequestMapping(value="/new", method=RequestMethod.GET)
    public abstract String editNew();

    /**
     * 修改方法
     * @return
     */
    @RequestMapping(value="/{id}", method= RequestMethod.PUT)
    public abstract @ResponseBody String update();

    /**
     * 删除方法
     * @return
     */
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public abstract @ResponseBody
    String destroy();

    protected void setResponseMessage(String code, String message, T content) {
        responseMessage.setCode(code);
        responseMessage.setMessage(message);
        responseMessage.addContent(content);
    }

    protected void setResponseMessage(List<T> content, String code, String message) {
        responseMessage.setCode(code);
        responseMessage.setMessage(message);
        responseMessage.setContent(content);
    }

    protected void setResponseErrorMessage(String code, String errorMessage) {
        responseMessage.setCode(code);
        responseMessage.setMessage(errorMessage);
    }
}
