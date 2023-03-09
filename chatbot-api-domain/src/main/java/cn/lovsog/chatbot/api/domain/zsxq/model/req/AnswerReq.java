package cn.lovsog.chatbot.api.domain.zsxq.model.req;

/**
 * @author Lovsog
 * 2023/3/9
 **/
public class AnswerReq {
    private ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }

}